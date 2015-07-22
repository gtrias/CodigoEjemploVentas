import java.util.*;

public class CatalogoArticulos {
	private static HashMap articulos;

	public CatalogoArticulos(){
		articulos = new HashMap();
	}

	public EspecificacionArticulo obtenerArticulo(String codArt){
		return (EspecificacionArticulo)articulos.get(codArt);
	}

	public void nuevoArticulo	(String codigo, 
			double precio, 
			String descripcion, 
			int existencias){
		EspecificacionArticulo nuevoArticulo = new EspecificacionArticulo(codigo, precio,descripcion,existencias);

		// a�ade nuevo articulo al cat�logo,
		//referenciado por su c�digo (clave:CodigoArticulo, valor:EspecificacionArticulo)
		articulos.put(nuevoArticulo.getCodigo(), nuevoArticulo); 
	}

	public int numArticulos(){
		return articulos.size();
	}
}
