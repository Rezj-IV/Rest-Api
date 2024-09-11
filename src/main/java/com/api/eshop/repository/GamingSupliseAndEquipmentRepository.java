package com.api.eshop.repository;


import com.api.eshop.domain.GamingSupliseAndEquipment;
import com.api.eshop.domain.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GamingSupliseAndEquipmentRepository extends JpaRepository<GamingSupliseAndEquipment, Integer> {
    GamingSupliseAndEquipment findByName(String name);
}

