package com.magicmoments.backendapi.service.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class ItemsDto {
    private int id;
    private String name;
    private String brief;
    private String details;
    private int qty;
    private String bgColor;
    private BigDecimal price;
    private BigDecimal discount;
    private String videoUrl;
    private boolean active;
    private List<ItemsColorsDto> item_color;
    private String defaultImgUrl;
}
