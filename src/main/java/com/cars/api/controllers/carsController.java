package com.cars.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars.api.dto.CarsDTO;
import com.cars.api.model.Car;
import com.cars.api.repository.CarRepository;

@RestController
@RequestMapping("/api/cars")
public class carsController {
    @Autowired
    private CarRepository repository;

    @PostMapping
    public void RegisterCar(@RequestBody CarsDTO req) {
        repository.save(new Car(req));
    }

}
