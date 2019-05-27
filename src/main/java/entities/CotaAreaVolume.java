package entities;


import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class CotaAreaVolume extends DAO {
	
	@Id
	private Long id;
	private Date dataDeEstudo;
	private Integer cota;
	private Integer volume;
	private Integer area;
	
//*	errado isso aq
//	@ManyToMany
//	@JoinColumn
//	public ArrayList<Reservatorio>possui; *
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDataDeEstudo() {
		return dataDeEstudo;
	}
	public void setDataDeEstudo(Date dataDeEstudo) {
		this.dataDeEstudo = dataDeEstudo;
	}
	public Integer getCota() {
		return cota;
	}
	public void setCota(Integer cota) {
		this.cota = cota;
	}
	public Integer getVolume() {
		return volume;
	}
	public void setVolume(Integer volume) {
		this.volume = volume;
	}
	public Integer getArea() {
		return area;
	}
	public void setArea(Integer area) {
		this.area = area;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((area == null) ? 0 : area.hashCode());
		result = prime * result + ((cota == null) ? 0 : cota.hashCode());
		result = prime * result + ((dataDeEstudo == null) ? 0 : dataDeEstudo.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((volume == null) ? 0 : volume.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CotaAreaVolume other = (CotaAreaVolume) obj;
		if (area == null) {
			if (other.area != null)
				return false;
		} else if (!area.equals(other.area))
			return false;
		if (cota == null) {
			if (other.cota != null)
				return false;
		} else if (!cota.equals(other.cota))
			return false;
		if (dataDeEstudo == null) {
			if (other.dataDeEstudo != null)
				return false;
		} else if (!dataDeEstudo.equals(other.dataDeEstudo))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (volume == null) {
			if (other.volume != null)
				return false;
		} else if (!volume.equals(other.volume))
			return false;
		return true;
	}
	
	public CotaAreaVolume(Class classe) {
		super(classe);
	}
	

}
