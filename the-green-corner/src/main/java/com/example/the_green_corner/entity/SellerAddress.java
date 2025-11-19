package com.example.the_green_corner.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class SellerAddress {
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sellerid;
	private String street;
	private String city;
	private String state;
	private String country;
	private String pincode;
	
	
	
//  "street": "Bhosale Nagar",
//  "city": "Pune",
//  "state": "Maharashtra",
//  "country": "India",
//  "pincode": "411007"
	

}
