package mentesDigitales.DFDAssistant.repositorios.Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mentesDigitales.DFDAssistant.entidades.Planta;

@Repository
public interface IPlantaRepositorio extends JpaRepository<Planta, Long> {

}
