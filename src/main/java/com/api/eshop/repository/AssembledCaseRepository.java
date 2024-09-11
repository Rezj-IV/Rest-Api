package com.api.eshop.repository;


import com.api.eshop.domain.AssembledCase;
import com.api.eshop.domain.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AssembledCaseRepository extends JpaRepository<AssembledCase, Integer> {
    AssembledCase findByName(String name);
}

