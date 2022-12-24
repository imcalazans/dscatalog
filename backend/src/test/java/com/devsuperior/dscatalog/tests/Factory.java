package com.devsuperior.dscatalog.tests;

import java.time.Instant;

import com.devsuperior.dscatalog.dto.ProductDTO;
import com.devsuperior.dscatalog.entities.Category;
import com.devsuperior.dscatalog.entities.Product;

public class Factory {
	public static Product CreateProduct() {
		Product product = new Product(1L, "phone", "Good Phone", 800.0, "https://img.com/img.png", Instant.parse("2020-10-20T03:00:00Z"));
		product.getCategories().add(Factory.CreateCategory());
		return product;
	}
	
	public static ProductDTO createProductDTO() {
		Product product = Factory.CreateProduct();
		return new ProductDTO(product, product.getCategories());
	}
	
	public static Category CreateCategory() {
		Category category = new Category(1L, "Electronics");
		return category;
	}	
}
