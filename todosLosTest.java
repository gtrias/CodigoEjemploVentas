import junit.framework.TestSuite;
import junit.framework.Test;
import junit.framework.TestCase;
public class todosLosTest extends TestCase{
	public todosLosTest( String nombre ) {
		super( nombre );
	}
	public static Test suite(){
		TestSuite suite = new TestSuite();
	// Solo un método test
	//	suite.addTest( new SimpleTest2( "testConcatenaString" );
	// Todos los métodos test de un TestCase
		suite.addTestSuite( CatalogoArticulosTest.class );
	// Otro TestSuite
	//	suite.addTest( MiTestSuite.suite() );
		return suite;
	}
}