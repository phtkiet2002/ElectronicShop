package com.asm.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asm.Entity.Product;

public interface ProductDAO extends JpaRepository<Product, Integer>{

}
