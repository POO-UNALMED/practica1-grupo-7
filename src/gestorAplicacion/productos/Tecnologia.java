package gestorAplicacion.productos;

public class Tecnologia extends Producto {

	public Tecnologia(String id_producto, int precio, String nom_producto, int stock, String tipo_producto) {
		super(id_producto,precio,nom_producto,stock,tipo_producto,0.19);
	}
	public String Descripcion() {
		return "Lo Ultimo en tecnologia al alcanze,un paquete de   "+this.nom_producto;
	}


}
