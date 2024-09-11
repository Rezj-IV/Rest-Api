package com.api.eshop.repository;


import com.api.eshop.domain.Mobile;
import com.api.eshop.domain.Tv;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TvRepository extends JpaRepository<Tv, Integer> {
    Tv findByName(String name);
}

