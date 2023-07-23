package com.asm.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.asm.Entity.Product;
import com.asm.Services.ProductService;

@RestController
@RequestMapping("api/product")
public class ProductAPI {
	@Autowired
	ProductService productService;
	// http method: GET, POST, PUT, DELETE

	// localhost:8085/api/product/all
	@GetMapping("/all")
	public ResponseEntity<?> doGetAll() {
		List<Product> product = productService.findAll();
		// http status code: 200, 201, 202, 400, 401, 403, 404, 500
		return ResponseEntity.ok(product);
	}
	
	@GetMapping("/id={id}")
	public ResponseEntity<?> getById(@RequestParam("id") Integer id){
		Product product = productService.getProductByID(id);
		// http status code: 200, 201, 202, 400, 401, 403, 404, 500
		return ResponseEntity.ok(product);
				
	}
}
