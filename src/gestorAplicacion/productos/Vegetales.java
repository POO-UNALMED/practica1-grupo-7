package gestorAplicacion.productos;

public class Vegetales extends Producto {

	public Vegetales(String id_producto, int precio, String nom_producto, int stock, String tipo_producto) {
		super(id_producto,precio,nom_producto,stock,tipo_producto,0.19);
	}
	public String Descripcion() {
		return "Los vegetales mas frescos que puedas encontrar,un paquete de  "+this.nom_producto;
	}

}
