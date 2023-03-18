package ar.com.ada.backend12.rentavehiculosjpa.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.ada.backend12.rentavehiculosjpa.model.Contrato;

public interface ContratoDAO extends JpaRepository<Contrato, Integer> {

}
