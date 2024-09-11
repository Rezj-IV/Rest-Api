package com.api.eshop.repository;


import com.api.eshop.domain.GamingSystem;
import com.api.eshop.domain.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GamingSystemRepository extends JpaRepository<GamingSystem, Integer> {
    GamingSystem findByName(String name);
}

