package com.asm.Services.impl;

import java.util.List;

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
		// TODO Auto-generated method stub
		return accountReponsitory.findAll();
	}

	@Override
	public Account getAccountByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
