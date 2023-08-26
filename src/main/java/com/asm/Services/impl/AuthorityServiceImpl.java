package com.asm.Services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asm.Entity.Account;
import com.asm.Entity.Authority;
import com.asm.Reponsitory.AccountReponsitory;
import com.asm.Reponsitory.AuthorityReponsitory;
import com.asm.Services.AuthorityService;

@Service
public class AuthorityServiceImpl implements AuthorityService{

	@Autowired
	AuthorityReponsitory authorityReponsitory;
	@Autowired
	AccountReponsitory accountReponsitory;
	@Override
	public List<Authority> findAll() {
		// TODO Auto-generated method stub
		return authorityReponsitory.findAll();
	}

	public Authority create(Authority auth) {
		return authorityReponsitory.save(auth);
	}
	public void delete(Integer id) {
		authorityReponsitory.deleteById(id);
	}
	public List<Authority> findAuthoritiesOfAdministrators(){
		List<Account> accounts= accountReponsitory.getAdministrators();
		return authorityReponsitory.authoritiesOf(accounts);
	}

}
