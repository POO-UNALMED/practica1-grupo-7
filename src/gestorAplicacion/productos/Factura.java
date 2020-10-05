package gestorAplicacion.productos;
import gestorAplicacion.personas.*;
import java.util.ArrayList;

public class Factura {
	public Mensajero idMen;
	public String idFactura;
	public Usuario user;
	public double total;
	public double iva;
	public double subTotal_detallefac;
	public String banco;
	public String telAtencion;
	Supermercado superm;
	Compra compra;
	public static ArrayList <DetalleFactura> Carrito = new ArrayList<DetalleFactura>();
    public Factura(Mensajero idM,String idFac,Usuario user,double total,double iva,double subTotal,String banco,String telAtencion,Supermercado superm,Compra compra) {
    	this.idMen=idM;
    	this.idFactura=idFac;
    	this.user=user;
    	this.total=total;
    	this.iva=iva;
    	this.subTotal_detallefac=subTotal;
    	this.banco=banco;
    	this.telAtencion=telAtencion;
    	this.superm=superm;
    	this.compra=compra;		
    }
}
