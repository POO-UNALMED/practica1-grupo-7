package gestorAplicacion.productos;
import gestorAplicacion.personas.*;
import java.util.ArrayList;

public class Compra {
	public static ArrayList <Producto> Carrito = new ArrayList<Producto>();
	public Usuario user;
	public Factura fact;
	public Mensajero menID;
	public Supermercado superm;
	public static int contadoridf=0;
	public static int totalCompra=0;
	public boolean propinabool=false;
	Compra(Usuario user,Factura fac,Mensajero menID,Supermercado superm){
		this.user=user;
		this.fact=fac;
		this.menID=menID;
		this.superm=Factura.superm;
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
		if (pro.comprobarStock(pro,cant)==true) {
			Carrito.add(pro);
			fact.subTotal_detallefac+=pro.precio*cant;
			pro.stock-=cant;
			
		}
		else {
			System.out.println("El producto se encuentra agotado");
		}
	}
	public void retirarCarrito(Producto pro,int cant) {
		Carrito.remove(pro);
		fact.subTotal_detallefac-=pro.precio*cant;
		pro.stock+=cant;
		
	}
	public Factura efectuarCompra(String banco,Compra compra,Producto pro) {
		contadoridf++;
		//1ERA FUNCIONALIDAD
		if (fact.subTotal_detallefac<20000) {
			menID.propina+=10000;
			propinabool=true;
		}
		double ivacomp=fact.subTotal_detallefac*pro.iva;
		double total=ivacomp+fact.subTotal_detallefac;
		if (propinabool=true) {
			total+=10000;
			propinabool=false;
		}
		//3ERA FUNCIONALIDAD
		user.Compras.add(this);
		if (user.Compras.size()%3==0) {
			total=total*0.85;
			System.out.println("Se ha efectuado un descuento a su compra");
			return new Factura(menID,contadoridf,user,total,ivacomp,fact.subTotal_detallefac,banco,this);
		}
		superm.Estadisticas.add(pro.nom_producto);
		return new Factura(menID,contadoridf,user,total,ivacomp,fact.subTotal_detallefac,banco,this);
	
	}
	
	
	

}
