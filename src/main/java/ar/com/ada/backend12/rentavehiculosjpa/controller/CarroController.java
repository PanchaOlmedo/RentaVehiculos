package ar.com.ada.backend12.rentavehiculosjpa.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ar.com.ada.backend12.rentavehiculosjpa.model.Carro;
import ar.com.ada.backend12.rentavehiculosjpa.service.CarroService;
import ar.com.ada.backend12.rentavehiculosjpa.util.ApiMessage;
import ar.com.ada.backend12.rentavehiculosjpa.util.ApiReturnable;

@RestController
public class CarroController {

	private static final ResponseEntity<ApiReturnable> NOT_FOUND = new ResponseEntity<ApiReturnable>(
			new ApiMessage("El carro no fue encontrado"), HttpStatus.NOT_FOUND);

	@Autowired
	CarroService Carroservice;

	// CREAR CARRO
	@PostMapping("/carro")
	private ResponseEntity<ApiReturnable> insert(@RequestParam String marca, @RequestParam String modelo,
			@RequestParam String anio, @RequestParam String color_vehiculo, @RequestParam String tipo_vehiculo,
			@RequestParam String placa, @RequestParam Integer cantidad_pasajeros, @RequestParam Integer kilometraje,
			@RequestParam String aire_acondicionado, @RequestParam BigDecimal valor_x_dia) {

		Carro e = new Carro();
		e.setMarca(marca);
		e.setModelo(modelo);
		e.setAnio(anio);
		e.setColor_vehiculo(color_vehiculo);
		e.setTipo_vehiculo(tipo_vehiculo);
		e.setPlaca(placa);
		e.setCantidad_pasajeros(cantidad_pasajeros);
		e.setKilometraje(kilometraje);
		e.setAire_acondicionado(aire_acondicionado);
		e.setValor_x_dia(valor_x_dia);

		Carroservice.insert(e);

		return new ResponseEntity<ApiReturnable>(e, HttpStatus.CREATED);

	}

	// ACTUALIZAR UN CARRO
	@PatchMapping("/carro/{placa}")
	private ResponseEntity<ApiReturnable> update(@PathVariable String placa,
			@RequestParam(required = false) String marca, @RequestParam(required = false) String modelo,
			@RequestParam(required = false) String anio, @RequestParam(required = false) String color_vehiculo,
			@RequestParam(required = false) String tipo_vehiculo,
			@RequestParam(required = false) Integer cantidad_pasajeros,
			@RequestParam(required = false) Integer kilometraje,
			@RequestParam(required = false) String aire_acondicionado,
			@RequestParam(required = false) BigDecimal valor_x_dia) {

		Carro e = new Carro();
		e.setMarca(marca);
		e.setModelo(modelo);
		e.setAnio(anio);
		e.setColor_vehiculo(color_vehiculo);
		e.setTipo_vehiculo(tipo_vehiculo);
		e.setCantidad_pasajeros(cantidad_pasajeros);
		e.setKilometraje(kilometraje);
		e.setAire_acondicionado(aire_acondicionado);
		e.setValor_x_dia(valor_x_dia);

		Carro dbc = Carroservice.update(placa, e);

		if (dbc != null) {
			return new ResponseEntity<ApiReturnable>(dbc, HttpStatus.OK);
		} else {
			return NOT_FOUND;
		}
	}

	// BUSCAR UN CARRO
	@GetMapping("/carro/{placa}")
	private ResponseEntity<ApiReturnable> get(@PathVariable String placa) {
		Carro e = Carroservice.get(placa);
		if (e != null) {
			return new ResponseEntity<ApiReturnable>(e, HttpStatus.OK);
		} else {
			return NOT_FOUND;
		}
	}

	// BUSCAR TODOS LOS CARROS
	@GetMapping("/carro")
	private ResponseEntity<ApiReturnable> getAll() {
		return new ResponseEntity<ApiReturnable>(Carroservice.getAll(), HttpStatus.OK);
	}

	// ELIMINAR CARRO
	@DeleteMapping("/carro/{placa}")
	private ResponseEntity<ApiReturnable> delete(@PathVariable String placa) {
		try {
			boolean deleted = false;
			deleted = Carroservice.delete(placa);

			if (deleted) {
				return new ResponseEntity<ApiReturnable>(new ApiMessage("Carro eliminado."), HttpStatus.OK);
			} else {
				return NOT_FOUND;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<ApiReturnable>(new ApiMessage("Error eliminando el carro."),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}