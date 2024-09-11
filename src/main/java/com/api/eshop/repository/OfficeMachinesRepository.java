package com.api.eshop.repository;


import com.api.eshop.domain.Mobile;
import com.api.eshop.domain.OfficeMachines;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OfficeMachinesRepository extends JpaRepository<OfficeMachines, Integer> {
    OfficeMachines findByName(String name);
}

