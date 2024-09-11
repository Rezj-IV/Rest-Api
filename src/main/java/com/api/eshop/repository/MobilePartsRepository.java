package com.api.eshop.repository;


import com.api.eshop.domain.Mobile;
import com.api.eshop.domain.MobileParts;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MobilePartsRepository extends JpaRepository<MobileParts, Integer> {
    MobileParts findByName(String name);
}

