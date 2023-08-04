package com.asm.Services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asm.Entity.Order;
import com.asm.Reponsitory.OrderReponsitory;
import com.asm.Services.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	OrderReponsitory orderReponsitory;
	
	@Override
	public List<Order> findAll() {
		// TODO Auto-generated method stub
		return orderReponsitory.findAll();
	}

	@Override
	public Order getOrderByID(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
