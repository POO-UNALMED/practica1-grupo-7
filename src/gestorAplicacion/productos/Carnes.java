package gestorAplicacion.productos;

public class Carnes extends Producto{

	public Carnes(String id_producto, int precio, String nom_producto, int stock, String tipo_producto) {
		super(id_producto,precio,nom_producto,stock,tipo_producto,0.05);
	}
	public String Descripcion() {
		return "Las carnes mas jugosas de la zona,un paquete de  "+this.nom_producto;
	}

	}

