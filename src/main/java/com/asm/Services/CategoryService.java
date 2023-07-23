package com.asm.Services;

import java.util.List;

import com.asm.Entity.Category;

public interface  CategoryService {
	List<Category> findAll();
	Category getCategoryByID(String id);
} 
