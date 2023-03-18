package ar.com.ada.backend12.rentavehiculosjpa.model;

import java.util.Date;

import ar.com.ada.backend12.rentavehiculosjpa.util.ApiReturnable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente implements ApiReturnable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer cliente_id;

	private String nombre;
	private String apellido;
	private Date fecha_nacimiento;
	private Integer num_identificacion;
	private Date fecha_vencimiento_identificacion;
	private Integer num_telefonico;

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getCliente_id() {
		return cliente_id;
	}

	public void setCliente_id(Integer cliente_id) {
		this.cliente_id = cliente_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public Integer getNum_identificacion() {
		return num_identificacion;
	}

	public void setNum_identificacion(Integer num_identificacion) {
		this.num_identificacion = num_identificacion;
	}

	public Date getFecha_vencimiento_identificacion() {
		return fecha_vencimiento_identificacion;
	}

	public void setFecha_vencimiento_identificacion(Date fecha_vencimiento_identificacion) {
		this.fecha_vencimiento_identificacion = fecha_vencimiento_identificacion;
	}

	public Integer getNum_telefonico() {
		return num_telefonico;
	}

	public void setNum_telefonico(Integer num_telefonico) {
		this.num_telefonico = num_telefonico;
	}

}
