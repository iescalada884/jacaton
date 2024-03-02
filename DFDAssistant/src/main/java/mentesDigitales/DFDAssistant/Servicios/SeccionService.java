package mentesDigitales.DFDAssistant.Servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mentesDigitales.DFDAssistant.entidades.Seccion;
import mentesDigitales.DFDAssistant.entidades.Ids.PlantaId;
import mentesDigitales.DFDAssistant.entidades.Ids.SeccionId;
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

    public Optional<Seccion> buscarPorIdCompuesta(Long idEdificio, Long numPlanta, Long idSeccion) {
        SeccionId seccionId = new SeccionId();

        seccionId.setIdEdificio(idEdificio);
        seccionId.setNumPlanta(numPlanta);
        seccionId.setIdSeccion(seccionId);
        
        return seccionRepository.findById(seccionId);
    }

    public List<Seccion> buscarTodasLasSecciones() {
        return seccionRepository.findAll();
    }

    public void eliminarSeccion(Long idEdificio, Long numPlanta, Long idSeccion) {
        SeccionId seccionId = new SeccionId();

        seccionId.setIdEdificio(idEdificio);
        seccionId.setNumPlanta(numPlanta);
        seccionId.setIdSeccion(seccionId);
        
        seccionRepository.deleteById(seccionId);
    }
}
