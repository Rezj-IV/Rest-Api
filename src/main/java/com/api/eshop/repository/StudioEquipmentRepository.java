package com.api.eshop.repository;


import com.api.eshop.domain.Mobile;
import com.api.eshop.domain.StudioEquipment;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudioEquipmentRepository extends JpaRepository<StudioEquipment, Integer> {
    StudioEquipment findByName(String name);
}

