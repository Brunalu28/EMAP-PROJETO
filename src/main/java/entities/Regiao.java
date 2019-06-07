package entities;

import java.util.ArrayList;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import entitiesextendsDAO.DAO;

@Entity
public class Regiao extends DAO {

	@Id
	private Long idR;
	private String microR;
	private String mesor;
	@OneToMany
	@JoinColumn(name = "regiao")
	public ArrayList<Reservatorio>possui;
	@OneToMany
	@JoinColumn(name = "regiao")
	public Set<Usuario> usuarios;
	
	@OneToOne
	@JoinColumn( name ="regiao")
	private Pluviosidade pluv;
	
	public String getMicroR() {
		return microR;
	}

	public void setMicroR(String microR) {
		this.microR = microR;
	}

	public String getMesor() {
		return mesor;
	}

	public void setMesor(String mesor) {
		this.mesor = mesor;
	}

	public ArrayList<Reservatorio> getPossui() {
		return possui;
	}

	public void setPossui(ArrayList<Reservatorio> possui) {
		this.possui = possui;
	}

	public Long getIdR() {
		return idR;
	}

	public void setIdR(Long idR) {
		this.idR = idR;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idR == null) ? 0 : idR.hashCode());
		result = prime * result + ((mesor == null) ? 0 : mesor.hashCode());
		result = prime * result + ((microR == null) ? 0 : microR.hashCode());
		result = prime * result + ((possui == null) ? 0 : possui.hashCode());
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
		Regiao other = (Regiao) obj;
		if (idR == null) {
			if (other.idR != null)
				return false;
		} else if (!idR.equals(other.idR))
			return false;
		if (mesor == null) {
			if (other.mesor != null)
				return false;
		} else if (!mesor.equals(other.mesor))
			return false;
		if (microR == null) {
			if (other.microR != null)
				return false;
		} else if (!microR.equals(other.microR))
			return false;
		if (possui == null) {
			if (other.possui != null)
				return false;
		} else if (!possui.equals(other.possui))
			return false;
		return true;
	}

	public Regiao(Class classe) {
		super(classe);
		
	}

	
	
	
	

}