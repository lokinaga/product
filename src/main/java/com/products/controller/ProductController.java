package com.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.products.entity.Product;
import com.products.service.productService;

@RestController

public class ProductController {
@Autowired
	productService ps;
	 
	@PostMapping(value ="/setPro")
	public String setPro(@RequestBody Product product) {
		return ps.setPro(product);
	}
	@PostMapping(value = "/setPros")
	public String setPros(@RequestBody List<Product> products) {
		return ps.setPros(products);
	}
	@GetMapping(value ="/getAllPro")
	public List<Product> getAllPro(){
		return ps.getAllPro();
	} 
	@GetMapping(value="/getByIdPro/{id}")
	public Product getByIdPro (@PathVariable int id) {
		return ps.getByIdPro(id);
		
	}
	@GetMapping(value="/getByRangePro/{a}/{b}")
	public List<Integer> getByRangePro(@PathVariable int a,@PathVariable int b){
		return ps.getByRangePro(a,b);
	}
	@GetMapping(value ="/getString")        //for rest template
	public String  getString() {
		return "hello world";
	}
	
}
