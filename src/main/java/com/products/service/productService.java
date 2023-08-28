package com.products.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.products.dao.ProductDao;
import com.products.entity.Product;
@Service
public class productService {
	@Autowired
	ProductDao pd;

	public String setPro(Product product) {
		
		return pd.setPro(product);
	}

	public String setPros(List<Product> products) {
		
		return pd.setPros(products);
	}

	public List<Product> getAllPro() {
		return pd.getAllPro();
		
	}

	public Product getByIdPro(int id) {
		
		return pd.getByIdPro(id);
	}

	public List<Integer> getByRangePro(int a, int b) {
		
		return pd.getByRangePro(a,b);
	}

}
