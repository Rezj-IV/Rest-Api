package com.api.eshop.repository;


import com.api.eshop.domain.AllinOne;

import org.springframework.data.jpa.repository.JpaRepository;


public interface AllinOneRepository extends JpaRepository<AllinOne, Integer> {
    AllinOne findByName(String name);
}

