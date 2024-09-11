package com.api.eshop.repository;


import com.api.eshop.domain.Mobile;
import com.api.eshop.domain.Monitor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MonitorRepository extends JpaRepository<Monitor, Integer> {
    Monitor findByName(String name);
}

