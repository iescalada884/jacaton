package mentesDigitales.DFDAssistant.entidades;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;
import mentesDigitales.DFDAssistant.entidades.Ids.PlantaId;

@Entity
@Getter
@Setter
@IdClass(PlantaId.class)
public class Planta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numPlanta;
	
	@Id
	private Long idEdificio;
	
	 @ManyToMany
	 private List<Seccion> secciones;
}
