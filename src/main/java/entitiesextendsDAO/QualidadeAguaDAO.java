package entitiesextendsDAO;

import java.util.List;

import entities.QualidadeAgua;

public class QualidadeAguaDAO extends DAO<Identificavel> {
	
	public QualidadeAguaDAO() {
		super(Identificavel.class);
	}

	public List<QualidadeAguaDAO> findBy(QualidadeAguaDAO filtro) {
		return null;
	}

}
