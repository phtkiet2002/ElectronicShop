package com.asm.Reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asm.Entity.OrderDetail;

public interface OrderDetailReponsitory extends JpaRepository<OrderDetail, Long>{

}
