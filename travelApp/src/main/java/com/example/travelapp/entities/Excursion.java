package com.example.travelapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="excursions")
@Data
public class Excursion {
    private Long id;
    private String excursionTitle;
    private BigDecimal excursionPrice;
    private String imageURL;
    private Date createDate;
    private Date lastUpdate;
    private Vacation vacation;
    private Set<CartItem> cartItems;
}
