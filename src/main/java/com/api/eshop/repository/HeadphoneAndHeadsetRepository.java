package com.api.eshop.repository;


import com.api.eshop.domain.HeadphoneAndHeadset;
import com.api.eshop.domain.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;


public interface HeadphoneAndHeadsetRepository extends JpaRepository<HeadphoneAndHeadset, Integer> {
    HeadphoneAndHeadset findByName(String name);
}

