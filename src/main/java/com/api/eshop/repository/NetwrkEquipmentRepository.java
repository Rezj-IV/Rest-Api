package com.api.eshop.repository;


import com.api.eshop.domain.Mobile;
import com.api.eshop.domain.NetwrkEquipment;
import org.springframework.data.jpa.repository.JpaRepository;


public interface NetwrkEquipmentRepository extends JpaRepository<NetwrkEquipment, Integer> {
    NetwrkEquipment findByName(String name);
}

