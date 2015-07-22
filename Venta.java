
import java.util.*;

public class Venta {

	private double total;
	private boolean pagada = false;
	private ArrayList lineas;


	public Venta(){
		lineas = new ArrayList(); 	
	}

	public double getTotal() {
		return total;
	}

	public boolean isPagada() {
		return pagada;
	}

	public void nuevaLinea(EspecificacionArticulo ea, int cantidad){
		LineaVenta lv = new LineaVenta(ea, cantidad);
		lineas.add(lv);
	}

	public void finalVenta(boolean pagada){
		this.calculaTotalVenta();
		this.pagada = pagada;
		this.decrementaExistencias();
	}
	private void calculaTotalVenta(){
		double total = 0;
		Iterator i = lineas.iterator();
		while (i.hasNext()){
			LineaVenta lv = (LineaVenta)i.next();
			total += lv.getEspArt().getPrecio() * lv.getCantidad();
		}
		this.total = total;

	}
	
	private void decrementaExistencias() {// probar este método!!!
		Iterator i = lineas.iterator();
		while (i.hasNext()){
			LineaVenta lv = (LineaVenta)i.next();
			lv.getEspArt().restaExistencias(lv.getCantidad());
			
		}
	}
	public void pagar(){
		this.pagada = true;
	}

}
