package com.magicmoments.backendapi.controllers;

import com.magicmoments.backendapi.model.Colors;
import com.magicmoments.backendapi.model.Items;
import com.magicmoments.backendapi.service.repositories.ColorsRepository;
import com.magicmoments.backendapi.service.repositories.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemsController {
    @Autowired
    private ItemsRepository itemsRepository;

    @Autowired
    private ColorsRepository colorsRepository;

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/items")
    public List<Items> items() {
        return itemsRepository.findAll();
    }

    @GetMapping("/colors")
    public List<Colors> colors() {
        return colorsRepository.findAll();
    }
}
