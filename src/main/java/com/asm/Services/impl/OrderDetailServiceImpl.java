package com.asm.Services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asm.Entity.OrderDetail;
import com.asm.Reponsitory.OrderDetailReponsitory;
import com.asm.Services.OrderDetailService;

@Service
public class OrderDetailServiceImpl implements OrderDetailService{
	@Autowired
	OrderDetailReponsitory orderReponsitory;

	@Override
	public List<OrderDetail> findAll() {
		// TODO Auto-generated method stub
		return orderReponsitory.findAll();
	}

	@Override
	public OrderDetail getOrderDetailByID(Long id) {
		// TODO Auto-generated method stub
		return null;
	}


}
