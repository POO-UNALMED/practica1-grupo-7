package gestorAplicacion.productos;
import gestorAplicacion.personas.*;
import java.util.ArrayList;
import java.io.Serializable;
public class Compra implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Usuario user;
	public Factura fact;
	public Mensajero menID;
	public Supermercado superm;
	public static int contadoridf=0;
	public static int totalCompra=0;
	public boolean propinabool=false;
	public double sumValorAgregado=0;
	public ArrayList<DetalleFactura>DetalleFacturaList=new ArrayList<>();
	public double subtotal_fact;
	public Compra(Usuario user,Factura fac,Mensajero menID,Supermercado superm){
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
		//ULTIMA FUNCIONALIDAD
		if (pro instanceof Tecnologia) {
			if(pro.precio>1000000) {
				System.out.println("Por su compra de "+pro.nom_producto+" se le ha dado una chance de usar la ruleta de la suerte");
				if(Tecnologia.GirarRuleta()==true) {
					System.out.println("Enhorabuena!! Has ganado la ruleta y por esto se le ha regalado un celular Xiaomi");
					Tecnologia CelularX=new Tecnologia();
					if (CelularX.comprobarStock(pro,cant)==true) {
						for (int i=0;i<cant;i++) {
							superm.Estadisticas.add(CelularX.nom_producto);
						}
					}
						else {
							System.out.println("El producto se encuentra agotado");
						}
					
				}
				else {
					System.out.println("Lamentablemente hoy no fue tu dia de suerte, intentalo otra vez en otro tiempo");
				}
			}
		}
		if (pro.comprobarStock(pro,cant)==true) {
			for (int i=0;i<cant;i++) {
				superm.Estadisticas.add(pro.nom_producto);
			}
			subtotal_fact+=pro.precio*cant;
			sumValorAgregado+=pro.valorAgregado();
			pro.stock-=cant;
			Factura facteje=null;
			DetalleFactura item=new DetalleFactura(facteje,pro,cant,pro.precio*cant);
			DetalleFacturaList.add(item);
		}
		else {
			System.out.println("El producto se encuentra agotado");
		}
	}
	public Factura efectuarCompra(String banco) {
		contadoridf++;
		//1ERA FUNCIONALIDAD(IMPLEMENTADA)
		if (subtotal_fact<20000) {
			menID.propina+=10000;
			propinabool=true;
		}
		double total=sumValorAgregado+subtotal_fact;
		if (propinabool=true) {
			total+=10000;
			propinabool=false;
		}
		user.Compras.add(this);
		Factura fact_id=new Factura(menID,contadoridf,user,total,sumValorAgregado,subtotal_fact,banco,this,DetalleFacturaList);
		menID.facturas.add(fact_id);
		for (int i=0;i<DetalleFacturaList.size();i++) {
			DetalleFacturaList.get(i).setId_factura(fact_id);
		}
		return fact_id ;	
		}
	}
	
	
	


