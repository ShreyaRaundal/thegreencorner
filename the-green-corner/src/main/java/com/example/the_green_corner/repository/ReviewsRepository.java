package com.example.the_green_corner.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.the_green_corner.entity.Plant;
import com.example.the_green_corner.entity.Reviwes;

public interface ReviewsRepository extends JpaRepository<Reviwes, Long>{
	 List<Reviwes> findByPlantId(Long plantId);

}
