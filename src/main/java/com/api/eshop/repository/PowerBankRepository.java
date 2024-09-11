package com.api.eshop.repository;


import com.api.eshop.domain.Mobile;
import com.api.eshop.domain.PowerBank;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PowerBankRepository extends JpaRepository<PowerBank, Integer> {
    PowerBank findByName(String name);
}

