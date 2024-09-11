package com.api.eshop.repository;


import com.api.eshop.domain.Mobile;
import com.api.eshop.domain.MobileAccessories;
import org.springframework.data.jpa.repository.JpaRepository;



public interface MobileAccessoriesRepository extends JpaRepository<MobileAccessories, Integer> {
    MobileAccessories findByName(String name);
}
