package com.api.eshop.repository;


import com.api.eshop.domain.DrinkMaker;
import com.api.eshop.domain.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DrinkMakerRepository extends JpaRepository<DrinkMaker, Integer> {
    DrinkMaker findByName(String name);
}

