package com.example.the_green_corner.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.the_green_corner.entity.Plant;
import com.example.the_green_corner.entity.Reviwes;
import com.example.the_green_corner.service.PlantServices;

@RestController
public class PlantController  {
	@Autowired
	private PlantServices plantServices;
	
	
	@PostMapping("/plant/save")
	public Plant savePlant(@RequestBody Plant plant) {
		return	plantServices.savePlant(plant);
		}
	
	@GetMapping("/plant/findAll")
	public List<Plant> getall() {
		return plantServices.getall();
	}
	
	@PutMapping("/plant/{plantId}/review")
	public List<Reviwes> getReviewsByPlantId(@PathVariable Long plantId, @RequestBody Reviwes reviwes) {
	    return plantServices.addReviewToPlant(plantId, reviwes);
	}
	
	  @GetMapping("plant/rating/{rating}")
	    public List<Plant> getPlantsByRating(@PathVariable  double rating) {
		  
	        return plantServices.findByRating(rating);
	        
	    }

	  @GetMapping("/category/{categoryName}")
	    public List<Plant> getPlantsByCategory(@PathVariable String categoryName) {
	        return plantServices.getPlantsByCategory(categoryName);
	    }

	  @GetMapping("plant/sort/lowtohigh")
	  public List<Plant> getPlantLowToHigh(){
		  return plantServices.getPlantLowToHigh();
	  }
	  @GetMapping("plant/sort/hightolow")
	  public List<Plant> getPlanthighToLow(){
		  return plantServices.getPlantHighToLow();
	  }
	
	  
	  @DeleteMapping("plant/remove/{id}")
	  public String  removePlantById(@PathVariable long id){
		 return plantServices.removePlant(id);
		  
	  }
	  
	  @GetMapping("plant/page")
	    public Page<Plant> getPlantsByPage(
	            @RequestParam(defaultValue = "0") int page,
	            @RequestParam(defaultValue = "5") int size) {

	        return plantServices.findPlantsByPage(page, size);
	    }
	  
	  
	  @GetMapping("/upi/pay")
	  public Map<String, String> generateUpiLink(
	          @RequestParam String upiId,
	          @RequestParam String name,
	          @RequestParam double amount,
	          @RequestParam(required = false, defaultValue = "Payment") String note
	  ) {

	      String upiLink = "upi://pay?pa=" + upiId +
	              "&pn=" + name +
	              "&tn=" + note +
	              "&am=" + amount +
	              "&cu=INR";

	      Map<String, String> response = new HashMap();
	      response.put("upiLink", upiLink);

	      return response;
	  }

	  
	  
	

}
