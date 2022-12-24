package com.devsuperior.dscatalog.repositories;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.dao.EmptyResultDataAccessException;

import com.devsuperior.dscatalog.entities.Product;
import com.devsuperior.dscatalog.tests.Factory;

@DataJpaTest
public class ProductRepositoryTests {
	
	@Autowired
	private ProductRepository repository;
	
	private Long existingId;
	private Long noExistingId;
	private Long countTotalProducts;
	
	@BeforeEach
	void setUp() throws Exception{
		existingId = 1L;
		noExistingId = 1000L;
		countTotalProducts = 25L;
	}
	
	@Test
	public void FindByIdMetodShouldReturnNoEmptyObjectWhenIdExists() {
		Optional<Product> product = repository.findById(existingId);
		
		Assertions.assertTrue(product.get() instanceof Product);
		
	}
	
	@Test
	public void FindByIdMetodShouldReturnEmptyObjectWhenIdNoExists() {
		Optional<Product> product = repository.findById(noExistingId);
		
		Assertions.assertTrue(product.isEmpty());
		
	}
	
	@Test
	public void saveShouldPersistWithAutoincrementWhenIdIsNull() {
		Product product = Factory.CreateProduct();
		product.setId(null);
		
		product = repository.save(product);
		
		Assertions.assertNotNull(product.getId());
		Assertions.assertEquals(countTotalProducts + 1, product.getId());
		
	}
	
	@Test
	public void deleteShouldDeleteObjectWhenIdExists() {
		
		repository.deleteById(existingId);
		
		Optional<Product> obj = repository.findById(existingId);
		
		Assertions.assertFalse(obj.isPresent());	
	}
	
	@Test
	public void deleteShouldThrowExceptionWhenIdDoesNotExists() {
		
		Assertions.assertThrows(EmptyResultDataAccessException.class,() -> {
			repository.deleteById(noExistingId);
		});
	}

}
