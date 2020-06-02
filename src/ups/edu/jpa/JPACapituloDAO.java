package ups.edu.jpa;

import java.util.List;

import ups.edu.dao.CapituloDAO;
import ups.edu.modelo.Autor;
import ups.edu.modelo.Capitulo;
import ups.edu.modelo.Libro;

public class JPACapituloDAO extends JPAGenericDAO<Capitulo, Integer> implements CapituloDAO{

	public JPACapituloDAO() {
		super(Capitulo.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createTable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Capitulo findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Capitulo> find() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Libro read(Autor autor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Libro> findByAutor(Autor autor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Capitulo findCapitulo(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
