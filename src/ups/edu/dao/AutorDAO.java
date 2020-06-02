package ups.edu.dao;

import ups.edu.modelo.Autor;

public interface AutorDAO  extends GenericDAO<Autor, Integer>{
	public abstract Autor findUser(int codigo);
}
