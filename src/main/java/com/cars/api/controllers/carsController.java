package com.cars.api.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars.api.dto.CarsDTO;

@RestController
@RequestMapping("/api/cars")
public class carsController {
@PostMapping
public void RegisterCar (@RequestBody CarsDTO req){
    System.out.println( "\033[0;35m" + "\u001b[1mValor:\u001b[m" + req.valor());
    System.out.println( "\033[0;35m" + "\u001b[1mDataDeFabricação:\u001b[m"  + req.dataFabricacao());
    System.out.println( "\033[0;35m" + " \u001b[1mModelo:\u001b[m:" + req.modelo());
    System.out.println( "\033[0;35m" + " \u001b[1mFabricante:\u001b[m" + req.fabricante());
    System.out.println( "\033[0;35m" + " \u001b[1mAnoModelo:\u001b[m" + req.anoModelo());
 
}
    
}
