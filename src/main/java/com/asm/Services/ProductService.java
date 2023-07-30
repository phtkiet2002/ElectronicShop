package com.asm.Services;

import java.util.List;

import com.asm.Entity.Product;

public interface ProductService {
	List<Product> findAll();
	
	Product getProductByID(Integer id);
}
