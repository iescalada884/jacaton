package mentesDigitales.DFDAssistant.repositorios.Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mentesDigitales.DFDAssistant.entidades.Mapa;

@Repository
public interface IMapaRepositorio extends JpaRepository<Mapa, Long> {

}