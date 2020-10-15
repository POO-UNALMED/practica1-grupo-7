package gestorAplicacion.productos;

public class Lacteos extends Producto {
	public Lacteos(String id_producto, int precio, String nom_producto, int stock, String tipo_producto) {
		super(id_producto,precio,nom_producto,stock,tipo_producto,0.0);
	}
	public String Descripcion() {
		return "De las mejores selecciones de Lacteos un paquete de  "+this.nom_producto;
	}
	



}
