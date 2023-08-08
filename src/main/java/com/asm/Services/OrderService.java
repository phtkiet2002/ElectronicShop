package com.asm.Services;

import java.util.List;

import com.asm.Entity.Order;
import com.fasterxml.jackson.databind.JsonNode;

public interface OrderService {
	List<Order> findAll();
	Order create(JsonNode orderData);
	Order findById(Long id);
	

}
