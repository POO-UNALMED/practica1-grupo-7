package gestorAplicacion.personas;
import gestorAplicacion.productos.*;

import java.util.*;
public class Mensajero extends Persona implements Empleado{
	public String transporte;
	public int contador;
	public int gan_adicional;
	public int propina=0;
	public int salario_mensajero=0;
	public Supermercado superm;
	public ArrayList <Factura> facturas=new ArrayList <Factura>();
	public ArrayList<String> Quejas=new ArrayList<>();
	public Mensajero(String nombre, String id,String genero,String direccion,String telFijo,String numCelular,String transporte, int contador, int gan_adicional) {
		super(nombre,id,genero,direccion,telFijo,numCelular);
		this.transporte = transporte;
		this.contador = contador;
		this.gan_adicional = gan_adicional;
		superm.Empleados.add(this);
	}
	public String getTransporte() {
		return transporte;
	}
	public void setTransporte(String transporte) {
		this.transporte = transporte;
	}
	public int getContador() {
		return contador;
	}
	public void setContador(int contador) {
		this.contador = contador;
	}
	public int getGan_adicional() {
		return gan_adicional;
	}
	public void setGan_adicional(int gan_adicional) {
		this.gan_adicional = gan_adicional;
	}
	public ArrayList<Factura> getFacturas() {
		return facturas;
	}
	public void setFacturas(ArrayList<Factura> facturas) {
		this.facturas = facturas;
	}
	public int pagoTotal() {
		for (int i=0;i<facturas.size();i++) {
			salario_mensajero+=facturas.get(i).total*0.05;
		}
		return salario_mensajero+=propina+bonoFactura();
	}
	//SOBRECARGA METODO 1
	public int pagoTotal(Mensajero mensajero) {
		mensajero=this;
		for (int i=0;i<facturas.size();i++) {
			salario_mensajero+=facturas.get(i).total*0.05;
		}
		if (mensajero==superm.MejorMensajero()) {
			return salario_mensajero+=propina+bonoFactura()+100000;
		}
		else {
			return salario_mensajero+=propina+bonoFactura();
		}
	}
	public int bonoFactura() {
		int bonomult=facturas.size()/5;
		int bono=5000*bonomult;
		return bono;
	}
	@Override
	public String datosEmpleado() {
		return this.nombre+" es un mensajero, identificado con "+this.id+
			   ", su direccion es "+this.direccion+", tiene telefono fijo "+
			   this.telFijo+", y numero adicional "+this.numCelular+" utiliza "+this.transporte
			   +" y tiene con un sueldo de "+this.salario_mensajero;
	}

}
