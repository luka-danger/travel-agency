package com.example.travelapp.services;

import com.example.travelapp.entities.Cart;
import com.example.travelapp.entities.CartItem;
import com.example.travelapp.entities.Customer;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {
    private Customer customer;
    private Cart cart;
    private Set<CartItem> cartItems;
 }
