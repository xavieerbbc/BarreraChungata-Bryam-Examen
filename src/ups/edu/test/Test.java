package ups.edu.test;

import ups.edu.dao.AutorDAO;
import ups.edu.dao.DAOFactory;
import ups.edu.modelo.Autor;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutorDAO ud= DAOFactory.getDAOFactory().getAutorDAO();
		
		Autor a1= new Autor(1, "bryam", "ecuatoriana");
		ud.create(a1);
		
	}

}
