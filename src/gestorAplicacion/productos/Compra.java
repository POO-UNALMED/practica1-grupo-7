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
	public Usuario getUser() {
		return user;
	}
	public void setUser(Usuario user) {
		this.user = user;
	}
	public Factura getFact() {
		return fact;
	}
	public void setFact(Factura fact) {
		this.fact = fact;
	}
	public static int getTotalCompra() {
		return totalCompra;
	}
	public static void setTotalCompra(int totalCompra) {
		Compra.totalCompra = totalCompra;
	}
	
	
	

}
