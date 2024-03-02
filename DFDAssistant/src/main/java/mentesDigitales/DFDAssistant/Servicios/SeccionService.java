package mentesDigitales.DFDAssistant.Servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mentesDigitales.DFDAssistant.entidades.Seccion;
import mentesDigitales.DFDAssistant.repositorios.Interfaces.ISeccionRepositorio;

@Service
public class SeccionService {

	private final ISeccionRepositorio seccionRepository;
	
	@Autowired
    public SeccionService(ISeccionRepositorio seccionRepository) {
        this.seccionRepository = seccionRepository;
    }

    public Seccion guardarSeccion(Seccion seccion) {
        return seccionRepository.save(seccion);
    }

    public Optional<Seccion> buscarPorId(Long id) {
        return seccionRepository.findById(id);
    }

    public List<Seccion> buscarTodasLasSecciones() {
        return seccionRepository.findAll();
    }

    public void eliminarSeccion(Long id) {
        seccionRepository.deleteById(id);
    }
}
