package com.asm.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.asm.Entity.Account;
import com.asm.Reponsitory.AccountReponsitory;
import com.asm.Services.AccountService;

@CrossOrigin("*")
@RestController
@RequestMapping("api/account")
public class AccountAPI {
	@Autowired
	AccountService accountService;
	

	// http method: GET, POST, PUT, DELETE

	// localhost:8085/api/account/all
	@GetMapping("/all")
	public ResponseEntity<?> doGetAll() {
		List<Account> account = accountService.findAll();
		// http status code: 200, 201, 202, 400, 401, 403, 404, 500
		return ResponseEntity.ok(account);
	}
	
	
	@GetMapping("/username={username}")
	public ResponseEntity<?> getByUsername(@RequestParam("username") String username){
		Account account = accountService.getAccountByUsername(username);
		// http status code: 200, 201, 202, 400, 401, 403, 404, 500
		return ResponseEntity.ok(account);
				
	}
	
}
