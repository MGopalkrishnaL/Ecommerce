package com.Geekster.Ecommerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.springframework.context.annotation.Lazy;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "address_tbl")
public class Address {
    @Id
    @Column(name = "address_id")
    private Integer id;
    @Column(name = "address_name")
    private String name;
    @Column(name = "address_landmark")
    private String landMark;
    @Column(name = "address_zipcode")
    private String zipcode;
    @Column(name = "address_state")
    private String state;
    @JoinColumn(name = "user_id")
    @OneToOne
    private User user;
}
