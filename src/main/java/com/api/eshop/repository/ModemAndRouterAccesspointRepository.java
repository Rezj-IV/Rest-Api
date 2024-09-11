package com.api.eshop.repository;


import com.api.eshop.domain.Mobile;
import com.api.eshop.domain.ModemAndRouterAccesspoint;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ModemAndRouterAccesspointRepository extends JpaRepository<ModemAndRouterAccesspoint, Integer> {
    ModemAndRouterAccesspoint findByName(String name);
}

