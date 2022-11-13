package com.springbestpractice.springbestpractice;

import com.springbestpractice.springbestpractice.entity.Product;
import com.springbestpractice.springbestpractice.repository.ProductRepository;
import com.springbestpractice.springbestpractice.service.ProductService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbestpracticeApplicationTests {
  @Autowired
  private ProductService productService;

  @MockBean
  private ProductRepository productRepository;


	@Test
	public void getProductsTest() {
    when(productRepository.findAll())
      .thenReturn(
        Stream.of(new Product(1, "Product", 2000, 3f, "Physical")).collect(Collectors.toList())
      );
    assertEquals(1, productService.findAll().size());
    verify(productRepository, times(1)).findAll();
	}

}
