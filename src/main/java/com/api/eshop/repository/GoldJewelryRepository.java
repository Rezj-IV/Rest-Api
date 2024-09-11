package com.api.eshop.repository;


import com.api.eshop.domain.GoldJewelry;
import com.api.eshop.domain.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GoldJewelryRepository extends JpaRepository<GoldJewelry, Integer> {
    GoldJewelry findByName(String name);
}

