package ups.edu.jpa;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import ups.edu.dao.AutorDAO;
import ups.edu.modelo.Autor;
import ups.edu.modelo.Libro;



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
CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		
		CriteriaQuery<Autor> criteriaQuery = criteriaBuilder.createQuery(Autor.class);
		
		Root<Autor> usuarioRoot = criteriaQuery.from(Autor.class);
		
		Predicate predicado = criteriaBuilder.equal(usuarioRoot.get("codigo"), id);
		
		criteriaQuery.select(usuarioRoot).where(predicado);
		
		try {
			return em.createQuery(criteriaQuery).getSingleResult();
		}catch(NoResultException e) {
			return new Autor();
		}
	}

	@Override
	public List<Autor> find() {
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
	public Autor findUser(int codigo) {
		Autor user = new Autor();
		String consulta =("SELECT a FROM Autor a WHERE a.codigo='"+codigo+'"');
		try {
			user= (Autor) em.createQuery(consulta).getSingleResult();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return user;
	}
}