package ar.com.ada.backend12.rentavehiculosjpa.model;

import java.util.List;

public class ContratoList {

	private List<Contrato> contratos;

	public ContratoList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContratoList(List<Contrato> contratos) {
		super();
		this.contratos = contratos;
	}

	public List<Contrato> getContratos() {
		return contratos;
	}

	public void setContratos(List<Contrato> contratos) {
		this.contratos = contratos;
	}

}
