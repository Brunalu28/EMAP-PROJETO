package entities;

import java.sql.Date;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class QualidadeAgua extends DAO {
	
	@Id
	private Long IdQ;
	private Integer pH;
	private Integer Turbidez;
	private Integer CondutividadeEletrica;
	private Integer OxigenioDissolvido;
	private Integer TemperaturaDaAgua;
	private Date data;
	public Long getIdQ() {
		return IdQ;
	}
	public void setIdQ(Long idQ) {
		IdQ = idQ;
	}
	public Integer getpH() {
		return pH;
	}
	public void setpH(Integer pH) {
		this.pH = pH;
	}
	public Integer getTurbidez() {
		return Turbidez;
	}
	public void setTurbidez(Integer turbidez) {
		Turbidez = turbidez;
	}
	public Integer getCondutividadeEletrica() {
		return CondutividadeEletrica;
	}
	public void setCondutividadeEletrica(Integer condutividadeEletrica) {
		CondutividadeEletrica = condutividadeEletrica;
	}
	public Integer getOxigenioDissolvido() {
		return OxigenioDissolvido;
	}
	public void setOxigenioDissolvido(Integer oxigenioDissolvido) {
		OxigenioDissolvido = oxigenioDissolvido;
	}
	public Integer getTemperaturaDaAgua() {
		return TemperaturaDaAgua;
	}
	public void setTemperaturaDaAgua(Integer temperaturaDaAgua) {
		TemperaturaDaAgua = temperaturaDaAgua;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CondutividadeEletrica == null) ? 0 : CondutividadeEletrica.hashCode());
		result = prime * result + ((IdQ == null) ? 0 : IdQ.hashCode());
		result = prime * result + ((OxigenioDissolvido == null) ? 0 : OxigenioDissolvido.hashCode());
		result = prime * result + ((TemperaturaDaAgua == null) ? 0 : TemperaturaDaAgua.hashCode());
		result = prime * result + ((Turbidez == null) ? 0 : Turbidez.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((pH == null) ? 0 : pH.hashCode());
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
		QualidadeAgua other = (QualidadeAgua) obj;
		if (CondutividadeEletrica == null) {
			if (other.CondutividadeEletrica != null)
				return false;
		} else if (!CondutividadeEletrica.equals(other.CondutividadeEletrica))
			return false;
		if (IdQ == null) {
			if (other.IdQ != null)
				return false;
		} else if (!IdQ.equals(other.IdQ))
			return false;
		if (OxigenioDissolvido == null) {
			if (other.OxigenioDissolvido != null)
				return false;
		} else if (!OxigenioDissolvido.equals(other.OxigenioDissolvido))
			return false;
		if (TemperaturaDaAgua == null) {
			if (other.TemperaturaDaAgua != null)
				return false;
		} else if (!TemperaturaDaAgua.equals(other.TemperaturaDaAgua))
			return false;
		if (Turbidez == null) {
			if (other.Turbidez != null)
				return false;
		} else if (!Turbidez.equals(other.Turbidez))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (pH == null) {
			if (other.pH != null)
				return false;
		} else if (!pH.equals(other.pH))
			return false;
		return true;
	}
	public QualidadeAgua(Class classe) {
		super(classe);
		
	}

	
//	@ManyToOne
//	@JoinColumn
//	public ArrayList<Reservatorio>possui;
	
	


	
}
	
	