package com.products.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.products.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
@Query (value = "select hsn from prod_details where price >= ? and price <= ?",nativeQuery=true)
	List<Integer> findByRange(int a, int b);

}
