package com.cars.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.cars.api.repository.CarRepository;
import com.cars.api.dto.CarsDTO;
import com.cars.api.model.Car;

@Service
public class CarService {

    @Autowired
	private CarRepository repository;


    public void RegisterCar(Car data) {
       repository.save(data);
    }

    public List<Car> GetAllCarsRegisters() {
        List<Car> cars = repository.findAll();
        return cars;
    }

    public String DeleteCarById(@PathVariable Long id) {
        repository.deleteById(id);
        String sucess = " Car " + id + " has been deleted ";
        return sucess;
    }

    public Optional<Car> findById(@PathVariable Long id) {
        Optional<Car> car = repository.findById(id);
        return car;
    }

    public void updateCar(Long id, CarsDTO data){
        repository.findById(id).map(e -> {
			e.setAnoModelo(data.anoModelo());
		    e.setFabricante(data.fabricante());
            e.setDataFabricacao(data.dataFabricacao());
            e.setValor(data.valor());
            e.setModelo(data.modelo());
			return repository.save(e);
		});
    }

}
