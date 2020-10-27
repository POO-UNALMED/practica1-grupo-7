package uiMain;
import java.util.*;
import gestorAplicacion.productos.*;
import gestorAplicacion.personas.*;
import BaseDatos.*;
public class interfaz {
	//AQUI CARGAR TODOS LOS OBJETOS
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Supermercado superm=null;
		ArrayList<Supermercado>supermercados=Lector.getListaObjetos();
		ArrayList<Carnes>carnes=new ArrayList<Carnes>();
		ArrayList<Lacteos>lacteos=new ArrayList<Lacteos>();
		ArrayList<Vegetales>vegetales=new ArrayList<Vegetales>();
		ArrayList<Tecnologia>tecnologia=new ArrayList<Tecnologia>();
		System.out.println("Bienvenido al sistema de compra de productos:"+"\n"+"\n"+"Por favor escoja el supermercado donde se relizo la orden:."+"\n"+"\n");
		for (int x=0;x<supermercados.size();x++) {
        	System.out.println((x+1)+". "+supermercados.get(x).getNombre());
        }
		int sup= scanner.nextInt();
		superm=supermercados.get(sup);
		for (int x=0;x<superm.getProducts().size();x++) {
			Producto pro=superm.getProducts().get(x);
			if (pro instanceof Carnes) {
				carnes.add((Carnes) pro);
			}
			else if(pro instanceof Lacteos) {
				lacteos.add((Lacteos)pro);
			}
			else if(pro instanceof Vegetales) {
				vegetales.add((Vegetales)pro);
			}
			else if(pro instanceof Tecnologia) {
				tecnologia.add((Tecnologia)pro);
			}
		}
		System.out.println("Por favor seleccione la operacion que desea realizar: \n");
		System.out.println("1. Realizar facturacion de productos. \n2. Mostrar empleado mas valioso del supermercado. \n3.Mostrar empleado con mas quejas del supermercado. \n4. Mostrar producto mas y menos vendido por el supermercado. \n5. Agregar producto al inventario del supermercado. \n6.Finalizar operacion.");
		int op1=scanner.nextInt();
		switch (op1) {
		case (1):
			System.out.println("Por favor seleccione la operacion que desea realizar: \n");
		    System.out.println("1. Facturar un producto. \n2. Finalizar facturacion.");
		    int op2=scanner.nextInt();
		    switch (op2) {
		    case (1):
		    	System.out.println("Seleccione el tipo de producto que desea facturar:\n");
		        System.out.println("1. Carnes. \n2. Lacteos. \n3.Vegetales. \n4. Tecnologia. ");
		        int tipo=scanner.nextInt();
		        switch(tipo) {
		        case(1):
		        	Carnes producto_car=null;
		        	if (carnes.isEmpty()) {
		        		System.out.println("El supermercado "+superm.getNombre()+"no cuenta con productos de tipo carnicos, disculpe las moelstias \n");
		        		break;
		        	}
		            System.out.println("Por favor seleccione el producto que desea facturar: \n");
		            for (int x=0;x<carnes.size();x++) {
		            	System.out.println((x+1)+". "+carnes.get(x).nom_producto);
		            }
		            int car=scanner.nextInt();
		            producto_car=carnes.get(car);
		            System.out.println(producto_car.Descripcion()+"\n");
		            if (producto_car.esPerecedero()) {
		            	System.out.println("Este producto debe mantenerce bajo refrigeracion \n");
		            }
		            System.out.println(producto_car.precio+"\n");
		            System.out.println("Especifique la cantidad que desea facturar \n");
		            int cant_car=scanner.nextInt();
		            //REALIZAR LOS METODOS PARA COMPROBAR LA COMPRA Y AÑADIR TODO LO NECESARIO A LA FACTURA Y ESAS COSAS
		            break;
		        case(2):
		        	Lacteos producto_lac=null;
		            if (lacteos.isEmpty()) {
		            	System.out.println("El supermercado "+superm.getNombre()+"no cuenta con productos de tipo lacteo, disculpe las moelstias \n");
		            	break;
		            	}
		            System.out.println("Por favor seleccione el producto que desea facturar: \n");
		            for (int x=0;x<lacteos.size();x++) {
		            	System.out.println((x+1)+". "+lacteos.get(x).nom_producto);
		            }
		            int lac=scanner.nextInt();
		            producto_lac=lacteos.get(lac);
		            System.out.println(producto_lac.Descripcion()+"\n");
		            if (producto_lac.esPerecedero()) {
		            	System.out.println("Este producto debe mantenerce bajo refrigeracion \n");
		            	}
		            System.out.println(producto_lac.precio+"\n");
		            System.out.println("Especifique la cantidad que desea facturar \n");
		            int cant_lac=scanner.nextInt();
		            //REALIZAR LOS METODOS PARA COMPROBAR LA COMPRA Y AÑADIR TODO LO NECESARIO A LA FACTURA Y ESAS COSAS
		            break;
		        case(3):
		        	Vegetales producto_veg=null;
		            if (vegetales.isEmpty()) {
		            	System.out.println("El supermercado "+superm.getNombre()+"no cuenta con productos de tipo vegetal, disculpe las moelstias \n");
		            	break;
		            	}
		            System.out.println("Por favor seleccione el producto que desea facturar: \n");
		            for (int x=0;x<vegetales.size();x++) {
		            	System.out.println((x+1)+". "+vegetales.get(x).nom_producto);
		            }
		            int veg=scanner.nextInt();
		            producto_veg=vegetales.get(veg);
		            System.out.println(producto_veg.Descripcion()+"\n");
		            if (producto_veg.esPerecedero()) {
		            	System.out.println("Este producto debe mantenerce bajo refrigeracion \n");
		            	}
		            System.out.println(producto_veg.precio+"\n");
		            System.out.println("Especifique la cantidad que desea facturar \n");
		            int cant_veg=scanner.nextInt();
		            //REALIZAR LOS METODOS PARA COMPROBAR LA COMPRA Y AÑADIR TODO LO NECESARIO A LA FACTURA Y ESAS COSAS
		            break;
		        case(4):
		        	Tecnologia producto_tec=null;
		            if (tecnologia.isEmpty()) {
		            	System.out.println("El supermercado "+superm.getNombre()+"no cuenta con productos de tipo tecnologicos, disculpe las moelstias \n");
		            	break;
		            	}
		            System.out.println("Por favor seleccione el producto que desea facturar: \n");
		            for (int x=0;x<tecnologia.size();x++) {
		            	System.out.println((x+1)+". "+tecnologia.get(x).nom_producto);
		            }
		            int tec=scanner.nextInt();
		            producto_tec=tecnologia.get(tec);
		            System.out.println(producto_tec.Descripcion()+"\n");
		            System.out.println(producto_tec.precio+"\n");
		            System.out.println("Especifique la cantidad que desea facturar \n");
		            int cant_tec=scanner.nextInt();
		            //REALIZAR LOS METODOS PARA COMPROBAR LA COMPRA Y AÑADIR TODO LO NECESARIO A LA FACTURA Y ESAS COSAS
		            break;
		            }
		        break;
		    case (2):
		    	System.out.println("No se facturo ningun producto.\nFinalizando operaciones\nGracias por usar nuestro sistema el dia de hoy, que tenga un buen dia y una prospera vida. \n");
		        break;
		    }
		    while(true) {
		    	System.out.println("Por favor seleccione la operacion que desea realizar: \n");
		    	System.out.println("1. Facturar otro producto. \n2. Finalizar facturacion.");
		    	int op6=scanner.nextInt();
		    	if (op6==2) {
		    		break;
		    	}
		    	System.out.println("Seleccione el tipo de producto que desea facturar:\n");
		        System.out.println("1. Carnes. \n2. Lacteos. \n3.Vegetales. \n4. Tecnologia. ");
		        int tipo=scanner.nextInt();
		        switch(tipo) {
		        case(1):
		        	Carnes producto_car=null;
		        	if (carnes.isEmpty()) {
		        		System.out.println("El supermercado "+superm.getNombre()+"no cuenta con productos de tipo carnicos, disculpe las moelstias \n");
		        		break;
		        	}
		            System.out.println("Por favor seleccione el producto que desea facturar: \n");
		            for (int x=0;x<carnes.size();x++) {
		            	System.out.println((x+1)+". "+carnes.get(x).nom_producto);
		            }
		            int car=scanner.nextInt();
		            producto_car=carnes.get(car);
		            System.out.println(producto_car.Descripcion()+"\n");
		            if (producto_car.esPerecedero()) {
		            	System.out.println("Este producto debe mantenerce bajo refrigeracion \n");
		            }
		            System.out.println(producto_car.precio+"\n");
		            System.out.println("Especifique la cantidad que desea facturar \n");
		            int cant_car=scanner.nextInt();
		            //REALIZAR LOS METODOS PARA COMPROBAR LA COMPRA Y AÑADIR TODO LO NECESARIO A LA FACTURA Y ESAS COSAS
		            break;
		        case(2):
		        	Lacteos producto_lac=null;
		            if (carnes.isEmpty()) {
		            	System.out.println("El supermercado "+superm.getNombre()+"no cuenta con productos de tipo lacteo, disculpe las moelstias \n");
		            	break;
		            	}
		            System.out.println("Por favor seleccione el producto que desea facturar: \n");
		            for (int x=0;x<lacteos.size();x++) {
		            	System.out.println((x+1)+". "+lacteos.get(x).nom_producto);
		            }
		            int lac=scanner.nextInt();
		            producto_lac=lacteos.get(lac);
		            System.out.println(producto_lac.Descripcion()+"\n");
		            if (producto_lac.esPerecedero()) {
		            	System.out.println("Este producto debe mantenerce bajo refrigeracion \n");
		            	}
		            System.out.println(producto_lac.precio+"\n");
		            System.out.println("Especifique la cantidad que desea facturar \n");
		            int cant_lac=scanner.nextInt();
		            //REALIZAR LOS METODOS PARA COMPROBAR LA COMPRA Y AÑADIR TODO LO NECESARIO A LA FACTURA Y ESAS COSAS
		            break;
		        case(3):
		        	Vegetales producto_veg=null;
		            if (carnes.isEmpty()) {
		            	System.out.println("El supermercado "+superm.getNombre()+"no cuenta con productos de tipo vegetal, disculpe las moelstias \n");
		            	break;
		            	}
		            System.out.println("Por favor seleccione el producto que desea facturar: \n");
		            for (int x=0;x<vegetales.size();x++) {
		            	System.out.println((x+1)+". "+vegetales.get(x).nom_producto);
		            }
		            int veg=scanner.nextInt();
		            producto_veg=vegetales.get(veg);
		            System.out.println(producto_veg.Descripcion()+"\n");
		            if (producto_veg.esPerecedero()) {
		            	System.out.println("Este producto debe mantenerce bajo refrigeracion \n");
		            	}
		            System.out.println(producto_veg.precio+"\n");
		            System.out.println("Especifique la cantidad que desea facturar \n");
		            int cant_veg=scanner.nextInt();
		            //REALIZAR LOS METODOS PARA COMPROBAR LA COMPRA Y AÑADIR TODO LO NECESARIO A LA FACTURA Y ESAS COSAS
		            break;
		        case(4):
		        	Tecnologia producto_tec=null;
		            if (carnes.isEmpty()) {
		            	System.out.println("El supermercado "+superm.getNombre()+"no cuenta con productos de tipo tecnologicos, disculpe las moelstias \n");
		            	break;
		            	}
		            System.out.println("Por favor seleccione el producto que desea facturar: \n");
		            for (int x=0;x<tecnologia.size();x++) {
		            	System.out.println((x+1)+". "+tecnologia.get(x).nom_producto);
		            }
		            int tec=scanner.nextInt();
		            producto_tec=tecnologia.get(tec);
		            System.out.println(producto_tec.Descripcion()+"\n");
		            System.out.println(producto_tec.precio+"\n");
		            System.out.println("Especifique la cantidad que desea facturar \n");
		            int cant_tec=scanner.nextInt();
		            //REALIZAR LOS METODOS PARA COMPROBAR LA COMPRA Y AÑADIR TODO LO NECESARIO A LA FACTURA Y ESAS COSAS
		            break;
		            }
		    }
		    //(OPCIONAL) AQUI MOSTRAR LA FACTURA COMPLETA DE SER ENCESARIO
		    System.out.println("Gracias por usar nuestro sistema el dia de hoy, que tenga un buen dia y una prospera vida. \n");
			break;
		case (2):
			if (superm.MejorMensajero()==null) {
				System.out.println("Debido a empates o falta de ventas, aun no se ha determinado al mejor empleado, lo sentimos \n");
			}
			else {
				System.out.println("El mejor empleado del supermercado "+superm.getNombre()+"es "+superm.MejorMensajero().getNombre()+"\n");
			}
			break;
		case (3):
			if (superm.MensajeroConMasQuejas()==null) {
				System.out.println("Debido a empates o falta de ventas, aun no se ha determinado al empleado con mas quejas del supermercado \n");
			}
			else {
				System.out.println("El mejor empleado del supermercado "+superm.getNombre()+"es "+superm.MejorMensajero().getNombre()+"\n");
			}
			break;
		case (4):
			System.out.println("En el supermercado "+superm.getNombre()+"el producto mas vendido hasta ahora ha sido: "+superm.prodMasPopular()+";mientras que el menos vendido a sido: "+superm.prodMenosPopular()+"\n");
		break;
		case (5):
			System.out.println("Indique que tipo de producto desea agregar al inventario: \n");
		    System.out.println("1. Carne. \n2. Lacteo. \n3.Vegetal. \n4. Tecnologia. \n");
		    int tipo=scanner.nextInt();
		    switch(tipo) {
		    case(1):
		    	System.out.println("Ingrese el nombre del producto que desea añadir: \n");
		        String producto_car=scanner.next();
		        System.out.println("Ingrese la cantadidad de "+producto_car+" que desea añadir: \n");
		        int cant_car=scanner.nextInt();
		        for (int x=0;x<carnes.size();x++) {
		        	if (carnes.get(x).nom_producto.toLowerCase()==producto_car.toLowerCase()) {
		        		carnes.get(x).stock+=cant_car;
		        		System.out.println("El producto ya se encontraba en el inventario, se agrego la cantidad al stock del producto. \n");
		        		break;
		        	}
		        }
		        System.out.println("Ingrese el id del producto que desea añadir: \n");
		        String id_car=scanner.next();
		        System.out.println("Ingrese el precio de venta del producto que desea añadir: \n");
		        int pre_car=scanner.nextInt();
		        System.out.println("ingrese el peso del producto que dea añadir: \n");
		        int pes_car=scanner.nextInt();
		        superm.AgregarProdCarnes(id_car, pre_car, producto_car, cant_car,pes_car);
		        System.out.println("Se ha agregado el producto al inventario del supermercado, gracias por usar nuestro sistema.");
		    break;
		    case(2):
		    	System.out.println("Ingrese el nombre del producto que desea añadir: \n");
		        String producto_lac=scanner.next();
		        System.out.println("Ingrese la cantadidad de "+producto_lac+" que desea añadir: \n");
		        int cant_lac=scanner.nextInt();
		        for (int x=0;x<lacteos.size();x++) {
		        	if (lacteos.get(x).nom_producto.toLowerCase()==producto_lac.toLowerCase()) {
		        		lacteos.get(x).stock+=cant_lac;
		        		System.out.println("El producto ya se encontraba en el inventario, se agrego la cantidad al stock del producto. \n");
		        		break;
		        	}
		        }
		        System.out.println("Ingrese el id del producto que desea añadir: \n");
		        String id_lac=scanner.next();
		        System.out.println("Ingrese el precio de venta del producto que desea añadir: \n");
		        int pre_lac=scanner.nextInt();
		        System.out.println("ingrese el peso del producto que dea añadir: \n");
		        superm.AgregarProdLacteo(id_lac, pre_lac, producto_lac, cant_lac);
		        System.out.println("Se ha agregado el producto al inventario del supermercado, gracias por usar nuestro sistema.");
		    break;
		    case(3):
		    	System.out.println("Ingrese el nombre del producto que desea añadir: \n");
		        String producto_veg=scanner.next();
		        System.out.println("Ingrese la cantadidad de "+producto_veg+" que desea añadir: \n");
		        int cant_veg=scanner.nextInt();
		        for (int x=0;x<vegetales.size();x++) {
		        	if (vegetales.get(x).nom_producto.toLowerCase()==producto_veg.toLowerCase()) {
		        		vegetales.get(x).stock+=cant_veg;
		        		System.out.println("El producto ya se encontraba en el inventario, se agrego la cantidad al stock del producto. \n");
		        		break;
		        	}
		        }
		        System.out.println("Ingrese el id del producto que desea añadir: \n");
		        String id_veg=scanner.next();
		        System.out.println("Ingrese el precio de venta del producto que desea añadir: \n");
		        int pre_veg=scanner.nextInt();
		        System.out.println("ingrese el peso del producto que dea añadir: \n");
		        superm.AgregarProdVegetales(id_veg, pre_veg, producto_veg, cant_veg);
		        System.out.println("Se ha agregado el producto al inventario del supermercado, gracias por usar nuestro sistema.");
		    break;
		    case(4):
		    	System.out.println("Ingrese el nombre del producto que desea añadir: \n");
		        String producto_tec=scanner.next();
		        System.out.println("Ingrese la cantadidad de "+producto_tec+" que desea añadir: \n");
		        int cant_tec=scanner.nextInt();
		        for (int x=0;x<tecnologia.size();x++) {
		        	if (tecnologia.get(x).nom_producto.toLowerCase()==producto_tec.toLowerCase()) {
		        		tecnologia.get(x).stock+=cant_tec;
		        		System.out.println("El producto ya se encontraba en el inventario, se agrego la cantidad al stock del producto. \n");
		        		break;
		        	}
		        }
		        System.out.println("Ingrese el id del producto que desea añadir: \n");
		        String id_tec=scanner.next();
		        System.out.println("Ingrese el precio de venta del producto que desea añadir: \n");
		        int pre_tec=scanner.nextInt();
		        System.out.println("ingrese el peso del producto que dea añadir: \n");
		        superm.AgregarProdTecnologia(id_tec, pre_tec, producto_tec, cant_tec);
		        System.out.println("Se ha agregado el producto al inventario del supermercado, gracias por usar nuestro sistema.");
		    break;
		    }
	    break;
		case (6):
			System.out.println("Gracias por usar nuestro sistema el dia hoy, que tenga un buen dia y una prospera vida \n");
		break;
		}
		//AQUI GUARDAR TODO LOS OBJETOS DE NUEVO
	}
}