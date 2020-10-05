package gestorAplicacion.productos;

public class DetalleFactura {
	private Factura id_factura;
	private Producto id_producto;
	private int cantidad;
	private double subtotal;
	public DetalleFactura(Factura id_factura, Producto id_producto, int cantidad, double subtotal) {
		super();
		this.id_factura = id_factura;
		this.id_producto = id_producto;
		this.cantidad = cantidad;
		this.subtotal = subtotal;
	}
	
}
