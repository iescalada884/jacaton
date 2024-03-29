package mentesDigitales.DFDAssistant.repositorios.Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mentesDigitales.DFDAssistant.entidades.Conexion;

@Repository
public interface IConexionRepositorio extends JpaRepository<Conexion, Long> {

}
