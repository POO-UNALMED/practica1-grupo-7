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
		Lector.getListaObjetos().add(this);
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
	public void AgregarProdLacteo(String id_producto, int precio, String nom_producto, int stock) {
	   Lacteos w=new Lacteos(id_producto,precio,nom_producto,stock,"Lacteo");
	   Products.add(w);
	}
	public void AgregarProdCarnes(String id_producto, int precio, String nom_producto, int stock,int peso) {
		   Carnes w=new Carnes(id_producto,precio,nom_producto,stock,"Carnico",peso);
		   Products.add(w);
	}
	public void AgregarProdVegetales(String id_producto, int precio, String nom_producto, int stock) {
		   Vegetales w=new Vegetales(id_producto,precio,nom_producto,stock,"Vegetal");
		   Products.add(w);
	}
	public void AgregarProdTecnologia(String id_producto, int precio, String nom_producto, int stock) {
		   Tecnologia w=new Tecnologia(id_producto,precio,nom_producto,stock,"Tecnologia");
		   Products.add(w);
	}
	//FUNCIONALIDAD 2 (IMPLEMENTADA)
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
	//5TA FUNCIONALIDAD (IMPLIMENTADA)
	public Mensajero MejorMensajero() {
		Mensajero mejorEmpleado=null;
		int mayor=0;
		boolean empate=false;
		for (Mensajero m:Empleados) {
			int cantidadFact=m.facturas.size();
			if (cantidadFact>mayor) {
				empate=false;
				mayor=cantidadFact;
				mejorEmpleado=m;
			}
			if(cantidadFact==mayor){
			    empate=true;
			}
		}
		if (empate==true) {
			return null;
		}
		else{
			return mejorEmpleado;
		}

	}
	//3ERA FUNCIONALIDAD(IMPLEMENTADA)
	public Mensajero MensajeroConMasQuejas() {
		Mensajero PeorEmpleado=null;
		int mayorquejas=0;
		boolean empateQuejas=false;
		for (Mensajero m:Empleados) {
			int tama�oquejas=m.Quejas.size();
			if (tama�oquejas>mayorquejas) {
				empateQuejas=false;
				mayorquejas=tama�oquejas;
				PeorEmpleado=m;
			}
			if(tama�oquejas==mayorquejas){
			    empateQuejas=true;
			}
		}
		if (empateQuejas==true) {
			return null;
		}
		else{
			return PeorEmpleado;
		}
		
	}
}

