package entitiesextendsDAO;

import java.util.List;

import entities.Noticias;

public class NoticiasDAO extends DAO<Identificavel> {
	
	public NoticiasDAO() {
		super(Identificavel.class);
	}

	public List<Noticias> findBy(Noticias filtro) {
		return null;
	}

}
