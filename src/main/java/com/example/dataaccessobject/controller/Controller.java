package com.example.dataaccessobject.controller;

import com.example.dataaccessobject.repository.DatabaseRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    private final DatabaseRepository databaseRepository;

    public Controller(DatabaseRepository databaseRepository) {
        this.databaseRepository = databaseRepository;
    }

    @GetMapping("/products/fetch-product")
    public List<String> fetchProduct(@RequestParam("name") String name) {
        return databaseRepository.getProductName(name);
    }
}