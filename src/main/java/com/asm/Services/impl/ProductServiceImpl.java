package com.asm.Services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asm.Entity.Product;
import com.asm.Reponsitory.ProductReponsitory;
import com.asm.Services.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductReponsitory productReponsitory;

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return productReponsitory.findAll();
	}

	@Override
	public Product getProductByID(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
