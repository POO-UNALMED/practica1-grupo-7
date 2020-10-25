package gestorAplicacion.personas;
import java.util.ArrayList;
import gestorAplicacion.productos.*;

public class Usuario extends Persona implements Empleado{

	public int caja;
	public static final int salario_cajero=75000;
	public  ArrayList <Compra> Compras = new ArrayList<Compra>();
	private static int totalUsuarios=0;
	public Usuario(String nombre,String id,String genero,String direccion,String telFijo,String numCelular,int Caja){
		super(nombre,id,genero,direccion,telFijo,numCelular);
		this.caja=Caja;
		setTotalUsuarios(getTotalUsuarios()+1);
	}
	public static int getTotalUsuarios() {
		return totalUsuarios;
	}
	public static void setTotalUsuarios(int totalUsuarios) {
		Usuario.totalUsuarios = totalUsuarios;
	}
	public ArrayList<Compra> getCompras() {
		return Compras;
	}
	public void setCompras(ArrayList<Compra> compras) {
		Compras = compras;
	}
	@Override
	public String datosEmpleado() {
		return this.nombre+" es un cajero, identificado con "+this.id+
				   ", su direccion es "+this.direccion+", tiene telefono fijo "+
				   this.telFijo+", y numero adicional "+this.numCelular+"atiende en la caja"+
				   this.caja+" y tiene con un sueldo de "+this.salario_cajero;
	}
	public void Quejarse() {
		
	}
		
}
