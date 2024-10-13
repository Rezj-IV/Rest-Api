package com.api.eshop.repository;


import com.api.eshop.domain.Headphone;
import com.api.eshop.domain.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;


public interface HeadphoneRepository extends JpaRepository<Headphone, Integer> {
    Headphone findByName(String name);
}

