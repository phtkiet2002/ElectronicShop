package com.asm.Services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asm.Entity.Order;
import com.asm.Entity.OrderDetail;
import com.asm.Reponsitory.OrderDetailReponsitory;
import com.asm.Reponsitory.OrderReponsitory;
import com.asm.Services.OrderService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	OrderReponsitory orderReponsitory;
	@Autowired
	OrderDetailReponsitory detailReponsitory;
	@Override
	public List<Order> findAll() {
		// TODO Auto-generated method stub
		return orderReponsitory.findAll();
	}

	@Override
	public Order create(JsonNode orderData) {
		ObjectMapper mapper= new ObjectMapper();
		
		Order order =mapper.convertValue(orderData, Order.class);
		orderReponsitory.save(order);
		TypeReference<List<OrderDetail>> type=new TypeReference<List<OrderDetail>>() {};
		List<OrderDetail> details= mapper.convertValue(orderData.get("orderDetails"),type)
					.stream().peek(d -> d.setOrder(order)).collect(Collectors.toList());
		detailReponsitory.saveAll(details);
		return order;
	}

	@Override
	public Order findById(Long id) {
		// TODO Auto-generated method stub
		return orderReponsitory.findById(id).get();
	}

	@Override
	public List<Order> findByUsername(String username) {
		// TODO Auto-generated method stub
		return orderReponsitory.findByUsername(username);
	}
	

}
