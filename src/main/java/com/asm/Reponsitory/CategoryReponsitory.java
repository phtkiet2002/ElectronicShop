package com.asm.Reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asm.Entity.Category;


public interface CategoryReponsitory extends JpaRepository<Category, String> {

}
