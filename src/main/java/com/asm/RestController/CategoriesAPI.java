package com.asm.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.asm.Entity.Category;
import com.asm.Services.CategoryService;

@CrossOrigin("*")
@RestController
@RequestMapping("api/category")
public class CategoriesAPI {
	@Autowired
	CategoryService categoryService;

	// http method: GET, POST, PUT, DELETE

	// localhost:8085/api/category/all
	@GetMapping("/all")
	public ResponseEntity<?> doGetAll() {
		List<Category> categories = categoryService.findAll();
		// http status code: 200, 201, 202, 400, 401, 403, 404, 500
		return ResponseEntity.ok(categories);

	}
	
	@GetMapping("/id={id}")
	public ResponseEntity<?> getById(@RequestParam("id") String id){
		Category category = categoryService.getCategoryByID(id);
		// http status code: 200, 201, 202, 400, 401, 403, 404, 500
		return ResponseEntity.ok(category);
				
	}
}
