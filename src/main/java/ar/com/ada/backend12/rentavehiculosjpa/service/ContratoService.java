package ar.com.ada.backend12.rentavehiculosjpa.service;

import ar.com.ada.backend12.rentavehiculosjpa.model.Contrato;
import ar.com.ada.backend12.rentavehiculosjpa.model.ContratoList;

public interface ContratoService {

	// Crear un contrato
	public boolean insert(Contrato c);

	// Buscar un contrato
	public Contrato get(Integer num_contrato);

	// Listar todos los contratos
	public ContratoList getAll();

	// Cerrar contrato
	public Contrato exist(Integer num_contrato);
}
