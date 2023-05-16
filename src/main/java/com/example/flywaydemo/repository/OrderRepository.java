package com.example.flywaydemo.repository;

import com.example.flywaydemo.entity.Order;
import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    ArrayList<Order> findAllByCustomerId(int customerId);
}
