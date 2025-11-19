package com.example.the_green_corner.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;



@Data
@Entity
@Table(name = "plantUser")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userid;
	private String name;
	private String password;
	private String email;
	private long contact;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Cart cart;
	
	@OneToMany
	private List<Delivery> delivery;
	

}
