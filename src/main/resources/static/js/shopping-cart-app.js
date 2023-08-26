const app = angular.module("shopping-cart-app",[]);

app.controller("shopping-cart-ctrl",function($scope,$http){
    $scope.cart = {
        items: [],
        add(id){
            var item = this.items.find(item => item.id ==id);
            if(item){
                item.qty++;
                this.saveToLocaleStorage();
            }else{
                $http.get(``)
            }
        }
    }
})