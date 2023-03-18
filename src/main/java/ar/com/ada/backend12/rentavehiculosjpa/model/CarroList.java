package ar.com.ada.backend12.rentavehiculosjpa.model;

import java.util.List;

import ar.com.ada.backend12.rentavehiculosjpa.util.ApiReturnable;

public class CarroList implements ApiReturnable {
	private List<Carro> carros;

	public CarroList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CarroList(List<Carro> carros) {
		super();
		this.carros = carros;
	}

	public List<Carro> getcarros() {
		return carros;
	}

	public void setcarros(List<Carro> carros) {
		this.carros = carros;
	}

}
