package ar.com.ada.backend12.rentavehiculosjpa.service;

import ar.com.ada.backend12.rentavehiculosjpa.model.Cliente;
import ar.com.ada.backend12.rentavehiculosjpa.model.ClienteList;

public interface ClienteService {

	// Crear un cliente
	public boolean insert(Cliente f);

	// Buscar un cliente
	public Cliente get(Integer id);

	// Listar clientes
	public ClienteList getAll();

	// Actualizar un cliente
	public Cliente update(Integer id, Cliente f);

	// Eliminar un cliente
	public boolean delete(Integer id);

}
