package gestorAplicacion.productos;

public class Lacteos extends Producto implements Refrigerador{
	private static double iva=0.0;
	double valorAgregado;
	public Lacteos(String id_producto, int precio, String nom_producto, int stock, String tipo_producto) {
		super(id_producto,precio,nom_producto,stock,tipo_producto);

	}
	public String Descripcion() {
		return "De las mejores selecciones de Lacteos un paquete de  "+this.nom_producto;
	}
	public double valorAgregado() {
		valorAgregado=this.precio*iva;
		return valorAgregado;
	}
	public boolean esPerecedero() {
		return true;
	}
	public int temperaturaPreferida() {
		return -10;
	}




}
