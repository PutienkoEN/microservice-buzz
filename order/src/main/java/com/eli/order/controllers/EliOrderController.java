package com.eli.order.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class EliOrderController {

    // For simplicity, here should be Facade/Service/Repository
    private static final Map<String, String> orders = new HashMap<String, String>() {{
        put("firstOrder", "Kaylo Ren");
        put("secondOrder", "Lost in time");
    }};

    @GetMapping("/order/{orderCode}")
    public String getOrder(@PathVariable String orderCode) {
        return orders.get(orderCode);
    }
}
