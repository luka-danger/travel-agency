package com.example.travelapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="carts")
@Data
public class Cart {
    private Long id;
    private String orderTrackingNumber;
    private BigDecimal packagePrice;
    private Integer partySize;
    private StatusType status;
    private Date createDate;
    private Date lastUpdate;
    private Customer customer;
    private Set<CartItem> cartItem;
}
