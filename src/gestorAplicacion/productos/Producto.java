package gestorAplicacion.productos;

public class Producto {
	public String id_producto;
	public int precio;
	public String nom_producto;
	public int contador;
	public String tipo_producto;
	public Producto(String id_producto, int precio, String nom_producto, int contador, String tipo_producto) {
		this.id_producto = id_producto;
		this.precio = precio;
		this.nom_producto = nom_producto;
		this.contador = contador;
		this.tipo_producto = tipo_producto;
	}
	

}
