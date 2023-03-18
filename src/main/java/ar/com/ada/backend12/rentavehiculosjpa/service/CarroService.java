package ar.com.ada.backend12.rentavehiculosjpa.service;

import ar.com.ada.backend12.rentavehiculosjpa.model.Carro;
import ar.com.ada.backend12.rentavehiculosjpa.model.CarroList;

public interface CarroService {

//Crear un carro
	public boolean insert(Carro e);

	// Buscar un carro
	public Carro get(String placa);

	// Buscar varios carros
	public CarroList getAll();

	// Actualizar un carro
	public Carro update(String placa, Carro e);

	// Eliminar un carro
	public boolean delete(String placa);

}
