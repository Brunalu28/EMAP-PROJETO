package entitiesextendsDAO;

import java.util.List;

import entities.Nivel;

public class NivelDAO extends DAO<Identificavel> { 
	
	public NivelDAO() {
		super(Identificavel.class);
	}

	public List<Nivel> findBy(Nivel filtro) {
		return null;
	}

}
