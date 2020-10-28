package com.example.api.dto;

import com.example.api.models.Lot;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class LotDTO {

    private Long id;
    private LocalDate manufacturingDate;

    public LotDTO(Lot lot) {
        this.id = lot.getId();
        this.manufacturingDate = lot.getManufacturingDate();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(LocalDate manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }


    public static List<LotDTO> convert(List<Lot> lots) {
        return lots.stream().map(LotDTO::new).collect(Collectors.toList());
    }
}
