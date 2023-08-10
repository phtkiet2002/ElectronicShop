package com.asm.RestController;

import java.util.List;
import java.util.Optional;

import com.asm.Entity.Authority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.asm.Entity.Account;
import com.asm.Reponsitory.AccountReponsitory;
import com.asm.Services.AccountService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/accounts")
public class AccountAPI {
	@Autowired
	AccountService accountService;
	

	// http method: GET, POST, PUT, DELETE

	// localhost:8085/api/account/all
	@GetMapping()
	public ResponseEntity<?> doGetAll(@RequestParam("admin") Optional<Boolean> admin) {
		if (admin.orElse(false)){
			List<Account> account = accountService.getAdministrators();
			return ResponseEntity.ok(account);
		}
		List<Account> account = accountService.findAll();
		// http status code: 200, 201, 202, 400, 401, 403, 404, 500
		return ResponseEntity.ok(account);
	}



	
	
	
	
}
