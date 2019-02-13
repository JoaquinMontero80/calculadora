package Calcu;


import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;




public class CalcuTest {

	private Calcu Calcu;
	private int resultado;
	
	@Before
	public void createCalculadora() {
		Calcu = new Calcu(20,10);
	}
	
	@After
	public void borraCalculadora() {
		Calcu = null;
	}
	
	
	@Test
	public void testSuma() {
		resultado = Calcu.suma();
		assertEquals (30, resultado);
	}
	
	
	@Test
	public void testResta() {
		resultado = Calcu.resta();
		assertEquals (10, resultado);
	}
	
	
	@Test
	public void testMultiplicar() {
		resultado = Calcu.multiplicar();
		assertEquals (200, resultado);
	}
	
	@Test
	public void testDividir() {
		resultado = Calcu.dividir();
		assertEquals (2, resultado);
	}

}
