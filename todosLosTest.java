import junit.framework.TestSuite;
import junit.framework.Test;
import junit.framework.TestCase;
public class todosLosTest extends TestCase{
	public todosLosTest( String nombre ) {
		super( nombre );
	}
	public static Test suite(){
		TestSuite suite = new TestSuite();
	// Solo un m�todo test
	//	suite.addTest( new SimpleTest2( "testConcatenaString" );
	// Todos los m�todos test de un TestCase
		suite.addTestSuite( CatalogoArticulosTest.class );
	// Otro TestSuite
	//	suite.addTest( MiTestSuite.suite() );
		return suite;
	}
}