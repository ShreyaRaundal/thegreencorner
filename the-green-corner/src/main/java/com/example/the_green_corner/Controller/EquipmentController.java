package com.example.the_green_corner.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.the_green_corner.entity.Equipment;
import com.example.the_green_corner.entity.Plant;
import com.example.the_green_corner.entity.Reviwes;
import com.example.the_green_corner.service.EquipmentService;

@RestController
public class EquipmentController {
	@Autowired
	private EquipmentService equipmentService;

	
	
	@PostMapping("/equipment/save")
	public Equipment ssaveEqu(@RequestBody Equipment equipment) {
		return	equipmentService.saveEqu(equipment);
		}
	
	@GetMapping("/equipment/findAll")
	public List<Equipment> getall() {
		return equipmentService.getall();
	}
	
	@GetMapping("/equipment/{id}")
	public Equipment getEquipmentById(@PathVariable Long id) {
		return equipmentService.getEquipmentById(id);
	}
	
	@PutMapping("/equipment/{eqId}/review")
	public List<Reviwes>getReviewsByPlantId(@PathVariable Long eqId){
		return equipmentService.getReview(eqId);
	}
	
	
	 
    @GetMapping("/equipment/category/{categoryName}")
    public List<Equipment> getEquipmentsByCategory(@PathVariable String categoryName) {
        return equipmentService.getEquipmentsByCategory(categoryName);
    }
    
    
    @GetMapping("/equipment/sort/lowtohigh")
    public List<Equipment> getEquipmentLowToHigh() {
        return equipmentService.getEquipmentLowToHigh();
    }

  
    @GetMapping("/equipment/sort/hightolow")
    public List<Equipment> getEquipmentHighToLow() {
        return equipmentService.getEquipmentHighToLow();
    }
    
    
    
    
	@GetMapping("/equipment/page")
	public ResponseEntity<Page<Equipment>> fetchEquipmentsByPage(
	        @RequestParam(defaultValue = "0") int page,
	        @RequestParam(defaultValue = "3") int size) {

	    return ResponseEntity.status(HttpStatus.OK)
	            .body(equipmentService.findEquipmentsByPage(page, size));
	}

	
}
