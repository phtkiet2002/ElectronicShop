package com.asm.RestController;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.asm.Entity.Order;
import com.asm.Services.OrderService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/orders")
public class OrderAPI {
	@Autowired
	OrderService orderService;
	// http method: GET, POST, PUT, DELETE

	// localhost:8085/api/order/all
	@GetMapping()
	public ResponseEntity<?> doGetAll() {
		List<Order> orders = orderService.findAll();
		// http status code: 200, 201, 202, 400, 401, 403, 404, 500
		return ResponseEntity.ok(orders);

	}
	
	@PostMapping()
	public ResponseEntity<?> create(@RequestBody JsonNode orderData){
		Order order = orderService.create(orderData);
		return ResponseEntity.ok(order);
	}
}
