package com.asm.Services;

import java.util.List;

import com.asm.Entity.Order;

public interface OrderService {
	List<Order> findAll();
	
	Order getOrderByID(Long id);
}
