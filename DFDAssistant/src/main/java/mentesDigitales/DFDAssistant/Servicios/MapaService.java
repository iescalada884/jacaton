package mentesDigitales.DFDAssistant.Servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mentesDigitales.DFDAssistant.entidades.Mapa;
import mentesDigitales.DFDAssistant.repositorios.Interfaces.IMapaRepositorio;

@Service
public class MapaService {

	private final IMapaRepositorio mapaRepository;
	
	@Autowired
    public MapaService(IMapaRepositorio mapaRepository) {
        this.mapaRepository = mapaRepository;
    }

    public Mapa guardarMapa(Mapa mapa) {
        return mapaRepository.save(mapa);
    }

    public Optional<Mapa> buscarPorId(Long id) {
        return mapaRepository.findById(id);
    }

    public List<Mapa> buscarTodasLasMapas() {
        return mapaRepository.findAll();
    }

    public void eliminarMapa(Long id) {
        mapaRepository.deleteById(id);
    }
}
