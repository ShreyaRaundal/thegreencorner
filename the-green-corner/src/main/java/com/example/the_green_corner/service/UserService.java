package com.example.the_green_corner.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.the_green_corner.entity.Cart;
import com.example.the_green_corner.entity.User;
import com.example.the_green_corner.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public User signUp(User user) {
		   Cart cart = new Cart();
	        user.setCart(cart);

	return	userRepository.save(user);
	}
	
	public User signin( String email,String password) {
		Optional<User>optional=userRepository.findByEmail(email);

		
		if(optional.isPresent()) {
			User user=optional.get();
			if(user.getPassword().equals(password)) {
				return user;
				
			}else {
	            throw new RuntimeException("Invalid password");
	        }
			
			
		}
		 else {
		        throw new RuntimeException("User not found with email: " + email);
		    }
	
		
	
		}
	
	public List<User> getAllUsers() {
		return userRepository.findAll();
		
	}
		
	
	
	

}
