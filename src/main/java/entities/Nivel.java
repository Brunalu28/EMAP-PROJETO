package entities;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Nivel extends DAO {
	
	@Id
	private Long id;
	private Date dataDeRegistro;
	private Integer cota;
	private Integer area;
	private Integer volume;
	
	public Set<Reservatorio>possui;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDataDeRegistro() {
		return dataDeRegistro;
	}
	public void setDataDeRegistro(Date dataDeRegistro) {
		this.dataDeRegistro = dataDeRegistro;
	}
	public Integer getCota() {
		return cota;
	}
	public void setCota(Integer cota) {
		this.cota = cota;
	}
	public Integer getArea() {
		return area;
	}
	public void setArea(Integer area) {
		this.area = area;
	}
	public Integer getVolume() {
		return volume;
	}
	public void setVolume(Integer volume) {
		this.volume = volume;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((area == null) ? 0 : area.hashCode());
		result = prime * result + ((cota == null) ? 0 : cota.hashCode());
		result = prime * result + ((dataDeRegistro == null) ? 0 : dataDeRegistro.hashCode());
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
		Nivel other = (Nivel) obj;
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
		if (dataDeRegistro == null) {
			if (other.dataDeRegistro != null)
				return false;
		} else if (!dataDeRegistro.equals(other.dataDeRegistro))
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
	public Nivel(Class classe) {
		super(classe);
		
	}
	
	//possui erro aq 
//	@ManyToOne
//	@JoinColumn
//	public ArrayList<Reservatorio>possui;

	
}