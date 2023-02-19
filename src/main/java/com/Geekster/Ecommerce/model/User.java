package com.Geekster.Ecommerce.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user_tbl")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer id;
    @Column(name = "user_name")
    @Length(min = 3,max = 25,message = "Enter the user name with length of 3-20 letters")
    private String name;
    @Column(name = "user_email")
    @Email(message = "Enter the valid email_id")
    private String email;
    @Column(name="user_password")
    @Length(min=6,max=30,message = "Enter password should be strong")
    private String password;
    @Column(name = "user_phoneNumber")
    @Digits(integer = 12,fraction = 0,message = "Enter the phone number including country code")
    private String phoneNumber;
}
