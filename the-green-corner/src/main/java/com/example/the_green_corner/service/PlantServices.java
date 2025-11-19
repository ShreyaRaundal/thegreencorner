package com.example.the_green_corner.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.the_green_corner.entity.Plant;
import com.example.the_green_corner.entity.Reviwes;
import com.example.the_green_corner.entity.User;
import com.example.the_green_corner.repository.PlantRepository;
import com.example.the_green_corner.repository.ReviewsRepository;

@Service
public class PlantServices {
	
	@Autowired
	private PlantRepository plantRepository;
	@Autowired
	private ReviewsRepository  reviewRepository;
	
	public Plant savePlant(Plant plant) {
		return	plantRepository.save(plant);
		}
	 
	public List<Plant> getall(){
		return plantRepository.findAll();
		

		
			
	}
	public List<Reviwes> addReviewToPlant(Long plantId, Reviwes review) {

    Plant plant = plantRepository.findById(plantId)
            .orElseThrow(() -> new RuntimeException("Plant not found"));

    review.setPlant(plant);  // MUST
    reviewRepository.save(review);

    return reviewRepository.findByPlantId(plantId);
}

	   public List<Plant> findByRating(double rating) {
	        double low = rating;       // e.g. 4.0
	        double high = rating + 0.9; // e.g. 4.9

	        return plantRepository.findByRating(low, high);
	    }
	   
	   
	

	       public List<Plant> getPlantsByCategory(String category) {
	           return plantRepository.findByCategoryName(category);
	       
	   }
	       
	       public List<Plant> getPlantLowToHigh(){
	    	   return plantRepository.getPlantlowToHigh();
	       }
	       
	       
	       
	       public List<Plant> getPlantHighToLow(){
	    	   return plantRepository.getPlantHighToLow();
	       }

	       
	       public String  removePlant(long id) {
	    	   Optional<Plant> optional=plantRepository.findById(id);
	    	   if(optional.isPresent()) {
	    		  Plant plant= optional.get();
	    		  plantRepository.delete(plant);
	    		  return "Plant is deleted";
	    		 
	    		   
	    	   }
	    	   return "Plant is Not available";
	    	   
	    	  
	       }
	       
	       public Page<Plant> findPlantsByPage(int page, int size) {
	           Pageable pageable = PageRequest.of(page, size);
	           return plantRepository.findAll(pageable);
	       }
	      

	 //category
	 //sort low to high  high to low
	 //wishlist
}
