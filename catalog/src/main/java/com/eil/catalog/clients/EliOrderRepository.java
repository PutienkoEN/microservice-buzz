package com.eil.catalog.clients;

import com.eil.catalog.EliFeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "order-service", configuration = EliFeignConfiguration.class)
public interface EliOrderRepository {

    @GetMapping(path = "/order/{orderId}")
    String existsById(@PathVariable("orderId") String specificationId);

}
