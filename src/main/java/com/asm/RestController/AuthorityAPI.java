package com.asm.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.asm.Entity.Authority;
import com.asm.Services.AuthorityService;

@RestController
@RequestMapping("api/authority")
public class AuthorityAPI {
	@Autowired
	AuthorityService authorityService;

	// http method: GET, POST, PUT, DELETE

	// localhost:8085/api/authority/all
	@GetMapping("/all")
	public ResponseEntity<?> doGetAll() {
		List<Authority> authorities = authorityService.findAll();
		// http status code: 200, 201, 202, 400, 401, 403, 404, 500
		return ResponseEntity.ok(authorities);

	}

	@GetMapping("/id={id}")
	public ResponseEntity<?> getById(@RequestParam("id") Integer id) {
		Authority authority = authorityService.getAuthorityByID(id);
		// http status code: 200, 201, 202, 400, 401, 403, 404, 500
		return ResponseEntity.ok(authority);

	}
}
