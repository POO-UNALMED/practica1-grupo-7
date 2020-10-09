package gestorAplicacion.productos;
import gestorAplicacion.personas.*;
import java.util.ArrayList;

public class Compra {
	public static ArrayList <Producto> Carrito = new ArrayList<Producto>();
	public Usuario user;
	public Factura fact;
	public static int contadoridf=0;
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
	public void agregarCarrito(Producto pro,int cant) {
		if (Producto.comprobarStock(pro,cant)==true) {
			Carrito.add(pro);
			fact.subTotal_detallefac+=pro.precio*cant;
			pro.contador-=cant;	
		}
		else {
			System.out.println("El producto se encuentra agotado");
		}
	}
	public void retirarCarrito(Producto pro,int cant) {
		Carrito.remove(pro);
		fact.subTotal_detallefac-=pro.precio*cant;
		pro.contador+=cant;
		
	}
	public Factura efectuarCompra(Mensajero idM,String banco,Compra compra) {
		contadoridf++;
		double ivac=fact.subTotal_detallefac*0.19;
		double total=ivac+fact.subTotal_detallefac;
		return new Factura(idM,contadoridf,user,total,ivac,fact.subTotal_detallefac,banco,this);
	}
	
	
	

}
