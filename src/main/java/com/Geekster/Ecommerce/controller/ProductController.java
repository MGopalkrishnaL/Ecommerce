package com.Geekster.Ecommerce.controller;

import com.Geekster.Ecommerce.model.Product;
import com.Geekster.Ecommerce.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Ecommerces/product")
public class ProductController {
    @Autowired
    IProductService iProductService;
    @GetMapping("/getAll")
//    http://localhost:8080/api/Ecommerces/product/getAll
    public List<Product> getall(){
        return iProductService.getall();
    }
    @PostMapping("/addProduct")
//    http://localhost:8080/api/Ecommerces/product/addProduct
    public ResponseEntity addProduct(@RequestBody Product product){
        return iProductService.addproduct(product);
    }
    @GetMapping("/getListOfProductsByParams")
//    http://localhost:8080/api/Ecommerces/product/getListOfProductsByParams
    public List<Product> getBasedOnQuary(@RequestParam Integer price,@RequestParam String brand){
        return iProductService.getByUsingQuary(price,brand);
    }
    @DeleteMapping("/deleteProduct/{id}")
//    http://localhost:8080/api/Ecommerces/product/deleteProduct/{id}
    public ResponseEntity deleteProduct(@PathVariable Integer id){
        return iProductService.deletebyId(id);
    }
}
