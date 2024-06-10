package com.magicmoments.backendapi.service.mappers;


import com.magicmoments.backendapi.model.ItemsColors;
import com.magicmoments.backendapi.service.dto.ItemsColorsDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ItemsColorsMapper {
    @Mapping(source = "id.itemId", target = "itemId")
    @Mapping(source = "id.colorName", target = "colorName")
    ItemsColorsDto toDto(ItemsColors itemsColors);

    @Mapping(source = "itemId", target = "id.itemId")
    @Mapping(source = "colorName", target = "id.colorName")
    ItemsColors fromDto(ItemsColorsDto itemsColorsDto);

    List<ItemsColorsDto> toDtoList(List<ItemsColors> itemsColorsList);
    List<ItemsColors> toEntityList(List<ItemsColorsDto> itemsColorsDtoList);
}
