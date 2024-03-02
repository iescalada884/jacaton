package mentesDigitales.DFDAssistant.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import mentesDigitales.DFDAssistant.enums.material;

@Entity
@Getter
@Setter
public class Mapa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="mapa")
    private material[][] mapa;
}
