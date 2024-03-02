package mentesDigitales.DFDAssistant.entidades.Ids;

import java.io.Serializable;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PlantaId implements Serializable {
	private Long numPlanta;
	private Long idEdificio;
}
