package ups.edu.jpa;

import java.util.List;

import ups.edu.dao.LibroDAO;
import ups.edu.modelo.Libro;

public class JPALibroDAO extends JPAGenericDAO<Libro, Integer> implements LibroDAO{

	public JPALibroDAO() {
		super(Libro.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createTable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Libro findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Libro> find() {
		// TODO Auto-generated method stub
		return null;
	}

}
