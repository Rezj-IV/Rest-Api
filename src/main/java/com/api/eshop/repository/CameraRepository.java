package com.api.eshop.repository;


import com.api.eshop.domain.Camera;
import com.api.eshop.domain.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CameraRepository extends JpaRepository<Camera, Integer> {
   Camera  findByName(String name);
}

