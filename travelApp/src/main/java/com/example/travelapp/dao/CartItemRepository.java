package com.example.travelapp.dao;

import com.example.travelapp.entities.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}
