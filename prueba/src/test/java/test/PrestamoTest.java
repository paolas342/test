package test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import clases.Persona;
import clases.Prestamo;

public class PrestamoTest {
	private Persona pValida;
	private Persona pInvalida;
	private Prestamo prestamo;
	
	@Before //// Indicamos que el siguiente metodo se debe ejecutar antes de cada test
	public void setUp() throws Exception {
		prestamo= new Prestamo();
		pValida= mock(Persona.class);
		pInvalida=mock (Persona.class);
		
		when(pInvalida.Mayor()).thenReturn(false);
		when(pInvalida.SueldoMayorA()).thenReturn(false);
		when(pValida.Mayor()).thenReturn(true);
		when(pValida.SueldoMayorA()).thenReturn(true);
		
		prestamo.setCantCuotas(30);
		prestamo.setCapital(10000);
		prestamo.setInteres(15);

	}

		//Pruebo que nos tire la excepcion
		@Test(expected= IllegalArgumentException.class)
		public void testSetpInvalida() {
			prestamo.setPersona(pValida);
		}
		
		//verificamos que todos los get se estan ejecutando
		@Test
		public void testSetpValida() {
			prestamo.setPersona(pValida);
			verify(pValida).Mayor();
			verify(pValida).SueldoMayorA();
		}

}
