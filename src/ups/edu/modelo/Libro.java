package ups.edu.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Libro
 *
 */
@Entity

public class Libro implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	private int codigo;
	private String nombre;
	private String ISBN;
	private int numeroPaginas;
	
	
	
	public Libro() {
		super();
	}
   
}
