package com.magicmoments.backendapi.service.mappers;

import com.magicmoments.backendapi.model.Colors;
import com.magicmoments.backendapi.model.Items;
import com.magicmoments.backendapi.service.dto.ColorsDto;
import com.magicmoments.backendapi.service.dto.ItemsDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ColorsMapper {
    ColorsDto toDto(Colors colors);
    Colors toEntity(ColorsDto colorsDto);

    List<ColorsDto> toDtoList(List<Colors> colorsList);
    List<Colors> toEntityList(List<ColorsDto> colorsDtoList);
}
