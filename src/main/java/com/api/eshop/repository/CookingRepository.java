package com.api.eshop.repository;


import com.api.eshop.domain.Cooking;
import com.api.eshop.domain.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CookingRepository extends JpaRepository<Cooking, Integer> {
    Cooking findByName(String name);
}

