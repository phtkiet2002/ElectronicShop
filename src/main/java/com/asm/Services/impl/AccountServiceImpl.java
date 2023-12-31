package com.asm.Services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asm.Entity.Account;
import com.asm.Reponsitory.AccountReponsitory;
import com.asm.Services.AccountService;

@Service
public class AccountServiceImpl implements AccountService{

	@Autowired
	AccountReponsitory accountReponsitory;
	
	@Override
	public List<Account> findAll() {
		return accountReponsitory.findAll();
	}

	@Override
	public Account findById(String username) {
		return accountReponsitory.findById(username).get();
	}

	@Override
	public List<Account> getAdministrators() {
		return accountReponsitory.getAdministrators();
	}

	

}
