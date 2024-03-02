package mentesDigitales.DFDAssistant.repositorios.Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mentesDigitales.DFDAssistant.entidades.Edificio;

@Repository
public interface IEdificioRepository extends JpaRepository<Edificio, Long> {

}
