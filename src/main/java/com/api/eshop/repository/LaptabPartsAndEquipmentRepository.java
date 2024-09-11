package com.api.eshop.repository;


import com.api.eshop.domain.LaptabPartsAndEquipment;
import com.api.eshop.domain.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LaptabPartsAndEquipmentRepository extends JpaRepository<LaptabPartsAndEquipment, Integer> {
    LaptabPartsAndEquipment findByName(String name);
}

