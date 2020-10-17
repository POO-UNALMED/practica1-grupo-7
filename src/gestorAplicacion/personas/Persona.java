package gestorAplicacion.personas;

public class Persona {
	protected String nombre;
	protected String id;
	protected String genero;
	protected String direccion;
	protected int telFijo;
	protected int numCelular;
	private static int totalPersonas;	
		
	public Persona(String nombre, String id, String genero, String direccion, int telFijo, int numCelular) {
		this.nombre = nombre;
		this.id = id;
		this.genero = genero;
		this.direccion = direccion;
		this.telFijo = telFijo;
		this.numCelular = numCelular;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getTelFijo() {
		return telFijo;
	}
	public void setTelFijo(int telFijo) {
		this.telFijo = telFijo;
	}
	public int getNumCalcular() {
		return numCelular;
	}
	public void setNumCalcular(int numCalcular) {
		this.numCelular = numCalcular;
	}
	public static int getTotalPersonas() {
		return totalPersonas;
	}
	public static void setTotalPersonas(int totalPersonas) {
		Persona.totalPersonas = totalPersonas;
	}
	

}
