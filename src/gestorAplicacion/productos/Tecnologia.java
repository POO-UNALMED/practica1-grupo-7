package gestorAplicacion.productos;

public class Tecnologia extends Producto {
	static final double iva=0.19;
	double valorAgregado;
	public Tecnologia(String id_producto, int precio, String nom_producto, int stock, String tipo_producto) {
		super(id_producto,precio,nom_producto,stock,tipo_producto);
	}
	public String Descripcion() {
		return "Lo Ultimo en tecnologia al alcanze,un paquete de   "+this.nom_producto;
	}
	public double valorAgregado() {
		valorAgregado=this.precio*iva;
		return valorAgregado;
	}


}
