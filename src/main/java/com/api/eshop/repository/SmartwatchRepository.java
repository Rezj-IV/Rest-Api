package com.api.eshop.repository;


import com.api.eshop.domain.Mobile;
import com.api.eshop.domain.Smartwatch;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SmartwatchRepository extends JpaRepository<Smartwatch, Integer> {
    Smartwatch findByName(String name);
}

