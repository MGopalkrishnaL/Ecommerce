package com.Geekster.Ecommerce.controller;

import com.Geekster.Ecommerce.model.Address;
import com.Geekster.Ecommerce.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Ecommerces/address")
public class addressController {
    @Autowired
    IAddressService iAddressService;
    @GetMapping("/getaddresbyId/{AddressId}")
//    http://localhost:8080/api/Ecommerces/address/getaddresbyId/{AddressId}
    public Address getbyId(@PathVariable Integer AddressId){
        return iAddressService.getById(AddressId);
    }
    @PostMapping("/addAddress")
//    http://localhost:8080/api/Ecommerces/address/addAddress
    public ResponseEntity addAddress(@RequestBody Address address){
        return iAddressService.addAddress(address);
    }
}
