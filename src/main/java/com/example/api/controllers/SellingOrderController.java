package com.example.api.controllers;

import com.example.api.dto.SellingOrderDTO;
import com.example.api.models.SellingOrder;
import com.example.api.repositories.SellingOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sellings")
public class SellingOrderController {

    @Autowired
    private SellingOrderRepository sellingOrderRepository;

    @GetMapping
    public ResponseEntity<List<SellingOrderDTO>> findAll() {
        List<SellingOrder> sellingOrders = sellingOrderRepository.findAll();
        return ResponseEntity.ok().body(SellingOrderDTO.convert(sellingOrders));
    }
}
