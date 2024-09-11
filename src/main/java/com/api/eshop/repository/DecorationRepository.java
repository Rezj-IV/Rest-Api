package com.api.eshop.repository;


import com.api.eshop.domain.Decoration;
import com.api.eshop.domain.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DecorationRepository extends JpaRepository<Decoration, Integer> {
    Decoration findByName(String name);
}

