package com.asm.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class ProductController {
	@RequestMapping("/product/list")
	public String list() {
		return "user/product/list";
	}
}
