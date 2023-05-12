package ar.edu.unlam.pb2.tp3Montacargas;

import static org.junit.Assert.*;

import org.junit.Test;

public class MontacargasTest {

	@Test
	public void QuePermitaCrearAUnMontacargasYLuegoVerificoSuPesoMaximo() {
		
		Montacargas CAT =new Montacargas(100.0);
		
		assertNotNull(CAT);
		assertEquals((Double)100.0,CAT.getPesoMaximo());
		
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
	public void TestQuePermitaObtenerElPesoCargado() {
		Double pesoMaximo=100.0;	
		Montacargas CAT =new Montacargas(pesoMaximo);
		
		Integer id=1;
		Double peso=10.0;
		String propietario="facundo";
		Cargas carga1=new Cargas(id,peso,propietario);
		
		CAT.agregarCarga(carga1);
		Double pesoObtenido=CAT.obtenerPesoCargado();
		
		Integer cantidadDeCargas=1;
		assertEquals(cantidadDeCargas,CAT.cantidadDeCargas());
		assertEquals(peso,pesoObtenido);
			
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
	
	@Test
	public void TestQuePermitaCrearUnaCargaPasandoValoresConGetterySetter() {	
		Cargas carga1=new Cargas();
		carga1.setId(1);
		carga1.setPeso(10.0);
		carga1.setPropietario("facundo");
		carga1.setDescripcion("10kg de yeso");
		
		assertNotNull(carga1);
		assertEquals((Integer)1,carga1.getId());
		assertEquals("facundo",carga1.getPropietario());
			
	}


}
