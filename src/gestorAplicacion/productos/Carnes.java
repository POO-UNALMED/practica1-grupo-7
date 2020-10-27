package gestorAplicacion.productos;
import java.io.Serializable;
public class Carnes extends Producto implements Refrigerador,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static final double iva=0.05;
	double valorAgregado;
	int peso;
	public Carnes(String id_producto, int precio, String nom_producto, int stock, String tipo_producto,int peso) {
		super(id_producto,precio,nom_producto,stock,tipo_producto);
		this.valorAgregado();
		this.peso=peso;
		super.precio=precioTotal();
	}
	public String Descripcion() {
		return "Las carnes mas jugosas de la zona,un paquete de  "+this.nom_producto;
	}
	public double valorAgregado() {
		valorAgregado=this.precio*iva;
		return valorAgregado;
	}
	public int precioTotal() {
		return this.precio*peso;	
	}
	public boolean esPerecedero() {
		return true;
	}
	public int temperaturaPreferida() {
		return 10;
	}


	}

