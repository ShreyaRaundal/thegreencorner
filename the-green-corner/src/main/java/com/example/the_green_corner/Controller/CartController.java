package com.example.the_green_corner.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.the_green_corner.entity.Cart;
import com.example.the_green_corner.entity.Plant;
import com.example.the_green_corner.service.CartService;
import com.example.the_green_corner.service.PlantServices;

import jakarta.websocket.server.PathParam;

@RestController
public class CartController {
	@Autowired
	private CartService cartService;
	
	@Autowired
	private PlantServices plantServices;
	
	@PostMapping("/addTocart/{plantId}/user/{userId}")
	public Cart addPlantToCart(@PathVariable long plantId,@PathVariable long userId) {
		return cartService.addPlantToCart(plantId, userId);
		
	}
	
	@GetMapping("/cart/user/{userId}")
	public Cart viewCart(@PathVariable long userId) {
	    return cartService.getCartByUserId(userId);
	}
	
	@DeleteMapping("/cart/{cartId}/plant/{plantId}")
	public ResponseEntity<String> removePlantFromCart(
	        @PathVariable long cartId,
	        @PathVariable long plantId) {

	    cartService.removePlantFromCart(cartId, plantId);
	    return ResponseEntity.ok("Plant removed from cart successfully");
	}

	


}
