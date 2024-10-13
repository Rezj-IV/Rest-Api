package com.api.eshop.repository;



import com.api.eshop.domain.Headset;
import com.api.eshop.domain.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;


public interface HeadsetRepository extends JpaRepository<Headset, Integer> {
    Headset findByName(String name);
}

