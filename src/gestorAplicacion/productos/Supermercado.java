package gestorAplicacion.productos;
import java.util.ArrayList;
import java.util.Collections;
public class Supermercado {
	private String nombre;
	private String direccion;
	private String tel;
	private ArrayList<Producto> Products = new ArrayList<>();
	public ArrayList<String> Estadisticas= new ArrayList<>();
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
	public void Inventario(){
		for(Producto i:Products) {
			System.out.println("hay"+i.stock+"del producto"+i.nom_producto);
		}
	}
	//FUNCIONALIDAD 2
	public String modaProd(){
		String prodPop="";
		int mayorveces = 0;
		for(int i = 0; i < Estadisticas.size(); i++) {
			int veces=Collections.frequency(Estadisticas, Estadisticas.get(i);
			if(veces > mayorveces) {
				mayorveces = veces;
				prodPop=Estadisticas.get(i);
			}

		}
		return prodPop;
	}

}
}
