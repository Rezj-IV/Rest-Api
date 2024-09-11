package com.api.eshop.repository;


import com.api.eshop.domain.Mobile;
import com.api.eshop.domain.WashingAndCleaning;
import org.springframework.data.jpa.repository.JpaRepository;


public interface WashingAndCleaningRepository extends JpaRepository<WashingAndCleaning, Integer> {
    WashingAndCleaning findByName(String name);
}

