package com.example.api.repositories;

import com.example.api.models.SellingOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellingOrderRepository extends JpaRepository<SellingOrder, Long> {
}
