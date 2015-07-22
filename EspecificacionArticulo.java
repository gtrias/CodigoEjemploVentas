
public class EspecificacionArticulo {
	private String  codigo;
	private double precio;
	private String descripcion;
	private int existencias;

	public EspecificacionArticulo(String codigo, double precio, String descripcion, int existencias) {
		super();

		this.codigo = codigo;
		this.precio = precio;
		this.descripcion = descripcion;
		this.existencias = existencias;
	}

	public String getCodigo() {
		return codigo;
	}
	public double getPrecio() {
		return precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getExistencias() {
		return existencias;
	}

	public void restaExistencias(int cantidad) {
		this.existencias -= cantidad;
	}


}

