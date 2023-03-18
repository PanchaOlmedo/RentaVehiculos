package ar.com.ada.backend12.rentavehiculosjpa.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import ar.com.ada.backend12.rentavehiculosjpa.DAO.ClienteDAO;
import ar.com.ada.backend12.rentavehiculosjpa.model.Cliente;
import ar.com.ada.backend12.rentavehiculosjpa.model.ClienteList;

public class ClienteServiceImpl implements ClienteService {

	@Autowired
	ClienteDAO clienteDao;

	@Override
	public boolean insert(Cliente f) {
		clienteDao.save(f);
		return true;
	}

	@Override
	public Cliente get(Integer id) {
		Optional<Cliente> optcliente = clienteDao.findById(id);

		if (!optcliente.isEmpty()) {
			return optcliente.get();
		} else {
			return null;
		}
	}

	@Override
	public ClienteList getAll() {
		return new ClienteList(clienteDao.findAll());

	}

	@Override
	public Cliente update(Integer id, Cliente f) {
		Cliente dbcl = get(id);

		if (dbcl != null) {
			if (f.getNombre() != null) {
				dbcl.setNombre(f.getNombre());
			}

			if (f.getApellido() != null) {
				dbcl.setApellido(f.getApellido());
			}

			if (f.getFecha_nacimiento() != null) {
				dbcl.setFecha_nacimiento(f.getFecha_nacimiento());
			}

			if (f.getNum_identificacion() != null) {
				dbcl.setNum_identificacion(f.getNum_identificacion());
			}

			if (f.getFecha_vencimiento_identificacion() != null) {
				dbcl.setFecha_vencimiento_identificacion(f.getFecha_vencimiento_identificacion());
			}

			if (f.getNum_telefonico() != null) {
				dbcl.setNum_telefonico(f.getNum_telefonico());
			}

			clienteDao.save(dbcl);

			return dbcl;

		} else {
			return null;
		}

	}

	@Override
	public boolean delete(Integer id) {
		Cliente dbcl = get(id);
		if (dbcl != null) {
			clienteDao.deleteById(id);
			return true;
		} else {
			return false;
		}

	}
}
