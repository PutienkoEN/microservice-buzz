package com.eil.catalog.controllers;

import com.eil.catalog.clients.EliOrderRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import static java.util.Objects.isNull;

@RestController
public class EliCatalogController {

    private final EliOrderRepository eliOrderRepository;

    public EliCatalogController(EliOrderRepository eliOrderRepository) {
        this.eliOrderRepository = eliOrderRepository;
    }

    @GetMapping("/catalog/{orderId}")
    public String home(@PathVariable String orderId) {
        final String orderData = eliOrderRepository.existsById(orderId);
        if (isNull(orderData)) {
            return "Order not found!";
        }

        return orderData;
    }

    @GetMapping("/catalog/greeting")
    public String home() {
        return "Hello!";
    }

}
