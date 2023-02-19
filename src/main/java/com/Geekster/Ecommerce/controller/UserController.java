package com.Geekster.Ecommerce.controller;

import com.Geekster.Ecommerce.model.User;
import com.Geekster.Ecommerce.service.IUserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/Ecommerces/User")
// http://localhost:8080/api/Ecommerces/User
public class UserController {
    @Autowired
    IUserService iUserService;
    @GetMapping("/getAll")
//    http://localhost:8080/api/Ecommerces/User/getAll
    public List<User> getAll(){
        return iUserService.getall();
    }
    @GetMapping("/getuser/{userId}")
//    http://localhost:8080/api/Ecommerces/User/getuser/{userId}
    public User getuserbyId(@PathVariable Integer userId){
        return iUserService.finduser(userId);
    }
    @PostMapping("/addUser")
//    http://localhost:8080/api/Ecommerces/User/addUser
    public User adduser(@Valid @RequestBody User user){
        return iUserService.addUser(user);
    }
    @PutMapping("/updateUser/{userId}")
//    http://localhost:8080/api/Ecommerces/User/updateUser/{userId}
    public ResponseEntity<String> updateUser(@RequestBody User user ,@PathVariable Integer userId){
        return iUserService.Update(user,userId);
    }
    @DeleteMapping("/deleteUser/{userId}")
//    http://localhost:8080/api/Ecommerces/User/deleteUser/{userId}
    public ResponseEntity<String> deleteUser(@PathVariable Integer userId){
        User user1 = getuserbyId(userId);
        if(user1!=null){
            return iUserService.deleteUser(userId);
        }
        return new ResponseEntity<>("User is not found in data base",HttpStatus.NOT_FOUND);
    }
}
