package com.asm.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.asm.Entity.Order;
import com.asm.Services.OrderService;

@CrossOrigin("*")
@RestController
@RequestMapping("api/order")
public class OrderAPI {
	@Autowired
	OrderService orderService;
	// http method: GET, POST, PUT, DELETE

	// localhost:8085/api/order/all
	@GetMapping("/all")
	public ResponseEntity<?> doGetAll() {
		List<Order> orders = orderService.findAll();
		// http status code: 200, 201, 202, 400, 401, 403, 404, 500
		return ResponseEntity.ok(orders);

	}
	

}
