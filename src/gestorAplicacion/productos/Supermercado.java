package gestorAplicacion.productos;

public class Supermercado {
	private String nombre;
	private String direccion;
	private int tel;
	public String canasta_sugerencias;
	public Supermercado(String nombre, String direccion, int tel, String canasta_sugerencias) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.tel = tel;
		this.canasta_sugerencias = canasta_sugerencias;
	}
}	
