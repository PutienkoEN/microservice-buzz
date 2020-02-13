package com.eil.catalog.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EliCatalogController {

    @GetMapping("/catalog/greeting")
    public String home() {
        return "Hello world";
    }

}
