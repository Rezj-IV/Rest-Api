package com.api.eshop.repository;


import com.api.eshop.domain.Mobile;
import com.api.eshop.domain.Refrigerator;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RefrigeratorRepository extends JpaRepository<Refrigerator, Integer> {
    Refrigerator findByName(String name);
}

