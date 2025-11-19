package com.example.the_green_corner.service;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.the_green_corner.entity.Equipment;
import com.example.the_green_corner.entity.Plant;
import com.example.the_green_corner.entity.Reviwes;
import com.example.the_green_corner.repository.EquipmentRepository;
import com.example.the_green_corner.repository.UserRepository;

@Service
public class EquipmentService {
 @Autowired
private EquipmentRepository equipmentRepository;
 
	public Equipment saveEqu(Equipment equipment) {
		return	equipmentRepository.save(equipment);
		}
	 
	public List<Equipment> getall(){
		return equipmentRepository.findAll();
		
	
	}
	public Equipment getEquipmentById(Long id) {
	Optional<Equipment> optional=equipmentRepository.findById(id);
	if(optional.isPresent()) {
	Equipment e	=optional.get();
	return e;
	}
	return null;
	
	}
	
	public List<Reviwes> getReview(Long id){
		Optional<Equipment>optional=equipmentRepository.findById(id);
		if(optional.isPresent()) {
		Equipment eq=optional.get();
		return eq.getReviews();
		}
		return new ArrayList<>();
	}
	
	
	
	 public List<Equipment> getEquipmentsByCategory(String categoryName) {
	        return equipmentRepository.findByCategoryName(categoryName);
	    }

	    
	    public List<Equipment> getEquipmentLowToHigh() {
	        return equipmentRepository.getEquipmentLowToHigh();
	    }

	
	    public List<Equipment> getEquipmentHighToLow() {
	        return equipmentRepository.getEquipmentHighToLow();
	    }
	
	 public Page<Equipment> findEquipmentsByPage(int page, int size) {
	        Pageable pageable = PageRequest.of(page, size);
	        return equipmentRepository.findAll(pageable);
	    }
	
	
	
	
}
