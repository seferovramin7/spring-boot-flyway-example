package com.example.flywaydemo.controller;

import com.example.flywaydemo.entity.Order;
import com.example.flywaydemo.service.CustomerService;
import java.util.ArrayList;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private final CustomerService customerService;

    @GetMapping("order/{customerId}")
    public ArrayList<Order> getOrderByCustomerId(@PathVariable int customerId){
        return customerService.getProductsOfCustomer(customerId);
    }
}
