package com.asm.Services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asm.Entity.Role;
import com.asm.Reponsitory.RoleReponsitory;
import com.asm.Services.RoleService;

@Service
public class RoleServiceImpl implements RoleService{
	@Autowired
	RoleReponsitory reponsitory;

	@Override
	public List<Role> findAll() {
		return reponsitory.findAll();
	}

	@Override
	public Role getRoleByID(String id) {
		return null;
	}
	
	
}
