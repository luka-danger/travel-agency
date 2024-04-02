package com.example.travelapp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name="cart_items")
@Data
public class CartItem {
    private Long id;
    private Vacation vacations;
    private Set<Excursion> excursions;
    private Cart cart;
    private Date createDate;
    private Date lastUpdate;
}
