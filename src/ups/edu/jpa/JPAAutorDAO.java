package ups.edu.jpa;

import java.util.List;

import ups.edu.dao.AutorDAO;
import ups.edu.modelo.Autor;

public class JPAAutorDAO extends JPAGenericDAO<Autor, Integer> implements AutorDAO{

	public JPAAutorDAO() {
		super(Autor.class);
		// TODO Auto-generated constructor stub
	}
	
	



	@Override
	public void createTable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Autor findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Autor> find() {
		// TODO Auto-generated method stub
		return null;
	}
}