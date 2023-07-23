package com.asm.Services;

import java.util.List;

import com.asm.Entity.Authority;

public interface AuthorityService {
	List<Authority> findAll();
	
	Authority getAuthorityByID(Integer id);
}
