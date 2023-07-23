package com.asm.Reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asm.Entity.Order;

public interface OrderReponsitory extends JpaRepository<Order, Long>{

}
