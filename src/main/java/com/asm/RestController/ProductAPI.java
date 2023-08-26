package com.asm.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.asm.Entity.Product;
import com.asm.Services.ProductService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/products")
public class ProductAPI {
	@Autowired
	ProductService productService;
	// http method: GET, POST, PUT, DELETE

	// localhost:8085/api/product/all
	@GetMapping()
	public ResponseEntity<?> doGetAll() {
		List<Product> product = productService.findAll();
		// http status code: 200, 201, 202, 400, 401, 403, 404, 500
		return ResponseEntity.ok(product);
	}

	@GetMapping("{id}")
	public ResponseEntity<?> getOne(@PathVariable("id") Integer id){
		Product product = productService.findById(id);
		return ResponseEntity.ok(product);
	}

	@PostMapping()
	public ResponseEntity<?> create(@RequestBody Product product){
		productService.create(product);
		return ResponseEntity.ok(product);
	}

	@PutMapping("{id}")
	public ResponseEntity<?> update(@PathVariable("id") Integer id,@RequestBody Product product){
		productService.update(product);
		return ResponseEntity.ok(product);
	}

	@DeleteMapping("{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Integer id){
		productService.delete(id);
		return ResponseEntity.ok().build();
	}
	
	
}
