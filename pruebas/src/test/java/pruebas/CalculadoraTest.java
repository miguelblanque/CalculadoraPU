/**
 * 
 */
package pruebas;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Formacion
 *
 */
public class CalculadoraTest {

	private Calculadora fixture;
	
	@Before
	public void setup() {
		fixture=new Calculadora();
	}
	@Test
	public void testSumar() throws Exception {
		int resultado=fixture.sumar(2,2);
		assertEquals(4,resultado);
	}
	@Test
	public void testRestar() throws Exception {
		int resultado=fixture.restar(2,2);
		assertEquals(0,resultado);
	}
	@Test
	public void testMult() throws Exception {
		int resultado=fixture.mult(2,2);
		assertEquals(4,resultado);
	}
	@Test
	public void testDiv() throws Exception {
		int resultado=fixture.div(2,2);
		assertEquals(1,resultado);
	}
}
