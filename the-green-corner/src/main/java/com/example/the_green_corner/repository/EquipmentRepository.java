package com.example.the_green_corner.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.the_green_corner.entity.Equipment;

public interface EquipmentRepository extends JpaRepository<Equipment, Long> {

    @Query("SELECT e FROM Equipment e JOIN e.categories c WHERE c = :categoryName")
    List<Equipment> findByCategoryName(@Param("categoryName") String categoryName);

    @Query("SELECT e FROM Equipment e ORDER BY e.price ASC")
    List<Equipment> getEquipmentLowToHigh();

    @Query("SELECT e FROM Equipment e ORDER BY e.price DESC")
    List<Equipment> getEquipmentHighToLow();

}
