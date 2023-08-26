package com.asm.Services;

import java.util.List;


import com.asm.Entity.Account;

public interface AccountService {
	List<Account> findAll();
	Account findById(String username);
	List<Account> getAdministrators();
}
