package entitiesextendsDAO;

import java.util.List;

import entities.Pluviosidade;

public class PluviosidadeDAO extends DAO<Identificavel> {
	
	public PluviosidadeDAO() {
		super(Identificavel.class);
	}

	public List<Pluviosidade> findBy(Pluviosidade filtro) {
		return null;
	}

}
