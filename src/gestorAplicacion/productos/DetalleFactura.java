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
		this.id_factura.productList.add(this);
		
	}
	public Factura getId_factura() {
		return id_factura;
	}
	public void setId_factura(Factura id_factura) {
		this.id_factura = id_factura;
	}
	public Producto getId_producto() {
		return id_producto;
	}
	public void setId_producto(Producto id_producto) {
		this.id_producto = id_producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	
	
}
