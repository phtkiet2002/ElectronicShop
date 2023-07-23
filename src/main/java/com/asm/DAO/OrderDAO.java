package com.asm.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asm.Entity.Order;

public interface OrderDAO extends JpaRepository<Order, Long>{

}
