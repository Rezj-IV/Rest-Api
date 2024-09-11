package com.api.eshop.repository;


import com.api.eshop.domain.Mobile;
import com.api.eshop.domain.Tablet;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TabletRepository extends JpaRepository<Tablet, Integer> {
    Tablet findByName(String name);
}

