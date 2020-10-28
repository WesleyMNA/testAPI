package com.example.api.dto;

import com.example.api.models.Client;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class ClientDTO {

    private Long id;
    private String name;
    private String cpf;
    private LocalDate birthDate;

    public ClientDTO(Client client) {
        this.id = client.getId();
        this.name = client.getName();
        this.cpf = client.getCpf();
        this.birthDate = client.getBirthDate();
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public static List<ClientDTO> convert(List<Client> clients) {
        return clients.stream().map(ClientDTO::new).collect(Collectors.toList());
    }
}
