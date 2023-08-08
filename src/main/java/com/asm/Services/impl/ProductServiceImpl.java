package com.asm.Services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asm.Entity.Product;
import com.asm.Reponsitory.ProductReponsitory;
import com.asm.Services.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductReponsitory productReponsitory;

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return productReponsitory.findAll();
	}



	@Override
	public Product findById(Integer id) {
		// TODO Auto-generated method stub
		return productReponsitory.findById(id).get();
	}

	@Override
	public List<Product> findByCategoryId(String cid) {
		// TODO Auto-generated method stub
		return productReponsitory.findByCategoryId(cid);
	}

	@Override
	public Product create(Product product) {
		// TODO Auto-generated method stub
		return productReponsitory.save(product);
	}

	@Override
	public Product update(Product product) {
		// TODO Auto-generated method stub
		return productReponsitory.save(product);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		productReponsitory.deleteById(id);
	}
	
	
}
