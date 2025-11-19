package com.example.the_green_corner.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Data;
@Data

@Embeddable
public class Seller {
	private String name;
	@OneToOne
    private SellerAddress sellerAddress;

}
