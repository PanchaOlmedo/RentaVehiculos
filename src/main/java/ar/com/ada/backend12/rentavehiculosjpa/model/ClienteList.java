package ar.com.ada.backend12.rentavehiculosjpa.model;

import java.util.List;

import ar.com.ada.backend12.rentavehiculosjpa.util.ApiReturnable;

public class ClienteList implements ApiReturnable {

	private List<Cliente> clientes;

	public ClienteList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClienteList(List<Cliente> clientes) {
		super();
		this.clientes = clientes;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

}
