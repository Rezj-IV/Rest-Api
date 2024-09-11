package com.api.eshop.repository;


import com.api.eshop.domain.Mobile;
import com.api.eshop.domain.Soundbar;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SoundbarRepository extends JpaRepository<Soundbar, Integer> {
    Soundbar findByName(String name);
}

