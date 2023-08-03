package com.asm.Services;

import java.util.List;
import java.util.Optional;

import com.asm.Entity.Account;

public interface AccountService {
	List<Account> findAll();
	Optional<Account> findByUsernameAndPassword(String username , String password);
	Account getAccountByUsername(String username);
}
