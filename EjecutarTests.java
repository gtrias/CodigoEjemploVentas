public class EjecutarTests {
	public static void main( String args[] ) {
	// Modo texto
		junit.textui.TestRunner.run( SimpleTest2.class );
	// Modo grafico con AWT
		junit.awtui.TestRunner.run( SimpleTest2.class );
	// Modo grafico con Swing
		junit.swingui.TestRunner.run( SimpleTest2.class );
	}
}