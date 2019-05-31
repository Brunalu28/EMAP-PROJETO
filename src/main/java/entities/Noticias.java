package entities;

import java.util.Set;

public class Noticias extends DAO{
	
	private long idN;
	private String noticias;
	private String categoria;
	
	public Set<Reservatorio>pertence;

	public long getIdN() {
		return idN;
	}

	public void setIdN(long idN) {
		this.idN = idN;
	}

	public String getNoticias() {
		return noticias;
	}

	public void setNoticias(String noticias) {
		this.noticias = noticias;

	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Set<Reservatorio> getPertence() {
		return pertence;
	}

	public void setPertence(Set<Reservatorio> pertence) {
		this.pertence = pertence;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
		result = prime * result + (int) (idN ^ (idN >>> 32));
		result = prime * result + ((noticias == null) ? 0 : noticias.hashCode());
		result = prime * result + ((pertence == null) ? 0 : pertence.hashCode());
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
		Noticias other = (Noticias) obj;
		if (categoria == null) {
			if (other.categoria != null)
				return false;
		} else if (!categoria.equals(other.categoria))
			return false;
		
		if (idN != other.idN)
			return false;
		if (noticias == null) {
			if (other.noticias != null)
				return false;
		} else if (!noticias.equals(other.noticias))
			return false;
		if (pertence == null) {
			if (other.pertence != null)
				return false;
		} else if (!pertence.equals(other.pertence))
			return false;
		return true;
	}
	
	public Noticias(Class classe) {
		super(classe);
		
	}



	
}
