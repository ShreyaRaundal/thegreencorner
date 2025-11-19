package com.example.the_green_corner.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Reviwes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JoinColumn(name = "equipment_id")
	private long reviewId;
	private String username;
	private int rating;
	private String comment;
	private boolean productDelivered;
	private LocalDateTime dateTime;
	private long likes;
	private long dislikes;
	
    @ManyToOne
    @JoinColumn(name = "plant_id")   // <-- FIX: foreign key column
    private Plant plant;
	
	
//	"username": "AaravGardener",
//    "rating": 5,
//    "comment": "Absolutely love this rose! The vibrant red color brightens up my garden.",
//    "productDelivered": true,
//    "dateTime": "2024-11-20T10:15:00",
//    "likes": 42,
//    "dislikes": 2

}
