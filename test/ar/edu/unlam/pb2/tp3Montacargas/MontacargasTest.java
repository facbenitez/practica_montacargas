package ar.edu.unlam.pb2.tp3Montacargas;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.MontaCargas.Cargas;
import ar.edu.unlam.pb2.MontaCargas.Montacargas;

public class MontacargasTest {

	@Test
	public void TestQuePermitaCrearAUnMontacargas() {
		Double pesoMaximo=100.0;	
		Montacargas CAT =new Montacargas(pesoMaximo);
		
		assertNotNull(CAT);
		
		
	}
	
	@Test
	public void TestQuePermitaAgregarCargasAUnMontacargas() {
		Double pesoMaximo=100.0;	
		Montacargas CAT =new Montacargas(pesoMaximo);
		
		Integer id=1;
		Double peso=10.0;
		String propietario="facundo";
		Cargas carga1=new Cargas(id,peso,propietario);
	
		assertTrue(CAT.agregarCarga(carga1));
		
		
	}
	
	@Test
	public void TestQuePermitaObtenerLaCantidadDeCargas() {
		Double pesoMaximo=100.0;	
		Montacargas CAT =new Montacargas(pesoMaximo);
		
		Integer id=1;
		Double peso=10.0;
		String propietario="facundo";
		Cargas carga1=new Cargas(id,peso,propietario);
		
		CAT.agregarCarga(carga1);
		
		Integer cantidadDeCargas=1;
		assertEquals(cantidadDeCargas,CAT.cantidadDeCargas());
			
	}
		
	@Test
	public void TestQueNoSePermitaAgregarCargasSiSuperaElPesoMaximo() {
		Double pesoMaximo=100.0;	
		Montacargas CAT =new Montacargas(pesoMaximo);
		
		Integer id=1;
		Double peso=10.0;
		String propietario="facundo";
		Cargas carga1=new Cargas(id,peso,propietario);
		Cargas carga2=new Cargas(2,91.0,"ezequiel");
		
		CAT.agregarCarga(carga1);
		assertFalse(CAT.agregarCarga(carga2));
		
	}


}
