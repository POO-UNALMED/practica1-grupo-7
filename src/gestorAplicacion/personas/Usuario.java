package gestorAplicacion.personas;
import java.util.ArrayList;
import gestorAplicacion.productos.*;

public class Usuario extends Persona{
	private String nomUsuario;
	private String contrasena;
	public  ArrayList <Compra> Compras = new ArrayList<Compra>();
	private static int totalUsuarios=0;
	Usuario(String nom,String id,String gen,String dir,int tel,int num,String nomU,String con){
		super(nom,id,gen,dir,tel,num);
		this.nomUsuario=nomU;
		this.contrasena=con;
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
	
		
	
}
