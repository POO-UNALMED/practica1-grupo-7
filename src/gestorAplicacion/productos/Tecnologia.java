package gestorAplicacion.productos;

public class Tecnologia extends Producto {

	public Tecnologia(String id_producto, int precio, String nom_producto, int stock, String tipo_producto) {
		super(id_producto,precio,nom_producto,stock,tipo_producto,0.19);
	}
public boolean comprobarStock(Producto lacteos,int cant) {
		
	    int totalprod=lacteos.stock-cant;
		if (totalprod>0) {
			return true;	
	}
		else {
			return false;
		}
	}
	public void reStock(int cantidad) {
		this.stock+=cantidad;
	} {
		// TODO Auto-generated constructor stub
	}

}
