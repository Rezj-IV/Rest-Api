package com.api.eshop.repository;


import com.api.eshop.domain.HandsfreeAccessories;
import com.api.eshop.domain.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;


public interface HandsfreeAccessoriesRepository extends JpaRepository<HandsfreeAccessories, Integer> {
    HandsfreeAccessories findByName(String name);
}

