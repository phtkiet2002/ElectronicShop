app.controller("authority-ctrl", function ($scope, $http, $location) {
    $scope.roles = [];
    $scope.admins = [];
    $scope.authorities = [];

    $scope.initialize = function () {

        //Load tất cả role
        $http.get("/api/roles").then(resp => {
            $scope.roles = resp.data;
        })

        //Load staffs , admin
        $http.get("/api/accounts?admin=true").then(resp => {
            $scope.admins = resp.data;
        })

        //Load authorities của staffs và admin
        $http.get("/api/authorities?admin=true").then(resp => {
            $scope.authorities = resp.data;
        }).catch(error => {
            $location.path("/unauthorized");

        })
    }


    $scope.authority_of = function (acc, role) {
        if ($scope.authorities) {
            return $scope.authorities.find(ur => ur.account.username === acc.username && ur.role.id === role.id);
        }
    }

    $scope.authority_changed = function (acc, role) {
        var authority = $scope.authority_of(acc, role);
        //Đã cấp quyền => Thu hồi quyền xóa
        if (authority) {
            $scope.revoke_authority(authority);
        }
        //Chưa được cấp quyền => Cấp quyền (Thêm mới)
        else {
            authority = {account: acc, role: role};
            $scope.grant_authority(authority);
        }
    }


    //Thêm mới authority
    $scope.grant_authority = function (authority) {
        $http.post(`/api/authorities`, authority).then(resp => {
            $scope.authorities.push(resp.data)
            alert("Cấp quyền sử dụng thành công");
        }).catch(error => {
            alert("Cấp quyền sử dụng thất bại");
            console.log("Error", error);
        })
    }

    //Xóa authority
    $scope.revoke_authority = function (authority) {
        $http.delete(`/api/authorities/${authority.id}`).then(resp => {
            var index = $scope.authorities.findIndex(a => a.id == authority.id);
            $scope.authorities.splice(index, 1);
            alert("Thu hồi quyền sử dụng thành công");
        }).catch(error => {
            alert("Thu hồi quyền sử dụng thất bại");
            console.log("Error", error);
        })
    }
    $scope.initialize();
});