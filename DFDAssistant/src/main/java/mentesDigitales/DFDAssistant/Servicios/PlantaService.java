package mentesDigitales.DFDAssistant.Servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mentesDigitales.DFDAssistant.entidades.Planta;
import mentesDigitales.DFDAssistant.entidades.Ids.PlantaId;
import mentesDigitales.DFDAssistant.repositorios.Interfaces.IPlantaRepositorio;

@Service
public class PlantaService {

	private final IPlantaRepositorio plantaRepository;
	
	@Autowired
    public PlantaService(IPlantaRepositorio plantaRepository) {
        this.plantaRepository = plantaRepository;
    }

    public Planta guardarPlanta(Planta planta) {
        return plantaRepository.save(planta);
    }

    public Optional<Planta> buscarPorIdCompuesta(Long idEdificio, Long idPlanta) {
        PlantaId plantaId = new PlantaId();
        plantaId.setIdEdificio(idEdificio);
        idPlanta.setIdPlanta(idPlanta);
        
    	return plantaRepository.findById(plantaId);
    }

    public List<Planta> buscarTodasLasPlantas() {
        return plantaRepository.findAll();
    }

    public void eliminarPlantaIdCompuesta(Long idEdificio, Long idPlanta) {
        PlantaId plantaId = new PlantaId();
        plantaId.setIdEdificio(idEdificio);
        idPlanta.setIdPlanta(idPlanta);
        
        plantaRepository.deleteById(plantaId);
    }
}
