package ar.com.ada.backend12.rentavehiculosjpa.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.com.ada.backend12.rentavehiculosjpa.model.Cliente;
import ar.com.ada.backend12.rentavehiculosjpa.service.ClienteService;
import ar.com.ada.backend12.rentavehiculosjpa.util.ApiMessage;
import ar.com.ada.backend12.rentavehiculosjpa.util.ApiReturnable;

public class ClienteController {
	private static final ResponseEntity<ApiReturnable> NOT_FOUND = new ResponseEntity<ApiReturnable>(
			new ApiMessage("El cliente no fue encontrado"), HttpStatus.NOT_FOUND);

	@Autowired
	ClienteService Clienteservice;

	// CREAR CLIENTE
	@PostMapping("/cliente")
	private ResponseEntity<ApiReturnable> insert(@RequestParam String nombre, @RequestParam String apellido,
			@RequestParam Date fecha_nacimiento, @RequestParam Integer num_identificacion,
			@RequestParam Date fecha_vencimiento_identificacion, @RequestParam Integer num_telefonico) {

		Cliente f = new Cliente();
		f.setNombre(nombre);
		f.setApellido(apellido);
		f.setFecha_nacimiento(fecha_nacimiento);
		f.setNum_identificacion(num_identificacion);
		f.setFecha_vencimiento_identificacion(fecha_vencimiento_identificacion);
		f.setNum_telefonico(num_telefonico);

		Clienteservice.insert(f);

		return new ResponseEntity<ApiReturnable>(f, HttpStatus.CREATED);

	}

	// ACTUALIZAR UN CLIENTE
	@PatchMapping("/cliente/{id}")
	private ResponseEntity<ApiReturnable> update(@PathVariable Integer id,
			@RequestParam(required = false) String nombre, @RequestParam(required = false) String apellido,
			@RequestParam(required = false) Date fecha_nacimiento,
			@RequestParam(required = false) Integer num_identificacion,
			@RequestParam(required = false) Date fecha_vencimiento_identificacion,
			@RequestParam(required = false) Integer num_telefonico) {

		Cliente f = new Cliente();
		f.setNombre(nombre);
		f.setApellido(apellido);
		f.setFecha_nacimiento(fecha_nacimiento);
		f.setNum_identificacion(num_identificacion);
		f.setFecha_vencimiento_identificacion(fecha_vencimiento_identificacion);
		f.setNum_telefonico(num_telefonico);

		Cliente dbcl = Clienteservice.update(id, f);

		if (dbcl != null) {
			return new ResponseEntity<ApiReturnable>(dbcl, HttpStatus.OK);
		} else {
			return NOT_FOUND;
		}
	}

	// BUSCAR UN CLIENTE
	@GetMapping("/cliente/{id}")
	private ResponseEntity<ApiReturnable> get(@PathVariable Integer id) {
		Cliente f = Clienteservice.get(id);
		if (f != null) {
			return new ResponseEntity<ApiReturnable>(f, HttpStatus.OK);
		} else {
			return NOT_FOUND;
		}
	}

	// BUSCAR TODOS LOS CLIENTES
	@GetMapping("/cliente")
	private ResponseEntity<ApiReturnable> getAll() {
		return new ResponseEntity<ApiReturnable>(Clienteservice.getAll(), HttpStatus.OK);
	}

	// ELIMINAR CLIENTE
	@DeleteMapping("/cliente/{id}")
	private ResponseEntity<ApiReturnable> delete(@PathVariable Integer id) {
		try {
			boolean deleted = false;
			deleted = Clienteservice.delete(id);

			if (deleted) {
				return new ResponseEntity<ApiReturnable>(new ApiMessage("Cliente eliminado."), HttpStatus.OK);
			} else {
				return NOT_FOUND;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<ApiReturnable>(new ApiMessage("Error eliminando el cliente."),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
