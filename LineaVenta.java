
public class LineaVenta {
	private int cantidad;
	private EspecificacionArticulo espArt;

	public LineaVenta(EspecificacionArticulo ea, int cantidad){
		espArt = ea;
		this.cantidad = cantidad;	
	}

	public int getCantidad() {
		return cantidad;
	}

	public EspecificacionArticulo getEspArt() {
		return espArt;
	}


}
