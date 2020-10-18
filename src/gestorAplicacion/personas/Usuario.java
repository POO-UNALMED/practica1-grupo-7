package gestorAplicacion.personas;
import java.util.ArrayList;
import gestorAplicacion.productos.*;

public class Usuario extends Persona implements Empleado{
	private String nomUsuario;
	private String contrasena;
	public int caja;
	public int salario_cajero;
	public  ArrayList <Compra> Compras = new ArrayList<Compra>();
	private static int totalUsuarios=0;
	Usuario(String nombre,String id,String genero,String direccion,String telFijo,String numCelular,String nomUsuario,String contrasena,int Caja){
		super(nombre,id,genero,direccion,telFijo,numCelular);
		this.nomUsuario=nomUsuario;
		this.contrasena=contrasena;
		this.caja=Caja;
		setTotalUsuarios(getTotalUsuarios()+1);
	}
	public String getNomUsuario() {
		return nomUsuario;
	}
	public void setNomUsuario(String nomUsuario) {
		this.nomUsuario = nomUsuario;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
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
		
}
