package com.web2.booking.controllers;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web2.booking.DTO.Product.CreateProductInputDTO;
import com.web2.booking.DTO.Product.CreateProductOutputDTO;
import com.web2.booking.DTO.Product.DeleteProductOutputDTO;
import com.web2.booking.DTO.Product.ProductOutputDTO;
import com.web2.booking.DTO.Product.UpdateProductInputDTO;
import com.web2.booking.services.ProductService;

@RestController
@RequestMapping("api/products")
public class ProductController {
  @Autowired
  ProductService productService;

  @GetMapping("/{id}")
  ResponseEntity<ProductOutputDTO> getProductById(@PathVariable UUID id) {

    ProductOutputDTO response = productService.getProduct(id);
    return ResponseEntity.ok(response);
  }

  @PostMapping("")
  ResponseEntity<CreateProductOutputDTO> createProduct(@RequestBody CreateProductInputDTO product) {
    CreateProductOutputDTO response = productService.saveProduct(product);
    return ResponseEntity.ok(response);
  }

  @DeleteMapping("/{id}")
  ResponseEntity<DeleteProductOutputDTO> deleteProductById(@PathVariable UUID id) {

    DeleteProductOutputDTO response = productService.deleteProduct(id);
    return ResponseEntity.ok(response);
  }

  @PutMapping("/{id}")
  ResponseEntity<ProductOutputDTO> updateProduct(@PathVariable UUID id,
      @RequestBody UpdateProductInputDTO product) {
    ProductOutputDTO response = productService.updateProduct(id, product);
    return ResponseEntity.ok(response);
  }

}