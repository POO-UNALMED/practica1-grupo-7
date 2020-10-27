package gestorAplicacion.productos;
import java.util.Random;

public class Tecnologia extends Producto {
	static final double iva=0.19;
	double valorAgregado;
	public Tecnologia() {
		super("12345",550000,"Xiaomi NoteS",10,"Mobil");
		this.valorAgregado();
	}
	public Tecnologia(String id_producto, int precio, String nom_producto, int stock, String tipo_producto) {
		super(id_producto,precio,nom_producto,stock,tipo_producto);
		this.valorAgregado();
	}
	public String Descripcion() {
		return "Lo Ultimo en tecnologia al alcanze,un  "+this.nom_producto+" de ultima tecnologia";
	}
	public double valorAgregado() {
		valorAgregado=this.precio*iva;
		return valorAgregado;
	}
	public static boolean GirarRuleta() {
		Random RNG=new Random();
		int NumberRolled=RNG.nextInt(101);
		if(NumberRolled<=25) {
			return true;
		}
		else {
			return false;
		}
	}


}
