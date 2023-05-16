package com.example.flywaydemo.service;

import com.example.flywaydemo.entity.Order;
import com.example.flywaydemo.repository.CustomerRepository;
import com.example.flywaydemo.repository.OrderRepository;
import java.util.ArrayList;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final OrderRepository orderRepository;

    public  ArrayList<Order>  getProductsOfCustomer(int customerId){
       return orderRepository.findAllByCustomerId(customerId);
    }

}
