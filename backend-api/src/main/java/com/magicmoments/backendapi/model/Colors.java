package com.magicmoments.backendapi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "colors")
public class Colors {

    @Id
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "color")
    private Set<ItemsColors> item_color;

    @Column(name = "hex_code")
    private String hex_code;

}
