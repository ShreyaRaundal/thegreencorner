package com.example.the_green_corner.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.the_green_corner.entity.Cart;
import com.example.the_green_corner.entity.User;

public interface CartRepository extends JpaRepository<Cart, Long>{


}
