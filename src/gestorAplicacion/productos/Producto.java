package gestorAplicacion.productos;
import java.util.ArrayList;

abstract class Producto {
	public String id_producto;
	public int precio;
	public String nom_producto;
	public int stock;
	public String tipo_producto;
	double iva;
	public static int totalProductos=0;
	public Producto(String id_producto, int precio, String nom_producto, int stock, String tipo_producto,double iva) {
		this.id_producto = id_producto;
		this.precio = precio;
		this.nom_producto = nom_producto;
		this.stock = stock;
		this.tipo_producto = tipo_producto;
		this.iva=iva;
		totalProductos++;	
	}
	public String getId_producto() {
		return id_producto;
	}
	public void setId_producto(String id_producto) {
		this.id_producto = id_producto;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getNom_producto() {
		return nom_producto;
	}
	public void setNom_producto(String nom_producto) {
		this.nom_producto = nom_producto;
	}
	public int getContador() {
		return stock;
	}
	public void setContador(int contador) {
		this.stock = contador;
	}
	public String getTipo_producto() {
		return tipo_producto;
	}
	public void setTipo_producto(String tipo_producto) {
		this.tipo_producto = tipo_producto;
	}
	public int totalProductos(){
		return totalProductos;
	}
	public abstract void reStock(int cantidad);
	public abstract boolean comprobarStock(Producto pro,int cantidad);
}
