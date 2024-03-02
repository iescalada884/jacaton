package mentesDigitales.DFDAssistant.Servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mentesDigitales.DFDAssistant.entidades.Conexion;
import mentesDigitales.DFDAssistant.repositorios.Interfaces.IConexionRepositorio;

@Service
public class ConexionService {

	private final IConexionRepositorio conexionRepository;
	
	@Autowired
    public ConexionService(IConexionRepositorio conexionRepository) {
        this.conexionRepository = conexionRepository;
    }

    public Conexion guardarConexion(Conexion conexion) {
        return conexionRepository.save(conexion);
    }

    public Optional<Conexion> buscarPorId(Long id) {
        return conexionRepository.findById(id);
    }

    public List<Conexion> buscarTodasLasConexiones() {
        return conexionRepository.findAll();
    }

    public void eliminarConexion(Long id) {
        conexionRepository.deleteById(id);
    }
}
