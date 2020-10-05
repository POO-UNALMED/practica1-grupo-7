package gestorAplicacion.personas;
import gestorAplicacion.productos.*;
import java.util.*;
public class Mensajero extends Persona {
	public String transporte;
	public int contador;
	public int gan_adicional;
	public ArrayList <Factura> facturas=new ArrayList <Factura>();
	public Mensajero(String nombre, String id,String genero,String direccion,int tel_fijo,int celular,String transporte, int contador, int gan_adicional, ArrayList<Factura> facturas) {
		super(nombre,id,genero,direccion,tel_fijo,celular);
		this.transporte = transporte;
		this.contador = contador;
		this.gan_adicional = gan_adicional;
		this.facturas = facturas;
	}
	
	

}
