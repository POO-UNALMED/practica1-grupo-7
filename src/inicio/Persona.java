package inicio;

public class Persona {
	protected String nombre;
	protected String id;
	protected String genero;
	protected String direccion;
	protected int telFijo;
	protected int numCalcular;
	private static int totalPersonas;
	public Persona(String nom,String id,String gen,String dir,int tel,int num) {
		this.nombre=nom;
		this.id=id;
		this.genero=gen;
		this.direccion=dir;
		this.telFijo=tel;
		this.numCalcular=num;
		totalPersonas++;
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
		return numCalcular;
	}
	public void setNumCalcular(int numCalcular) {
		this.numCalcular = numCalcular;
	}
	public static int getTotalPersonas() {
		return totalPersonas;
	}
	public static void setTotalPersonas(int totalPersonas) {
		Persona.totalPersonas = totalPersonas;
	}
	

}
