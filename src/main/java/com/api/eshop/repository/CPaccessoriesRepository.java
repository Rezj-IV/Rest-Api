package com.api.eshop.repository;


import com.api.eshop.domain.CPaccessories;
import com.api.eshop.domain.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CPaccessoriesRepository extends JpaRepository<CPaccessories, Integer> {
    CPaccessories findByName(String name);
}

