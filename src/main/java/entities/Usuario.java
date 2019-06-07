package entities;


import javax.persistence.Entity;
import javax.persistence.Id;

import entitiesextendsDAO.DAO;

@Entity
public class Usuario extends DAO {
	
	@Id
	private Long idN;
	private String nome;
	private Integer cadastro;
	public Long getIdN() {
		return idN;
	}
	public void setIdN(Long idN) {
		this.idN = idN;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getCadastro() {
		return cadastro;
	}
	public void setCadastro(Integer cadastro) {
		this.cadastro = cadastro;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cadastro == null) ? 0 : cadastro.hashCode());
		result = prime * result + ((idN == null) ? 0 : idN.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Usuario other = (Usuario) obj;
		if (cadastro == null) {
			if (other.cadastro != null)
				return false;
		} else if (!cadastro.equals(other.cadastro))
			return false;
		if (idN == null) {
			if (other.idN != null)
				return false;
		} else if (!idN.equals(other.idN))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	public Usuario(Class classe) {
		super(classe);
		
	}

}