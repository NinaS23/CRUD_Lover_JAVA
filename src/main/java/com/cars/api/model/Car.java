package com.cars.api.model;

import com.cars.api.dto.CarsDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Car {

    public Car(CarsDTO req) {
		this.modelo = req.modelo();
		this.fabricante = req.fabricante();
		this.anoModelo = req.anoModelo();
		this.valor = req.valor();
		this.dataFabricacao = req.dataFabricacao();
	}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(length = 15, nullable = false)
    private String modelo;

    @Column(length = 20, nullable = false)
    private String fabricante;

    @Column(length = 10, nullable = false)
    private String dataFabricacao;

    @Column(nullable = false)
    private Double valor;

    @Column(nullable = false)
    private int anoModelo;
}
