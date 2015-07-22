
public class ControlSesionVenta {
	// Implementar Singleton??
	private Venta nuevaVenta;
	private CatalogoArticulos catArt;
	
	public ControlSesionVenta(CatalogoArticulos ca){
		catArt = ca;	
	}
	public void nuevaVenta(){
		nuevaVenta = new Venta();
	}
	
	public void nuevaLinea( String codigo, int cantidad){
			EspecificacionArticulo ea = catArt.obtenerArticulo(codigo);
			nuevaVenta.nuevaLinea(ea, cantidad);
	}
	
	public void finalVenta (boolean pagada){
		nuevaVenta.finalVenta(pagada);
	}
	public Venta getNuevaVenta() {
		return nuevaVenta;
	}
	
}
