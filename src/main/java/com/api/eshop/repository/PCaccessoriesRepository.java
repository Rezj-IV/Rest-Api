package com.api.eshop.repository;



import com.api.eshop.domain.PCaccessories;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PCaccessoriesRepository extends JpaRepository<PCaccessories, Integer> {
    PCaccessories findByName(String name);
}

