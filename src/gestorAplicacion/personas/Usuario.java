package gestorAplicacion.personas;
import java.util.ArrayList;
import gestorAplicacion.productos.*;

public class Usuario extends Persona{
	private String nomUsuario;
	private String contrasena;
	public static ArrayList <Compra> Compras = new ArrayList<Compra>();
	private static int totalUsuarios=0;
	Usuario(String nom,String id,String gen,String dir,int tel,int num,String nomU,String con){
		super(nom,id,gen,dir,tel,num);
		this.nomUsuario=nomU;
		this.contrasena=con;
		totalUsuarios++;
		
	}

}
