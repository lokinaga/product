package com.products.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.products.entity.Product;
import com.products.repository.ProductRepository;
@Repository
public class ProductDao {
	@Autowired
	ProductRepository pr;

	public String setPro(Product product) {
		pr.save(product);
		return "saved";
	}

	public String setPros(List<Product> products) {
		pr.saveAll(products);
		return "saved successful";
	}

	public List<Product> getAllPro() {
		
		return pr.findAll();
	}

	public Product getByIdPro(int id) {
		
		return pr.findById(id).get();
	}

	public List<Integer> getByRangePro(int a, int b) {
		
		return pr.findByRange(a,b);
	}

}
