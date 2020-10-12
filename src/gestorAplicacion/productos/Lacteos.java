package gestorAplicacion.productos;

public class Lacteos extends Producto {
	public Lacteos(String id_producto, int precio, String nom_producto, int stock, String tipo_producto) {
		super(id_producto,precio,nom_producto,stock,tipo_producto,0.0);
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
	}

}
