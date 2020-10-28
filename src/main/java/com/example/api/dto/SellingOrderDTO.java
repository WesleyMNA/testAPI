package com.example.api.dto;

import com.example.api.models.Client;
import com.example.api.models.Seller;
import com.example.api.models.SellingOrder;

import javax.persistence.ManyToOne;
import java.util.List;
import java.util.stream.Collectors;

public class SellingOrderDTO {

    private Long id;
    private String clientName;
    private String sellerName;

    public SellingOrderDTO(SellingOrder sellingOrder) {
        this.id = sellingOrder.getId();
        this.clientName = sellingOrder.getClient().getName();
        this.sellerName = sellingOrder.getSeller().getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public static List<SellingOrderDTO> convert(List<SellingOrder> sellingOrders) {
        return sellingOrders.stream().map(SellingOrderDTO::new).collect(Collectors.toList());
    }
}
