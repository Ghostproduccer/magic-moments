package com.magicmoments.backendapi.service.dto;

import lombok.Data;

@Data
public class ItemsColorsDto {
    private int itemId;
    private String colorName;
    private int active;
    private String item_color_url;
}
