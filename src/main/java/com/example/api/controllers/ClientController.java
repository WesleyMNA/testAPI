package com.example.api.controllers;

import com.example.api.dto.ClientDTO;
import com.example.api.models.Client;
import com.example.api.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping
    public ResponseEntity<List<ClientDTO>> findAll() {
        List<Client> clients = clientRepository.findAll();
        return ResponseEntity.ok().body(ClientDTO.convert(clients));
    }
}
