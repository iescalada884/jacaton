package mentesDigitales.DFDAssistant.Servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mentesDigitales.DFDAssistant.entidades.Edificio;
import mentesDigitales.DFDAssistant.repositorios.Interfaces.IEdificioRepository;

@Service
public class EdificioService {

	private final IEdificioRepository edificioRepository;
	
	@Autowired
    public EdificioService(IEdificioRepository edificioRepository) {
        this.edificioRepository = edificioRepository;
    }

    public Edificio guardarEdificio(Edificio edificio) {
        return edificioRepository.save(edificio);
    }

    public Optional<Edificio> buscarPorId(Long id) {
        return edificioRepository.findById(id);
    }

    public List<Edificio> buscarTodasLasEdificioes() {
        return edificioRepository.findAll();
    }

    public void eliminarEdificio(Long id) {
        edificioRepository.deleteById(id);
    }
}
