package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping("/product")
	public Product addProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}
	@PostMapping("/products")
	public List<Product> addProducts(@RequestBody List<Product> products) {
		return service.saveProducts(products);
	}
	@GetMapping("/products")
	public List<Product> findAllProducts() {
		return service.getProducts();
	}
	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable int id ) {
		return service.getProductById(id);
	}
	@GetMapping("/productByName/{name}")
	public Product getProductByName(@PathVariable String name ) {
		return service.getProductByName(name);
	}
	
	@PutMapping("/product/{id}")
	public Product updateProduct(@RequestBody Product product) {
		return service.updateProduct(product);
	}
	@DeleteMapping("/product/{id}")
	public String deleteProduct(@PathVariable int id) {
		return service.deleteProductById(id);
	}
}