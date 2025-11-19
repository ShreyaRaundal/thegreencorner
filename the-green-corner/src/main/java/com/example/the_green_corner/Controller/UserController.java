package com.example.the_green_corner.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.the_green_corner.entity.Cart;
import com.example.the_green_corner.entity.User;
import com.example.the_green_corner.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/user/signup")
	public String signUp(@RequestBody User user) {
		  
		 userService.signUp(user);
		 return "You are succefully signup";
	}
	
	@PostMapping("/user/signin")
	public User signIn(@PathVariable String email,@PathVariable String password ) {
		return userService.signin(email, password);
	}
	
	@GetMapping("/user/all")
	public List<User> getAllUsers() {
	    return userService.getAllUsers();
	}
	
	
	

}
