package com.example.travelapp.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name="cart_items")
@Data
@Getter
@Setter
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cart_item_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="vacation_id")
    private Vacation vacation;

    @ManyToMany
    @JoinTable(name="excursion_cartitem",
            joinColumns = @JoinColumn(name = "excursion_id"),
            inverseJoinColumns = @JoinColumn(name="cart_item_id"))
    private Set<Excursion> excursions;

    @ManyToOne
    @JoinColumn(name="cart_id")
    private Cart cart;

    @Column(name="create_date")
    @CreationTimestamp
    private Date createDate;

    @Column(name="last_update")
    @UpdateTimestamp
    private Date lastUpdate;
}
