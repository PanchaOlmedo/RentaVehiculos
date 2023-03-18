package ar.com.ada.backend12.rentavehiculosjpa.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.backend12.rentavehiculosjpa.DAO.CarroDAO;
import ar.com.ada.backend12.rentavehiculosjpa.model.Carro;
import ar.com.ada.backend12.rentavehiculosjpa.model.CarroList;

@Service
public class CarroServiceImpl implements CarroService {

	@Autowired
	CarroDAO carroDao;

	@Override
	public boolean insert(Carro e) {
		carroDao.save(e);
		return true;
	}

	@Override
	public Carro get(String placa) {
		Optional<Carro> optcarro = carroDao.findById(placa);

		if (!optcarro.isEmpty()) {
			return optcarro.get();
		} else {
			return null;
		}
	}

	@Override
	public CarroList getAll() {
		return new CarroList(carroDao.findAll());

	}

	@Override
	public Carro update(String placa, Carro e) {
		Carro dbc = get(placa);

		if (dbc != null) {
			if (e.getMarca() != null) {
				dbc.setMarca(e.getMarca());
			}

			if (e.getModelo() != null) {
				dbc.setModelo(e.getModelo());
			}

			if (e.getAnio() != null) {
				dbc.setAnio(e.getAnio());
			}

			if (e.getColor_vehiculo() != null) {
				dbc.setColor_vehiculo(e.getColor_vehiculo());
			}

			if (e.getTipo_vehiculo() != null) {
				dbc.setTipo_vehiculo(e.getTipo_vehiculo());
			}

			if (e.getCantidad_pasajeros() != null) {
				dbc.setCantidad_pasajeros(e.getCantidad_pasajeros());
			}

			if (e.getKilometraje() != null) {
				dbc.setKilometraje(e.getKilometraje());
			}

			if (e.getAire_acondicionado() != null) {
				dbc.setAire_acondicionado(e.getAire_acondicionado());
			}

			if (e.getValor_x_dia() != null) {
				dbc.setValor_x_dia(e.getValor_x_dia());
			}

			carroDao.save(dbc);

			return dbc;

		} else {
			return null;
		}
	}

	@Override
	public boolean delete(String placa) {
		Carro dbc = get(placa);
		if (dbc != null) {
			carroDao.deleteById(placa);
			return true;
		} else {
			return false;
		}

	}
}