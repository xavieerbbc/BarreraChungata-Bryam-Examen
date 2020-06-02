package ups.edu.dao;

import java.util.List;

import ups.edu.modelo.Libro;

public interface LibroDAO extends GenericDAO<Libro, Integer> {
	public abstract Libro read(int codigo);
	public abstract List<Libro> findByAutororCapitulo(String context);
}
