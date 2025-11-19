package com.example.the_green_corner.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Equipment {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	@Column(insertable=false, updatable=false)
	private String name;
	private String description;
	private double price;
	private double rating;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Reviwes> reviews;
	
	private List<String> categories;
	 
	@Embedded
	private Seller seller;
	  
	  
	private String availability;
	private int quantityAvailable;
	private List<String> tags;
	private String shippingPolicy;
	private String refundPolicy;
	private String primaryImage;
	private List<String> secondaryImages;


}
