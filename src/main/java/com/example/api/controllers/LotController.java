package com.example.api.controllers;

import com.example.api.dto.LotDTO;
import com.example.api.models.Lot;
import com.example.api.repositories.LotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lots")
public class LotController {

    @Autowired
    private LotRepository lotRepository;

    @GetMapping
    public ResponseEntity<List<LotDTO>> findAll() {
        List<Lot> lots = lotRepository.findAll();
        return ResponseEntity.ok().body(LotDTO.convert(lots));
    }
}
