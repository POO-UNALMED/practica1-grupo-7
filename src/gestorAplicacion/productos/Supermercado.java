package gestorAplicacion.productos;
import gestorAplicacion.personas.*;
import java.util.ArrayList;
import java.util.Collections;
import BaseDatos.*;

public class Supermercado {
	private String nombre;
	private String direccion;
	private String tel;
	private ArrayList<Producto> Products = new ArrayList<>();
	public  ArrayList<String> Estadisticas= new ArrayList<>();
	public ArrayList<Mensajero> Empleados;
	public ArrayList<Usuario> Cajero;
	public Supermercado(String nombre, String direccion, String tel,ArrayList<Usuario> Cajeros,ArrayList<Mensajero> Mensajero) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.tel = tel;
		this.Empleados=Mensajero;
		this.Cajero=Cajeros;
		Lector.listaObjetos.add(this);
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
	public String prodMasPopular(){
		String prodPop="";
		int mayorveces = 0;
		for(int i = 0; i < Estadisticas.size(); i++) {
			int veces=Collections.frequency(Estadisticas, Estadisticas.get(i));
			if(veces > mayorveces) {
				mayorveces = veces;
				prodPop=Estadisticas.get(i);
			}
		}
		return prodPop;
	}
	public String prodMenosPopular() {
		String prodNoPop="";
		int menorveces=0;
		for(int i = 0; i < Estadisticas.size(); i++) {
			int veces=Collections.frequency(Estadisticas, Estadisticas.get(i));
			if(veces<menorveces) {
				menorveces=veces;
				prodNoPop=Estadisticas.get(i);
		}
		}
		return prodNoPop;
	}
	//5TA FUNCIONALIDAD
	public Mensajero MejorMensajero() {
		Mensajero mejorEmpleado=null;
		int mayor=0;
		for (Mensajero m:Empleados) {
			int cantidadFact=m.facturas.size();
			if (cantidadFact>mayor) {
				mayor=cantidadFact;
				mejorEmpleado=m;
			}
		}
		return mejorEmpleado;
	}
}

