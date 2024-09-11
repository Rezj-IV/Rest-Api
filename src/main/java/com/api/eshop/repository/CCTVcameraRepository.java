package com.api.eshop.repository;


import com.api.eshop.domain.CCTVcamera;
import com.api.eshop.domain.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CCTVcameraRepository extends JpaRepository<CCTVcamera, Integer> {
    CCTVcamera findByName(String name);
}

