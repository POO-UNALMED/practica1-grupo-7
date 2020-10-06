package gestorAplicacion.productos;

public class Supermercado {
	private String nombre;
	private String direccion;
	private String tel;
	public Supermercado(String nombre, String direccion, String tel) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.tel = tel;	
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTel() {
		return tel;
	}

}	
