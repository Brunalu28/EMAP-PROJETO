package entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Reservatorio {
	private String nome;
	private String bacia;
	private Integer capmaxima;
	@OneToOne
	@JoinColumn(name = "qualidade")
	private QualidadeAgua qual;
	@OneToMany
	@JoinColumn(name = "id_reservatorio")
	private Set<Nivel> niveis;
	@OneToMany
	@JoinColumn(name = "id_reservatorio")
	private Set<CotaAreaVolume> cota;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getBacia() {
		return bacia;
	}
	public void setBacia(String bacia) {
		this.bacia = bacia;
	}
	public Integer getCapmaxima() {
		return capmaxima;
	}
	public void setCapmaxima(Integer capmaxima) {
		this.capmaxima = capmaxima;
	}
	public QualidadeAgua getQual() {
		return qual;
	}
	public void setQual(QualidadeAgua qual) {
		this.qual = qual;
	}
	public Set<Nivel> getNiveis() {
		return niveis;
	}
	public void setNiveis(Set<Nivel> niveis) {
		this.niveis = niveis;
	}
	public Set<CotaAreaVolume> getCota() {
		return cota;
	}
	public void setCota(Set<CotaAreaVolume> cota) {
		this.cota = cota;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bacia == null) ? 0 : bacia.hashCode());
		result = prime * result + ((capmaxima == null) ? 0 : capmaxima.hashCode());
		result = prime * result + ((cota == null) ? 0 : cota.hashCode());
		result = prime * result + ((niveis == null) ? 0 : niveis.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((qual == null) ? 0 : qual.hashCode());
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
		Reservatorio other = (Reservatorio) obj;
		if (bacia == null) {
			if (other.bacia != null)
				return false;
		} else if (!bacia.equals(other.bacia))
			return false;
		if (capmaxima == null) {
			if (other.capmaxima != null)
				return false;
		} else if (!capmaxima.equals(other.capmaxima))
			return false;
		if (cota == null) {
			if (other.cota != null)
				return false;
		} else if (!cota.equals(other.cota))
			return false;
		if (niveis == null) {
			if (other.niveis != null)
				return false;
		} else if (!niveis.equals(other.niveis))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (qual == null) {
			if (other.qual != null)
				return false;
		} else if (!qual.equals(other.qual))
			return false;
		return true;
	}
	
	
	
	
	
	
	

}