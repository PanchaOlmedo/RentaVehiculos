package ar.com.ada.backend12.rentavehiculosjpa.model;

import java.math.BigDecimal;

import ar.com.ada.backend12.rentavehiculosjpa.util.ApiReturnable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "contrato")
public class Contrato implements ApiReturnable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer contrato_id;

	private String placa;
	private Integer cliente_id;
	private Integer num_contrato;
	private String fecha_de_inicio;
	private Integer duracion;
	private BigDecimal valor_alq_x_dia;
	private BigDecimal valor_total_contrato;
	private Integer valor_cancelado;
	private Integer dias_en_mora;
	private BigDecimal saldo_mora;
	private BigDecimal saldo_total;

	public Contrato() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Integer getCliente_id() {
		return cliente_id;
	}

	public void setCliente_id(Integer cliente_id) {
		this.cliente_id = cliente_id;
	}

	public Integer getContrato_id() {
		return contrato_id;
	}

	public void setContrato_id(Integer contrato_id) {
		this.contrato_id = contrato_id;
	}

	public Integer getNum_contrato() {
		return num_contrato;
	}

	public void setNum_contrato(Integer num_contrato) {
		this.num_contrato = num_contrato;
	}

	public String getFecha_de_inicio() {
		return fecha_de_inicio;
	}

	public void setFecha_de_inicio(String fecha_de_inicio) {
		this.fecha_de_inicio = fecha_de_inicio;
	}

	public Integer getDuracion() {
		return duracion;
	}

	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}

	public BigDecimal getValor_alq_x_dia() {
		return valor_alq_x_dia;
	}

	public void setValor_alq_x_dia(BigDecimal valor_alq_x_dia) {
		this.valor_alq_x_dia = valor_alq_x_dia;
	}

	public BigDecimal getValor_total_contrato() {
		return valor_total_contrato;
	}

	public void setValor_total_contrato(BigDecimal valor_total_contrato) {
		this.valor_total_contrato = valor_total_contrato;
	}

	public Integer getValor_cancelado() {
		return valor_cancelado;
	}

	public void setValor_cancelado(Integer valor_cancelado) {
		this.valor_cancelado = valor_cancelado;
	}

	public Integer getDias_en_mora() {
		return dias_en_mora;
	}

	public void setDias_en_mora(Integer dias_en_mora) {
		this.dias_en_mora = dias_en_mora;
	}

	public BigDecimal getSaldo_mora() {
		return saldo_mora;
	}

	public void setSaldo_mora(BigDecimal saldo_mora) {
		this.saldo_mora = saldo_mora;
	}

	public BigDecimal getSaldo_total() {
		return saldo_total;
	}

	public void setSaldo_total(BigDecimal saldo_total) {
		this.saldo_total = saldo_total;
	}

}
