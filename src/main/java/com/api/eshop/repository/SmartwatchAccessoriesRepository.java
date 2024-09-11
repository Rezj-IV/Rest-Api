package com.api.eshop.repository;


import com.api.eshop.domain.Mobile;
import com.api.eshop.domain.Smartwatch;
import com.api.eshop.domain.SmartwatchAccessories;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SmartwatchAccessoriesRepository extends JpaRepository<SmartwatchAccessories, Integer> {
    SmartwatchAccessories findByName(String name);
}

