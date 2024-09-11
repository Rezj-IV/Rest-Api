package com.api.eshop.controller;

import com.api.eshop.repository.ElectricToolsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("ElectricTools")
public class ElectricToolsController {
    @Autowired
    ElectricToolsRepository repository;

    @GetMapping
    @CrossOrigin("*")
    public ResponseEntity getAll(){ return  new ResponseEntity(repository.findAll(), HttpStatus.OK);};

    @GetMapping("{id}")
    @CrossOrigin("*")
    public ResponseEntity getById(@PathVariable Integer id)
    {
        return  new ResponseEntity(repository.findById(id), HttpStatus.OK);


    };
    @GetMapping("name/{name}")
    @CrossOrigin("*")
    public ResponseEntity getByName(@PathVariable String name)
    {
        return  new ResponseEntity(repository.findByName(name), HttpStatus.OK);


    }
}
