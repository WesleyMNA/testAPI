package com.example.api.dto;

import com.example.api.models.Seller;

import java.util.List;
import java.util.stream.Collectors;

public class SellerDTO {

    private Long id;
    private String name;
    private String email;

    public SellerDTO(Seller seller) {
        this.id = seller.getId();
        this.name = seller.getName();
        this.email = seller.getEmail();
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static List<SellerDTO> convert(List<Seller> sellers) {
        return sellers.stream().map(SellerDTO::new).collect(Collectors.toList());
    }
}
