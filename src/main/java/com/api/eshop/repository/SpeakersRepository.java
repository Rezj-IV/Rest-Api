package com.api.eshop.repository;


import com.api.eshop.domain.Mobile;
import com.api.eshop.domain.Speakers;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SpeakersRepository extends JpaRepository<Speakers, Integer> {
    Speakers findByName(String name);
}

