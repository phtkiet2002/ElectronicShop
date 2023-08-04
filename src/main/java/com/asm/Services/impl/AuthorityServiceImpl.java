package com.asm.Services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asm.Entity.Authority;
import com.asm.Reponsitory.AuthorityReponsitory;
import com.asm.Services.AuthorityService;

@Service
public class AuthorityServiceImpl implements AuthorityService{

	@Autowired
	AuthorityReponsitory authorityReponsitory;
	
	@Override
	public List<Authority> findAll() {
		// TODO Auto-generated method stub
		return authorityReponsitory.findAll();
	}

	@Override
	public Authority getAuthorityByID(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
