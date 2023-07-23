package com.asm.Services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asm.Entity.Category;
import com.asm.Reponsitory.CategoryReponsitory;
import com.asm.Services.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	CategoryReponsitory categoryRepository;

	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

	@Override
	public Category getCategoryByID(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
