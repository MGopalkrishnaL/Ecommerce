package com.Geekster.Ecommerce.service;
import com.Geekster.Ecommerce.dao.IAddressRepo;
import com.Geekster.Ecommerce.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddressService implements IAddressService  {
    @Autowired
    IAddressRepo iAddressRepo;
    public List<Address> getall(){
        return iAddressRepo.findAll();
    }
    public ResponseEntity addAddress(Address address){
        iAddressRepo.save(address);
        return new ResponseEntity("Address saved Successfully", HttpStatus.CREATED);
    }
    public Address getById(Integer id){
        return iAddressRepo.findById(id).get();
    }
}
