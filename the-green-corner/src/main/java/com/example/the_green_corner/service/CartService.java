package com.example.the_green_corner.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.the_green_corner.entity.Cart;
import com.example.the_green_corner.entity.Plant;
import com.example.the_green_corner.entity.User;
import com.example.the_green_corner.repository.CartRepository;
import com.example.the_green_corner.repository.PlantRepository;
import com.example.the_green_corner.repository.UserRepository;

@Service
public class CartService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PlantRepository plantRepository;

    @Autowired
    private CartRepository cartRepository;

  
    public Cart addPlantToCart(long plantId, long userId) {
    User user=userRepository.findById(userId).get();
    Plant plant =plantRepository.findById(plantId).get();
    
    Cart cart=user.getCart();
    
    cart.getPlants().add(plant);
    
    Cart returnCart=cartRepository.save(cart);
    return returnCart;
    	

    }
    
    public Cart getCartByUserId(long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found with ID: " + userId));

        Cart cart = user.getCart();
        if (cart == null) {
            throw new RuntimeException("Cart not found for user ID: " + userId);
        }
        return cart;
    }
    
    public Cart removePlantFromCart(long cartId, long plantId) {

        Cart cart = cartRepository.findById(cartId)
                .orElseThrow(() -> new RuntimeException("Cart not found"));

        Plant plant = plantRepository.findById(plantId)
                .orElseThrow(() -> new RuntimeException("Plant not found"));

        cart.getPlants().removeIf(p -> p.getId() == plantId);

        return cartRepository.save(cart);
    }
    }

