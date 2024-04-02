package com.example.travelapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="vacations")
@Data
public class Vacation {
    private Long id;
    private String vacationTitle;
    private String description;
    private BigDecimal travelPrice;
    private String imageURL;
    private Date createDate;
    private Date lastUpdate;
    private Set<Excursion> excursions;
}
