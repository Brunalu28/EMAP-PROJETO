package entitiesextendsDAO;

import java.util.List;

import entities.Reservatorio;

public class ReservatorioDAO extends DAO <Identificavel> {
	
	public ReservatorioDAO() {
		super(Identificavel.class);
	}

	public List<Reservatorio> findBy(Reservatorio filtro) {
		return null;
	}
	
	

}
