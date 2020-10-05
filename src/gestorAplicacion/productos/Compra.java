package gestorAplicacion.productos;
import gestorAplicacion.personas.*;
import java.util.ArrayList;

public class Compra {
	public static ArrayList <Producto> Carrito = new ArrayList<Producto>();
	public Usuario user;
	public Factura fact;
	public static int totalCompra=0;
	Compra(Usuario user,Factura fac){
		this.user=user;
		this.fact=fac;
	}
	

}
