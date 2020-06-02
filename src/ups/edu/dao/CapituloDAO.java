package ups.edu.dao;

import ups.edu.modelo.Capitulo;

public interface CapituloDAO extends GenericDAO<Capitulo, Integer>{
	public abstract Capitulo findCapitulo(int codigo);
}
