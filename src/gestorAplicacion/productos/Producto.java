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
		return contador;
	}
	public void setContador(int contador) {
		this.contador = contador;
	}
	public String getTipo_producto() {
		return tipo_producto;
	}
	public void setTipo_producto(String tipo_producto) {
		this.tipo_producto = tipo_producto;
	}
	
	

}
