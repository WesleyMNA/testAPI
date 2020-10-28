package com.example.api.controllers;

import com.example.api.dto.ProductDTO;
import com.example.api.models.Product;
import com.example.api.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public ResponseEntity<List<ProductDTO>> findAll() {
        List<Product> products = productRepository.findAll();
        return ResponseEntity.ok().body(ProductDTO.convert(products));
    }
}
