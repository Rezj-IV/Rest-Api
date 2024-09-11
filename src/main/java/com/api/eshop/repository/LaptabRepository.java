package com.api.eshop.repository;


import com.api.eshop.domain.Laptab;
import com.api.eshop.domain.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LaptabRepository extends JpaRepository<Laptab, Integer> {
    Laptab findByName(String name);
}

