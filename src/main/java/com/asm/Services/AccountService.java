package com.asm.Services;

import java.util.List;

import com.asm.Entity.Account;

public interface AccountService {
	List<Account> findAll();
	
	Account getAccountByUsername(String username);
}
