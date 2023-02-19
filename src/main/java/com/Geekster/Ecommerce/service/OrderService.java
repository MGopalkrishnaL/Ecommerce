package com.Geekster.Ecommerce.service;

import com.Geekster.Ecommerce.dao.IOrderRepo;
import com.Geekster.Ecommerce.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements IOrderService {
    @Autowired
    IOrderRepo iOrderRepo;
    public List<Order> getAll(){
        return iOrderRepo.findAll();
    }
    public Order getByOrderId(Integer orderId){
        return iOrderRepo.findById(orderId).get();
    }
    public ResponseEntity addOrder(Order order){
         iOrderRepo.save(order);
         return new ResponseEntity<>("Order is placed", HttpStatus.CREATED);
    }
}
