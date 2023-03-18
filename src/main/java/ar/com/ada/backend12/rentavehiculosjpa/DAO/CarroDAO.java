package ar.com.ada.backend12.rentavehiculosjpa.DAO;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.ada.backend12.rentavehiculosjpa.model.Carro;

@Repository
public interface CarroDAO extends JpaRepository<Carro, Integer> {

	Optional<Carro> findById(String placa);

	void deleteById(String placa);

}
