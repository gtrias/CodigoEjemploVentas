//import junit.framework.Assert;
//import junit.framework.Test;
//import junit.framework.TestSuite;

import junit.framework.TestCase;

public class PruebaEspecificacionArticulos extends TestCase{

	EspecificacionArticulo  art1;
	
	protected void setUp(){
		// setUp inicializa valores ANTES DE CADA TEST 
		
		art1 = new EspecificacionArticulo("C10",  2.0 , "Cacahuetes", 200);
	}
	
	public void testGettersEA(){
//		Tests de métodos getters
		assertEquals("C10", art1.getCodigo());
		assertEquals(2.0 ,art1.getPrecio(), 0.0);
		assertEquals("Cacahuetes",art1.getDescripcion());
		assertEquals(200,art1.getExistencias());
	}
	

}
