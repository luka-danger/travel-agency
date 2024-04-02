package com.example.travelapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name="customers")
@Data
public class Customer {
    private Long id;
    private String firstName;
    private String lastName;
    private String address;
    private String postalCode;
    private String phone;
    private Date createDate;
    private Date lastUpdate;
    private Division division;
    private Set<Cart> carts;
}
