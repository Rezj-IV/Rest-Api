package com.api.eshop.repository;


import com.api.eshop.domain.Mobile;
import com.api.eshop.domain.Wristwatch;
import org.springframework.data.jpa.repository.JpaRepository;


public interface WristwatchRepository extends JpaRepository<Wristwatch, Integer> {
    Wristwatch findByName(String name);
}

