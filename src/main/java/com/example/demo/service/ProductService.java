package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;
	public Product saveProduct(Product product) {
		return repository.save(product);
	}
	public List<Product> saveProducts(List<Product> products) {
		return repository.saveAll(products);
	}
	
	public List<Product> getProducts(){
		return repository.findAll();
	}
	public Product getProductById(int id){
		return repository.findById(id).orElse(null);
	}
	public Product getProductByName(String name){
		return repository.findByName(name);
	}
	public String deleteProductById(int id){
		 repository.deleteById(id);
		 return "Product Removed id ::" + id;
	}
	public Product updateProduct(Product product) {
		Product existingProduct = repository.findById(product.getId()).orElse(null);
		existingProduct.setName(product.getName());
		existingProduct.setOriginalPrice(product.getOriginalPrice());
		existingProduct.setOfferPrice(product.getOfferPrice());
		existingProduct.setImageUrl(product.getImageUrl());
		existingProduct.setImageUrl(product.getImageUrl());
		existingProduct.setDescription(product.getDescription());
		existingProduct.setBadge(product.getBadge());
		return repository.save(existingProduct);
	}
}