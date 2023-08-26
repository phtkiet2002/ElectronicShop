package com.asm.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.asm.Entity.Authority;
import com.asm.Services.AuthorityService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/authorities")
public class AuthorityAPI {
	@Autowired
	AuthorityService authorityService;

	// http method: GET, POST, PUT, DELETE

	// localhost:8085/api/authority/all
	@GetMapping()
	public ResponseEntity<?> doGetAll(@RequestParam("admin")Optional<Boolean> admin) {
		if (admin.orElse(false)){
			List<Authority> authorities = authorityService.findAuthoritiesOfAdministrators();
			return ResponseEntity.ok(admin);
		}
		List<Authority> authorities = authorityService.findAll();
		// http status code: 200, 201, 202, 400, 401, 403, 404, 500
		return ResponseEntity.ok(authorities);

	}

	@PostMapping
	public ResponseEntity<?> post(@RequestBody Authority authority){
		authorityService.create(authority);
		return ResponseEntity.ok(authority);
	}

	@DeleteMapping("{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Integer id){
		authorityService.delete(id);
		return ResponseEntity.ok().build();
	}

	
}
