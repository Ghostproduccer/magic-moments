package com.magicmoments.backendapi.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "items")
public class Items {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "brief", columnDefinition = "TEXT")
    private String brief;

    @Column(name = "details", columnDefinition = "TEXT")
    private String details;

    @Column(name = "color")
    private String color;

    @Column(name = "qty")
    private int qty;

    @Column(name = "bg_color")
    private String bgColor;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "discount")
    private BigDecimal discount;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "video_url")
    private String videoUrl;

    @Column(name = "active")
    private boolean active;

    @ManyToMany
    @JoinTable(
            name = "item_color",
            joinColumns = @JoinColumn(name = "item_id"),
            inverseJoinColumns = @JoinColumn(name = "color_id")
    )
    @JsonManagedReference
    private List<Colors> colors;
}
