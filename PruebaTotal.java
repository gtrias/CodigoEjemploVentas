
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class PruebaTotal extends TestCase{

	public static Test suite(){
		// crea la suit de tests de todos los métodos de prueba de la clase
		
		TestSuite suiteTotal = new TestSuite(PruebaVentas.class);
		suiteTotal.addTestSuite(PruebaEspecificacionArticulos.class);
		suiteTotal.addTestSuite(PruebasCatalogo.class);
		
		return suiteTotal;
	}
	
	
	public static void main(String[] args) {
		junit.textui.TestRunner.run(suite());

	}

}
