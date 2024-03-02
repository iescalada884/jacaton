package mentesDigitales.DFDAssistant.entidades;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import mentesDigitales.DFDAssistant.entidades.Ids.SeccionId;

@Entity
@Getter
@Setter
@IdClass(SeccionId.class)
public class Seccion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSeccion;
	
	@Id
	private Long numPlanta;
	
	@Id
	private Long idEdificio;
	
	@OneToOne
	@JoinColumn(name = "mapa", referencedColumnName = "id")
    private Mapa mapa;
	
	 @ManyToMany
	 private List<Conexion> conexiones;
	
	
	
}