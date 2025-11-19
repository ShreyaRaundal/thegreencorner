package com.example.the_green_corner.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;





@Data
@Entity
public class Plant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String description;
	private double price;
	private double discountPrice;
	private double rating;
	
	@OneToMany(mappedBy = "plant", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Reviwes> reviews = new ArrayList<>();

	
	private long totalSalesLastMonth;
	private String sellerName;
	@OneToOne(cascade = CascadeType.ALL)
	private SellerAddress sellerAddress;
	
	private String availability;
	private long quantityAvailable;
	
	@ElementCollection
	@CollectionTable(name = "plant_categories", joinColumns = @JoinColumn(name = "plant_id"))
	@Column(name = "category")   // <--- Important
	private List<String> categories;

	
	private String sunlightRequirement;
	private String moistureRequirement;
	private String soilType;
	private String season;
	private String growthRate;
	private String potSizeRequired;
	private String genus;
	private String localName;
	private String regionalName;
	private String biologicalName;
	private String botanicalName;
	
	
	@ElementCollection
	private List<String>tags;
	
	@ElementCollection
	private List<String>shippingStates;
	
	private String primaryImage;
	
	@ElementCollection
	private List<String>secondaryImages;
	
	private String shoppingPolicy;
	private String refundPolicy;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//    "name": "Rose",
//    "id": "1",
//    "description": "Roses are beautiful flowering plants belonging to the Rosaceae family. Popular in gardens, they are loved for their vibrant colors and aromatic fragrance. Maharashtra, particularly Pune, has ideal conditions for growing roses due to its moderate climate.",
//    "price": 12,
//    "discountPrice": 10,
//    "rating": 4.5,
//    "reviews"
	
//	"totalSalesLastMonth": 50,
	
//	 "availability": "In Stock",
//     "quantityAvailable": 100,
//     "categories": [
//       "Outdoor Plants",
//       "Indoor Plants",
//       "Flowering Plants"
//     ],
//     "sunlightRequirement": "Full Sun",
//     "moistureRequirement": "Medium",
//     "soilType": "Loamy soil",
//     "season": "Winter, Spring",
//     "growthRate": "Moderate",
//     "potSizeRequired": "Medium",
//     "genus": "Rosa",
//     "localName": "गुलाब (Gulab)",
//     "regionalName": "गुलाब (Gulab)",
//     "biologicalName": "Rosa spp.",
//     "botanicalName": "Rosa hybrida",
//     "tags": [
//       "Gift Ideas",
//       "Flowering Plants",
//       "Indoor Decor"
//     ],
//     "shippingStates": [
//       "Maharashtra",
//       "Goa",
//       "Karnataka"
//     ],
//     "primaryImage": "https://nurserylive.com/cdn/shop/products/nurserylive-miniature-rose-button-rose-yellow-plant_600x600.jpg?v=1634224134",
//     "secondaryImages": [
//       "https://nurserylive.com/cdn/shop/products/nurserylive-g-rose-orange-plant_600x600.jpg?v=1634227422",
//       "https://nurserylive.com/cdn/shop/products/nurserylive-rose-orange-plant-1_540x720.jpg?v=1634227420",
//       "https://nurserylive.com/cdn/shop/products/nurserylive-rose-orange-plant-4_540x720.jpg?v=1634227413",
//       "https://nurserylive.com/cdn/shop/products/nurserylive-g-rose-orange-plant_600x600.jpg?v=1634227422"
//     ],
//     "shoppingPolicy": "Ships within 3-5 business days across Pune and Maharashtra.",
//     "refundPolicy": "30-day refund policy with original receipt. Free return pickup within Pune city limits."
//   }

}
