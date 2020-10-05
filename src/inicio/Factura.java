package inicio;

import java.util.ArrayList;
public class Factura {
	public String idMensajero;
	public String idFactura;
	public Usuario user;
	public double total;
	public double iva;
	public double subTotal_detallefac;
	public String banco;
	public String telAtencion;
	Supermercado superm;
	Compra compra;
	public static ArrayList <DetFactura> Carrito = new ArrayList<DetFactura>();
}
