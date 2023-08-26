package com.asm.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.asm.Entity.Role;
import com.asm.Services.RoleService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/roles")
public class RoleAPI {
	@Autowired
	RoleService roleService;

	// http method: GET, POST, PUT, DELETE

	// localhost:8085/api/role/all
	@GetMapping()
	public ResponseEntity<?> doGetAll() {
		List<Role> list = roleService.findAll();
		// http status code: 200, 201, 202, 400, 401, 403, 404, 500
		return ResponseEntity.ok(list);

	}
	
	@GetMapping("/id={id}")
	public ResponseEntity<?> getById(@RequestParam("id") String id){
		Role roles = roleService.getRoleByID(id);
		// http status code: 200, 201, 202, 400, 401, 403, 404, 500
		return ResponseEntity.ok(roles);
				
	}
}
