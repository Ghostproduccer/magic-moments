package com.magicmoments.backendapi.model.compositekey;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class ItemsColorsId implements Serializable {
    @Column(name = "item_id")
    private int itemId;

    @Column(name = "color_name")
    private String colorName;
}
