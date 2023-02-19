package com.Geekster.Ecommerce.service;

import com.Geekster.Ecommerce.dao.IProductRepo;
import com.Geekster.Ecommerce.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    IProductRepo iProductRepo;
    public List<Product> getall(){
        return iProductRepo.findAll();
    }
    public Product getbyId(Integer id){
        return iProductRepo.findById(id).get();
    }
    public ResponseEntity deletebyId(Integer id){
        iProductRepo.deleteById(id);
        return new ResponseEntity<>("Deleted Successfully", HttpStatus.OK);
    }
    public List<Product> getByUsingQuary(Integer price, String Brand){
        List<Product> products = new ArrayList<>();
        List<Product> productList = iProductRepo.findAll();
        for(Product product : productList){
            if(product.getPrice()<price && product.getBrand().equals(Brand)){
                products.add(product);
            }
        }
        return products;
    }
    public ResponseEntity addproduct(Product product){
        iProductRepo.save(product);
        return new ResponseEntity<>("Product got Created",HttpStatus.CREATED);
    }


}
