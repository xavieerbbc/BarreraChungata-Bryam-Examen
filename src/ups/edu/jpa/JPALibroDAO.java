package ups.edu.jpa;

import java.util.ArrayList;
import java.util.List;

import ups.edu.dao.LibroDAO;
import ups.edu.modelo.Autor;
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
	public Libro read(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Libro> findByAutororCapitulo(String context) {
		List<Libro> users = new ArrayList<Libro>();
		if (context.equals("all")) {
			users = (List<Libro>) em.createQuery("FROM Libro l").getResultList();
		} else {
			String jpql = "FROM Libro l WHERE a.nombre = '" + context + "' OR c.titulo = '" + context + "'";
			users = (List<Libro>) em.createQuery(jpql).getResultList();
		}
		return users;
	}

}
