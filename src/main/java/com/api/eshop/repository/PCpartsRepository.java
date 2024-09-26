package com.api.eshop.repository;



import com.api.eshop.domain.PCparts;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PCpartsRepository extends JpaRepository<PCparts, Integer> {
    PCparts findByName(String name);
}

