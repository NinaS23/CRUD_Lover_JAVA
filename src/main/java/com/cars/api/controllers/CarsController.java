package com.cars.api.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cars.api.dto.CarsDTO;
import com.cars.api.model.Car;
import com.cars.api.repository.CarRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/cars")
public class CarsController {
    @Autowired
    private CarRepository repository;

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public void RegisterCar(@RequestBody @Valid CarsDTO req) {
        repository.save(new Car(req));
    }

    @GetMapping
    public List<Car> GetAllCarsRegisters() {
        List<Car> cars = repository.findAll();
        return cars;
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public String DeleteCarById(@PathVariable Long id) {
        repository.deleteById(id);
        String sucess = " Car " + id + " has been deleted ";
        return sucess;
    }

    @GetMapping("/{id}")
    public Optional<Car> findById(@PathVariable Long id) {
        Optional<Car> car = repository.findById(id);
        return car;
    }

}
