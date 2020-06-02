package ups.edu.dao;

import java.util.List;

import ups.edu.modelo.Autor;
import ups.edu.modelo.Libro;

public interface GenericDAO<T, ID> {

    public void createTable();

    public void create(T entity);
    
    public T read(ID id);

    public T findById(ID id);

    public void update(T entity);

    public void delete(T entity);

    public List<T> find();
    
    Libro read(Autor autor);
    
    List<Libro> findByAutor(Autor autor);
}
