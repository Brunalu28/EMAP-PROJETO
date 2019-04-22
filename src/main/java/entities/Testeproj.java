package entities;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.Test;

public class Testeproj {
	@Test
	void CotaAreaVolume() {
		ArrayList<Reservatorio> reservatorio = new ArrayList <Reservatorio>
		
		Reservatorio r = c.CotaAreaVolume("Calculo CotaAreaVolume/ testesdaw2", reservatorio);
		
		assertNotNull (r);
		
		assertEquals("Teste Daw",r.getNomeReservatorio);
		
		
		
		
		
		
		
	}
	

}

