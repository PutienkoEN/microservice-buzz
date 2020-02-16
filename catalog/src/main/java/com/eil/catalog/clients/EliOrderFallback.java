package com.eil.catalog.clients;

import org.springframework.stereotype.Component;

@Component
public class EliOrderFallback implements EliOrderRepository {

    @Override
    public String existsById(String specificationId) {
        return "Error happened!";
    }

}
