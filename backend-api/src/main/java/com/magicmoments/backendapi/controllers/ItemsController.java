package com.magicmoments.backendapi.controllers;

import com.magicmoments.backendapi.model.Colors;
import com.magicmoments.backendapi.model.Items;
import com.magicmoments.backendapi.service.dto.ItemsDto;
import com.magicmoments.backendapi.service.srv.ItemsService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "Company items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @Operation(summary = "Get all items and the associated colors")
    @GetMapping("/itemsColors")
    public List<ItemsDto> items() {
        return itemsService.getAllItemsWithColor();
    }

    @Operation(summary = "Get all colors")
    @GetMapping("/colors")
    public List<Colors> colors() {
        return null;
    }
}
