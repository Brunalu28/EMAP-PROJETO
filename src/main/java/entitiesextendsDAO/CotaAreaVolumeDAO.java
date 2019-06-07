package entitiesextendsDAO;

import java.util.List;

import entities.CotaAreaVolume;

public class CotaAreaVolumeDAO extends DAO<Identificavel> {
	
	public CotaAreaVolumeDAO() {
		super(Identificavel.class);
	}

	public List<CotaAreaVolume> findBy(CotaAreaVolume filtro) {
		return null;
	}

}
