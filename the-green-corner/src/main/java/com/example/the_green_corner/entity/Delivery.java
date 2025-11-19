package com.example.the_green_corner.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Delivery {
	@Id
	long deliveryid;
	String country;
	String name;
	String lastname;
	String Address;

	String state;
	int pincode;
	long phono;
	String shipingMethod;
	double totalAmount;
	
	
	
	
	

}
