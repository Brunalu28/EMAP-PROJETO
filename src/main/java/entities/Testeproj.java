package entities;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.Test;

public class Testeproj {
	
	@Test
	void CotaAreaVolume() {
		
		ArrayList<Reservatorio> reservatorio = new ArrayList<Reservatorio>();
		InterfaceProjetoEmap pe = null;
		Reservatorio r = pe.cotaareavolume("Calculo CotaAreaVolume/ testesdaw2", reservatorio);
		
		assertNotNull (r);
		
		assertEquals("Teste Daw",r.getNome());
		
	}

}

