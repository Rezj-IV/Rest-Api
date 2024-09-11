package com.api.eshop.repository;


import com.api.eshop.domain.Handsfree;
import com.api.eshop.domain.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;


public interface HandsfreeRepository extends JpaRepository<Handsfree, Integer> {
    Handsfree findByName(String name);
}

