package test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clases.Persona;

public class PersonaTest {
	private Persona p;
	//constructor
	public PersonaTest()
	{
		
	}

	// el metodo setUp Asignamos valores a las variables antes de la ejecucion de cada test
	
	@Before//Indicamoss que el siguiente metodo se debe ejecutar antes de cada test
	public void setUp() throws Exception {
		p = new Persona();
		p.setNombre("Juan");
		p.setApellido("Perez");
		p.setDni(28320585);
		p.setEdad(34);
		p.setSueldo(5100);
	}
	@Test
	public void testGetDni() {
		int resultado= p.getDni();
		int resultadoEsp=28320585;
		assertEquals(resultadoEsp, resultado);
	}
	
	//Comprueba que el objeto no sea nulo
	@Test
	public void TestDni() {
		int nrodni=28320554;
		p.setDni(nrodni);
		assertNotNull(p.getDni());
	}
	// Comprueba si una condicion se cumple. Devuelve assertionError
	//si no se produce el resultado esperado
	@Test
	public void TestEdad() {
		assertFalse(p.Mayor());
	}

}
