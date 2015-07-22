import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class PruebasCatalogo extends TestCase{
	
	private ControlSesionVenta control;
	private CatalogoArticulos catArt;
	private EspecificacionArticulo art1;
	private Venta unaVenta;

	
	protected void setUp(){
		// setUp inicializa valores ANTES DE CADA TEST 
		
		catArt = new CatalogoArticulos(); 
		//carga catálogo
		catArt.nuevoArticulo("C13", 2.0 , "Pipas", 400);
		catArt.nuevoArticulo("C15", 2.5 , "Caramelos", 1000);
		catArt.nuevoArticulo("C21", 1.5 , "Chicles", 5000);
		catArt.nuevoArticulo("C33", 3.0 , "Palomitas", 200);
		
	}

	
	public void testCatalogoVacio(){
		catArt = new CatalogoArticulos(); 
		assertEquals(0, catArt.numArticulos());
	}
	
	public void testCatalogoCargado(){
		//carga en método setUp
		assertEquals(4, catArt.numArticulos());	
	}
	
	public void testGettersCatalogo(){
		assertEquals("C13", catArt.obtenerArticulo("C13").getCodigo());
		assertEquals(2.0, catArt.obtenerArticulo("C13").getPrecio(), 0);
		assertEquals("Pipas", catArt.obtenerArticulo("C13").getDescripcion());
		assertEquals(400, catArt.obtenerArticulo("C13").getExistencias());
		
	}
}
