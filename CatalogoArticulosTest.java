import junit.framework.TestCase;
public class CatalogoArticulosTest extends TestCase{
	public CatalogoArticulosTest(String nombre){
		super(nombre);
	}
	public static void main( String args[] ) {
		junit.textui.TestRunner.run( CatalogoArticulosTest.class );
	}
	private EspecificacionArticulo testArticulo;
	private int codigo;
	private int precio;
	private String descripcion;
	private int existencias;
	public void setUp(){
		codigo = 1;
		precio = 1;
		descripcion = "Test";
		existencias = 1;
		new EspecificacionArticulo(codigo, precio,descripcion,existencias);
	}
	/*public testObtenerArticulo(){
		new EspecificacionArticulo(codigo, precio,descripcion,existencias);
		assertEquals();
	}*/
	public testNumArticulos(){
		assertEquals(1);
	}
	/*public void testSimple() {
		String s1 = "DySs";
		String s2 = "DySs";
		assertEquals( s1, s2 );
	}*/
}