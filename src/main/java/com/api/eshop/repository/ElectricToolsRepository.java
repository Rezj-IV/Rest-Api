package com.api.eshop.repository;


import com.api.eshop.domain.ElectricTools;
import com.api.eshop.domain.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ElectricToolsRepository extends JpaRepository<ElectricTools, Integer> {
    ElectricTools findByName(String name);
}

