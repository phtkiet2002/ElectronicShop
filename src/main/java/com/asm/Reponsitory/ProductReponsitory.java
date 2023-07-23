package com.asm.Reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asm.Entity.Product;

public interface ProductReponsitory extends JpaRepository<Product, Integer>{

}
