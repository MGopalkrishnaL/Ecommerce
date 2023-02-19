package com.Geekster.Ecommerce.service;

import com.Geekster.Ecommerce.dao.IUserRepo;
import com.Geekster.Ecommerce.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{

    @Autowired
    IUserRepo iUserRepo;
    @Override
    public List<User> getall(){
        return iUserRepo.findAll();
    }
    @Override
    public User finduser(Integer userId){
        return iUserRepo.findById(userId).get();
    }
    @Override
    public User addUser(User user){
        return iUserRepo.save(user);
    }
    public ResponseEntity<String> deleteUser(Integer userId){
        iUserRepo.deleteById(userId);
        return new ResponseEntity<>("User Deleted successfully", HttpStatus.OK);
    }
    public  ResponseEntity<String> Update(User user, Integer userId){
        User old = finduser(userId);
        old.setName(user.getName());
        old.setPassword(user.getPassword());
        old.setEmail(user.getEmail());
        old.setPhoneNumber(user.getPhoneNumber());
        iUserRepo.save(old);
        return new ResponseEntity<>("User Updated Successfully",HttpStatus.ACCEPTED);
    }
}
