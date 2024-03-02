package mentesDigitales.DFDAssistant.entidades;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Conexion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    //parejas coordenadas
    @Column(name = "xIn")
    private int xIn;
    
    @Column(name = "yIn")
    private int yIn;
    
    @Column(name = "xOut")
    private int xOut;
    
    @Column(name = "yOut")
    private int yOut;
    
    //Seccion conectada
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "seccionId", referencedColumnName = "idSeccion")
    private Seccion seccion;
}
