package com.Geekster.Ecommerce.controller;

import com.Geekster.Ecommerce.model.Address;
import com.Geekster.Ecommerce.model.Order;
import com.Geekster.Ecommerce.model.Product;
import com.Geekster.Ecommerce.model.User;
import com.Geekster.Ecommerce.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Ecommerces/order")
public class OrderController {
    @Autowired
    IOrderService iOrderService;
    @Autowired
    IUserService iUserService;
    @Autowired
    IProductService iProductService;
    @Autowired
    IAddressService iAddressService;


    @GetMapping("/getAll")
//    http://localhost:8080/api/Ecommerces/order/getAll
    public List<Order> getall(){
        return iOrderService.getAll();
    }
    @GetMapping("/getOrderbyId/{orderId}")
//    http://localhost:8080/api/Ecommerces/order/getOrderbyId/{orderId}
    public Order getorderbyusingId(@PathVariable Integer orderId){
        return iOrderService.getByOrderId(orderId);
    }
    @PostMapping("/PlaceOrder")
//    http://localhost:8080/api/Ecommerces/order/PlaceOrder
    public ResponseEntity placeOrder(@RequestBody Order order,@RequestParam Integer UserId,@RequestParam Integer ProductId ,@RequestParam Integer AddressId){
        User user = iUserService.finduser(UserId);
        Product product = iProductService.getbyId(ProductId);
        Address address = iAddressService.getById(AddressId);
        Order order1 = new Order();
        order1.setId(order.getId());
        order1.setUser(user);
        order1.setAddress(address);
        order1.setProduct(product);
        order1.setProductQuantity(order.getProductQuantity());
      return iOrderService.addOrder(order1);
    }
}
