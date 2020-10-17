package gestorAplicacion.productos;
import gestorAplicacion.personas.*;
import java.util.ArrayList;

public class Compra {
	public Usuario user;
	public Factura fact;
	public Mensajero menID;
	public Supermercado superm;
	public static int contadoridf=0;
	public static int totalCompra=0;
	public boolean propinabool=false;
	public double sumValorAgregado=0;
	Compra(Usuario user,Factura fac,Mensajero menID,Supermercado superm){
		this.user=user;
		this.fact=fac;
		this.menID=menID;
		this.superm=superm;
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
	public void agregar(Producto pro,int cant,Supermercado superm) {
		if (pro.comprobarStock(pro,cant)==true) {
			superm.Estadisticas.add(pro.nom_producto);
			fact.subTotal_detallefac+=pro.precio*cant;
			sumValorAgregado+=pro.valorAgregado();
			pro.stock-=cant;		
		}
		else {
			System.out.println("El producto se encuentra agotado");
		}
	}
	public Factura efectuarCompra(String banco,Compra compra,Producto pro) {
		contadoridf++;
		//1ERA FUNCIONALIDAD
		if (fact.subTotal_detallefac<20000) {
			menID.propina+=10000;
			propinabool=true;
		}
		double total=sumValorAgregado+fact.subTotal_detallefac;
		if (propinabool=true) {
			total+=10000;
			propinabool=false;
		}
		//3ERA FUNCIONALIDAD
		user.Compras.add(this);
		if (user.Compras.size()%3==0) {
			total=total*0.85;
			System.out.println("Se ha efectuado un descuento a su compra");
			return new Factura(menID,contadoridf,user,total,sumValorAgregado,fact.subTotal_detallefac,banco,this);
		}
		
		else {
			return new Factura(menID,contadoridf,user,total,sumValorAgregado,fact.subTotal_detallefac,banco,this);	
		}
	}
	
	
	

}
