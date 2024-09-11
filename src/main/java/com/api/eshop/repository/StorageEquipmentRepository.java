package com.api.eshop.repository;


import com.api.eshop.domain.Mobile;
import com.api.eshop.domain.StorageEquipment;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StorageEquipmentRepository extends JpaRepository<StorageEquipment, Integer> {
    StorageEquipment findByName(String name);
}

