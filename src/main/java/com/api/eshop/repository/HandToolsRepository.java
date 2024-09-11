package com.api.eshop.repository;


import com.api.eshop.domain.HandTools;
import com.api.eshop.domain.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;


public interface HandToolsRepository extends JpaRepository<HandTools, Integer> {
    HandTools findByName(String name);
}

