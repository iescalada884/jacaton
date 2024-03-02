package mentesDigitales.DFDAssistant.entidades;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Planta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numPlanta;
	
	@Id
	private Long idEdificio;
	
	 @ManyToMany
	 private List<Seccion> secciones;
}
