package com.asm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asm.entity.Order;

public interface OrderDAO extends JpaRepository<Order, Long>{

}
