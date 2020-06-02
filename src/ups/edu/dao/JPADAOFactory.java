package ups.edu.dao;

import ups.edu.jpa.JPAAutorDAO;
import ups.edu.jpa.JPACapituloDAO;
import ups.edu.jpa.JPALibroDAO;

public class JPADAOFactory extends DAOFactory{

	@Override
	public AutorDAO getAutorDAO() {
		return new JPAAutorDAO();
	}

	@Override
	public LibroDAO getLibroDAO() {
		return new JPALibroDAO();
	}

	@Override
	public CapituloDAO getCapituloDAO() {
		return new JPACapituloDAO();
	}
	
	
	
}
