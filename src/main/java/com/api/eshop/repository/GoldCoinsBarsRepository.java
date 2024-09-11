package com.api.eshop.repository;


import com.api.eshop.domain.GoldCoinsBars;
import com.api.eshop.domain.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GoldCoinsBarsRepository extends JpaRepository<GoldCoinsBars, Integer> {
    GoldCoinsBars findByName(String name);
}

