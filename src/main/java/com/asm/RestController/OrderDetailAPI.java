package com.asm.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.asm.Entity.OrderDetail;
import com.asm.Services.OrderDetailService;

@CrossOrigin("*")
@RestController
@RequestMapping("api/orderdetail")
public class OrderDetailAPI {
	@Autowired
	OrderDetailService detailService;
	// http method: GET, POST, PUT, DELETE

	// localhost:8085/api/orderdetail/all
	@GetMapping("/all")
	public ResponseEntity<?> doGetAll() {
		List<OrderDetail> orderDetail = detailService.findAll();
		// http status code: 200, 201, 202, 400, 401, 403, 404, 500
		return ResponseEntity.ok(orderDetail);

	}
	
	@GetMapping("/id={id}")
	public ResponseEntity<?> getById(@RequestParam("id") Long id){
		OrderDetail orderDetail = detailService.getOrderDetailByID(id);
		// http status code: 200, 201, 202, 400, 401, 403, 404, 500
		return ResponseEntity.ok(orderDetail);
				
	}
}
