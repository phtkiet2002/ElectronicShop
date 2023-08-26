package com.asm.Services;

import java.util.List;

import com.asm.Entity.Authority;

public interface AuthorityService {
	List<Authority> findAll();
	public Authority create(Authority auth);
	public void delete(Integer id);
	public List<Authority> findAuthoritiesOfAdministrators();
}
