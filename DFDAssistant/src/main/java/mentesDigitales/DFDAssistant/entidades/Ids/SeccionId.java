package mentesDigitales.DFDAssistant.entidades.Ids;

import java.io.Serializable;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SeccionId implements Serializable{
	private Long idSeccion;
	private Long numPlanta;
	private Long idEdificio;
}
