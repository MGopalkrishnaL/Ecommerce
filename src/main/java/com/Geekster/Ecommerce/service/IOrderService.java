package com.Geekster.Ecommerce.service;

import com.Geekster.Ecommerce.model.Order;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IOrderService {
   public  List<Order> getAll();

  public Order getByOrderId(Integer orderId);
    public ResponseEntity addOrder(Order order);
}
