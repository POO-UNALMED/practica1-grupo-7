package gestorAplicacion.productos;
import gestorAplicacion.personas.*;
import java.util.ArrayList;

public class Factura {

	public Mensajero idMen;
	public int idFactura;
	public Usuario user;
	public double total;
	public double iva;
	public double subTotal_detallefac;
	public String banco;
	public static final String telAtencion="911";
	public static final Supermercado superm;
	Compra compra;
	public static ArrayList <DetalleFactura> Carrito = new ArrayList<DetalleFactura>();
	static {
		Supermercado superm1=new Supermercado("Exito","Cll11","30988555");
		superm=superm1;
	}
    public Factura(Mensajero idM,int idFac,Usuario user,double total,double iva,double subTotal,String banco,Compra compra) {
    	this.idMen=idM;
    	this.idFactura=idFac;
    	this.user=user;
    	this.total=total;
    	this.iva=iva;
    	this.subTotal_detallefac=subTotal;
    	this.banco=banco;
    	this.compra=compra;
    	this.idMen.facturas.add(this);
    }
	public Mensajero getIdMen() {
		return idMen;
	}
	public void setIdMen(Mensajero idMen) {
		this.idMen = idMen;
	}
	public int getIdFactura() {
		return idFactura;
	}
	public Usuario getUser() {
		return user;
	}
	public void setUser(Usuario user) {
		this.user = user;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getIva() {
		return iva;
	}
	public void setIva(double iva) {
		this.iva = iva;
	}
	public double getSubTotal_detallefac() {
		return subTotal_detallefac;
	}
	public void setSubTotal_detallefac(double subTotal_detallefac) {
		this.subTotal_detallefac = subTotal_detallefac;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public String getTelAtencion() {
		return telAtencion;
	}	
}
