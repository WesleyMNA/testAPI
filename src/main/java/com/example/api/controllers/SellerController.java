package com.example.api.controllers;

import com.example.api.dto.SellerDTO;
import com.example.api.models.Seller;
import com.example.api.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sellers")
public class SellerController {

    @Autowired
    private SellerRepository sellerRepository;

    @GetMapping
    public ResponseEntity<List<SellerDTO>> findAll() {
        List<Seller> sellers = sellerRepository.findAll();
        return ResponseEntity.ok().body(SellerDTO.convert(sellers));
    }
}
