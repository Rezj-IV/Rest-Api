package com.api.eshop.repository;


import com.api.eshop.domain.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MobileRepository extends JpaRepository<Mobile, Integer> {
    Mobile findByName(String name);
}

