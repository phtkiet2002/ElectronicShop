package com.asm.Services;

import java.util.List;

import com.asm.Entity.Role;

public interface RoleService {
	List<Role> findAll();
	
	Role getRoleByID(String id);
}
