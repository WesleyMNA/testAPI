package com.example.api.dto;

import com.example.api.models.Product;
import org.springframework.http.ResponseEntity;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class ProductDTO {

    private Long id;
    private String name;
    private String color;
    private String description;
    private BigDecimal price;

    public ProductDTO(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.color = product.getColor();
        this.description = product.getDescription();
        this.price = product.getPrice();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public static List<ProductDTO> convert(List<Product> products) {
        return products.stream().map(ProductDTO::new).collect(Collectors.toList());
    }

}
