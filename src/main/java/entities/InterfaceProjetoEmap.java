package entities;

import java.util.List;

public interface InterfaceProjetoEmap {
	
	public CotaAreaVolume cotaareavolume ( CotaAreaVolume cotaareavolume, List<Reservatorio> reservatorios);
					
	public void calculoAreaVolume (Usuario usuario, Reservatorio reservatorio);
	
	public QualidadeAgua qualidadeagua( QualidadeAgua qualidadeagua,List<Reservatorio> reservatorios );
	
	public Pluviosidade pluviosidade(Pluviosidade calcular, Pluviosidade calcularMin, Pluviosidade calcularMax );

	public Noticias noticias(Noticias noticia, );
	
}
	
			
			
	


