package com.Geekster.Ecommerce.service;

import com.Geekster.Ecommerce.model.Address;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IAddressService {
    public List<Address> getall();
    public ResponseEntity addAddress(Address address);
    public Address getById(Integer id);
}
