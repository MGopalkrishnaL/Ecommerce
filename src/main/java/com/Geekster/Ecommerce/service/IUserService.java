package com.Geekster.Ecommerce.service;

import com.Geekster.Ecommerce.model.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IUserService {

   public List<User> getall();

   public User finduser(Integer userId);

   public User addUser(User user);

  public ResponseEntity<String> deleteUser(Integer userId);

  public  ResponseEntity<String> Update(User user, Integer userId);
}
