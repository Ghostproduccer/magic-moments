package com.magicmoments.backendapi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "colors")
public class Colors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToMany(mappedBy = "colors")
    @JsonBackReference
    private List<Items> items;

    @Column(name = "color")
    private String color;

    @Column(name = "active")
    private boolean active;

    // Getters and setters
}
