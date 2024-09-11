package com.api.eshop.repository;


import com.api.eshop.domain.CPparts;
import com.api.eshop.domain.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CPpartsRepository extends JpaRepository<CPparts, Integer> {
    CPparts findByName(String name);
}

