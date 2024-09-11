package com.api.eshop.repository;


import com.api.eshop.domain.GameConsoles;
import com.api.eshop.domain.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GameConsolesRepository extends JpaRepository<GameConsoles, Integer> {
    GameConsoles findByName(String name);
}

