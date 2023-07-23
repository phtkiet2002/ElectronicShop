package com.asm.Services;

import java.util.List;

import com.asm.Entity.Product;
import com.asm.Reponsitory.ProductReponsitory;

public interface ProductService {
	List<Product> findAll();
	
	Product getProductByID(Integer id);
}
