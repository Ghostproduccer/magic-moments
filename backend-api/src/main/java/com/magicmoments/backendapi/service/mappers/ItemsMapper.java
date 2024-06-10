package com.magicmoments.backendapi.service.mappers;

import com.magicmoments.backendapi.model.Items;
import com.magicmoments.backendapi.service.dto.ItemsDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ItemsMapper {
    ItemsDto toDto(Items items);
    Items toItem(ItemsDto itemsDto);

    List<ItemsDto> toDtoList(List<Items> itemsList);
    List<Items> toEntityList(List<ItemsDto> itemsDtoList);
}
