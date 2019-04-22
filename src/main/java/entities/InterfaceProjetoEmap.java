package entities;

import java.util.List;

public interface InterfaceProjetoEmap {
	
	public CotaAreaVolume cotaareaVolume (
			Reservatorio reservatorio, List<Usuario> usuarios)
					throws ReservatorioExistenteException, UruarioException;
	
	public void calculoAreaVolume (Usuario usuario, Reservatorio reservatorio);

	
}
	
	
					
			
			
			
			
			
	

}
