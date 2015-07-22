import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class PruebaVentas extends TestCase {
	private ControlSesionVenta control;
	private CatalogoArticulos catArt;

	protected void setUp(){
		// setUp inicializa valores ANTES DE CADA TEST 
		
		catArt = new CatalogoArticulos(); 
		//carga catálogo
		catArt.nuevoArticulo("C13", 2.0 , "Pipas", 400);
		catArt.nuevoArticulo("C15", 2.5 , "Caramelos", 1000);
		catArt.nuevoArticulo("C21", 1.5 , "Chicles", 5000);
		catArt.nuevoArticulo("C33", 3.0 , "Palomitas", 200);
		
		control = new ControlSesionVenta(catArt);
	
	}

	protected void tearDown(){

		catArt = null;

	}
	
	

	
	public void testNuevaVenta(){
//		testea eventos del controlador de sesión 
		
		control.nuevaVenta();
		
		control.nuevaLinea("C13", 1);
		control.nuevaLinea("C15", 2);
		control.nuevaLinea("C21", 1);
		
		control.finalVenta(true);
		
		assertEquals(8.5 , control.getNuevaVenta().getTotal(), 0.0);
		assertEquals(true, control.getNuevaVenta().isPagada());
		
		
	}

	

public static Test suite(){
		// crea la suit de tests de todos los métodos de prueba de la clase
		TestSuite suit = new TestSuite(PruebaVentas.class);
		return suit;
	}

	public static void main(String args[]){

		junit.textui.TestRunner.run(suite());

	}
}


