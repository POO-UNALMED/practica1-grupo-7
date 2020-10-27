package gestorAplicacion.productos;
import gestorAplicacion.personas.*;
import java.util.ArrayList;
import java.io.Serializable;
public class Factura implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Mensajero idMen;
	public int idFactura;
	public Usuario user;
	public double total;
	public double sumValorAgregado;
	public double subTotal_detallefac;
	public String banco;
	public static final String telAtencion="911";
	public  Supermercado superm;
	Compra compra;
	public  ArrayList <DetalleFactura> productList = new ArrayList<DetalleFactura>();
    public Factura(Mensajero idM,int idFac,Usuario user,double total,double iva,double subTotal,String banco,Compra compra,ArrayList<DetalleFactura> productlist) {
    	this.idMen=idM;
    	this.idFactura=idFac;
    	this.user=user;
    	this.total=total;
    	this.sumValorAgregado=iva;
    	this.subTotal_detallefac=subTotal;
    	this.banco=banco;
    	this.compra=compra;
    	this.idMen.facturas.add(this);
    	this.productList=productlist;
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
		return sumValorAgregado;
	}
	public void setIva(double iva) {
		this.sumValorAgregado = iva;
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
	public String toString() {
		String ListaDetFact="";
		for(int i=0;productList.size()<i;i++) {
			ListaDetFact+=productList.get(i).getId_producto().getNom_producto()+productList.get(i).getCantidad()+productList.get(i).getSubtotal()+"/n";
		}
		return "Su factura con id "+idFactura+" realizada con el banco "+banco+" genera un total de /n"+total+"/n Lista de Productos /n"+ListaDetFact;
	}
}
