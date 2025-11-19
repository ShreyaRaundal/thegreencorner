package com.example.the_green_corner.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.the_green_corner.entity.Plant;

public interface PlantRepository extends JpaRepository<Plant, Long> {

    @Query(value = "SELECT * FROM plant WHERE rating BETWEEN :low AND :high", nativeQuery = true)
    List<Plant> findByRating(@Param("low") double low, @Param("high") double high);

    List<Plant> findByRating(double rating);
    
  
//    
//    @Query(
//    		  value = "SELECT p.* FROM plant p " +
//    		          "JOIN plant_categories c ON p.id = c.plant_id " +
//    		          "WHERE LOWER(c.categories) = LOWER(:categoryName)",
//    		  nativeQuery = true
//    		)
    
    @Query("SELECT p FROM Plant p JOIN p.categories c WHERE LOWER(c) = LOWER(:categoryName)")
    List<Plant> findByCategoryName(@Param("categoryName") String categoryName);

    
    
    
    @Query("SELECT p From  Plant p order BY p.price asc")
    List<Plant> getPlantlowToHigh();
    
    
    @Query("SELECT p FROM Plant p ORDER BY p.price DESC")
    List<Plant> getPlantHighToLow();

}
