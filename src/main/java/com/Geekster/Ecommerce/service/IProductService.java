package com.Geekster.Ecommerce.service;

import com.Geekster.Ecommerce.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

public interface IProductService {
    public List<Product> getall();
    public Product getbyId(Integer id);
    public ResponseEntity deletebyId(Integer id);

    public List<Product> getByUsingQuary(Integer price, String Brand);

   public ResponseEntity addproduct(Product product);
}
