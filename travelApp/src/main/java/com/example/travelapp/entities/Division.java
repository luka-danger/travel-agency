package com.example.travelapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name="divisions")
@Data
public class Division {
    private Long id;
    private String divisionName;
    private Date createDate;
    private Date lastUpdate;
    private Country country;
    private Long countryID;
    private Set<Customer> customers;
}
