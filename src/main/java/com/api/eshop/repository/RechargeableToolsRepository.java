package com.api.eshop.repository;


import com.api.eshop.domain.Mobile;
import com.api.eshop.domain.RechargeableTools;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RechargeableToolsRepository extends JpaRepository<RechargeableTools, Integer> {
    RechargeableTools findByName(String name);
}

