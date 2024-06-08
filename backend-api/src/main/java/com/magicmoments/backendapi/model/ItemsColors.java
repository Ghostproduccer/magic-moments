package com.magicmoments.backendapi.model;

import com.magicmoments.backendapi.model.compositekey.ItemsColorsId;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "items_colors")
public class ItemsColors {
    @EmbeddedId
    private ItemsColorsId id;

    @ManyToOne
    @MapsId("itemId")
    @JoinColumn(name = "item_id")
    private Items item;

    @ManyToOne
    @MapsId("colorName")
    @JoinColumn(name = "color_name")
    private Colors color;

    private int active;

    private String item_color_url;

}
