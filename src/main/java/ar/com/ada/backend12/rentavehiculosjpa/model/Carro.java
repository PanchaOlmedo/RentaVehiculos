package ar.com.ada.backend12.rentavehiculosjpa.model;

import java.math.BigDecimal;

import ar.com.ada.backend12.rentavehiculosjpa.util.ApiReturnable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "carro")

public class Carro implements ApiReturnable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "carro_id")
	private Integer id;

	private String marca;
	private String modelo;
	private String anio;
	private String color_vehiculo;
	private String tipo_vehiculo;
	private String placa;
	private Integer cantidad_pasajeros;
	private Integer kilometraje;
	private String aire_acondicionado;
	private BigDecimal valor_x_dia;

	public Carro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String getColor_vehiculo() {
		return color_vehiculo;
	}

	public void setColor_vehiculo(String color_vehiculo) {
		this.color_vehiculo = color_vehiculo;
	}

	public String getTipo_vehiculo() {
		return tipo_vehiculo;
	}

	public void setTipo_vehiculo(String tipo_vehiculo) {
		this.tipo_vehiculo = tipo_vehiculo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Integer getCantidad_pasajeros() {
		return cantidad_pasajeros;
	}

	public void setCantidad_pasajeros(Integer cantidad_pasajeros) {
		this.cantidad_pasajeros = cantidad_pasajeros;
	}

	public Integer getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(Integer kilometraje) {
		this.kilometraje = kilometraje;
	}

	public String getAire_acondicionado() {
		return aire_acondicionado;
	}

	public void setAire_acondicionado(String aire_acondicionado) {
		this.aire_acondicionado = aire_acondicionado;
	}

	public BigDecimal getValor_x_dia() {
		return valor_x_dia;
	}

	public void setValor_x_dia(BigDecimal valor_x_dia) {
		this.valor_x_dia = valor_x_dia;
	}

}
