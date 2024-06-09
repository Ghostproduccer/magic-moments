package com.magicmoments.backendapi.service.dto;

import com.magicmoments.backendapi.model.ItemsColors;
import lombok.Data;

import java.util.Set;

@Data
public class ColorsDto {
    private String name;

    private Set<ItemsColors> item_color;

    private String hex_code;

}
