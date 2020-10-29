package uiMain;
import java.util.*;
import gestorAplicacion.productos.*;
import gestorAplicacion.personas.*;
import BaseDatos.*;
public class interfaz {
	public static void main(String[] args) {
		//EL METODO LEER LLAMA TODOS LOS OBJETOS GUARDADOS EN EL FICHERO TEMP.
		Lector.Leer();
		//DECLARACION DEL ESCANER PARA RECIBIR DATOS DESDE LA CONSOLA.
		Scanner scanner = new Scanner(System.in);
		//SE CREAN LISTAS Y VARIABLES LOCALES PARA SER USADOS COMO APUNTADORES HACIA LOS OBJETOS SOBRE LOS QUE SE VA A TRABAJR.
		Supermercado superm=null;
		ArrayList<Supermercado>supermercados=Lector.getListaObjetos();
		ArrayList<Carnes>carnes=new ArrayList<Carnes>();
		ArrayList<Lacteos>lacteos=new ArrayList<Lacteos>();
		ArrayList<Vegetales>vegetales=new ArrayList<Vegetales>();
		ArrayList<Tecnologia>tecnologia=new ArrayList<Tecnologia>();
		//AVISO DE BIENVENIDA Y PRIMERA SELECCION DE OPERACION.
		System.out.println("Bienvenido al sistema de compra de productos:"+"\n"+"\n"+"Por favor escoja el supermercado donde se relizo la orden: "+"\n");
		//FOR ENCARGADO DE IMPRIMIR EL NOMBRE DE TODOS LOS SUPERMERCADOS JUNTO A UN NUMERO INDICANDO SU ÍNDICE.
		for (int x=0;x<supermercados.size();x++) {
        	System.out.println((x+1)+". "+supermercados.get(x).getNombre());
        }
		//SE RECIBE POR CONSOLA EL INDICE DEL SUPERMERCADO CON EL QUE SE VA A TRABAJAR Y SE LE ASIGNA A LA VARIABLE LOCAL SUPERM.
		int sup= scanner.nextInt();
		superm=supermercados.get(sup-1);
		//FOR USADO PARA SEPARAR LOS PRODUCTOS DEL SUPERMERCADO POR TIPOS EN SUS LISTAS CORRESPONDIENTES.
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
		//SE MUESTRA EL MENU DE TODAS LAS POSIBLES OPERACIONES A REALIZAR Y SE USA UN ESCANER PARA SABER CUAL SE VA A REALIZAR.
		System.out.println("Por favor seleccione la operacion que desea realizar: \n");
		System.out.println("1. Realizar facturacion de productos. \n2. Mostrar empleado mas valioso del supermercado. \n3. Mostrar empleado con mas quejas del supermercado. \n4. Mostrar producto mas y menos vendido por el supermercado. \n5. Agregar producto al inventario del supermercado. \n6. Mostrar salario de los mensajeros del supermercado. \n7.Finalizar operacion.");
		int op1=scanner.nextInt();
		//SWITCH/CASE PARA CADA UNA DE LAS OPERACIONES DEL SUPERMERCADO.
		switch (op1) {
		//CASO PARA LA OPCION 1(Realizar facturacion de productos).
		case (1):
			//SE CREA UN OBJETO COMPRA CON CAJERO Y MENSAJERO ALEATORIO, FACTURA NULA DE MOMENTO Y EL SUPERMERCADO SOBRE EL QUE SE ESTA TRABAJANDO.
			Factura factura=null;
		    Random RNG=new Random();
		    int i=RNG.nextInt(superm.Cajero.size());
		    Random RNG2=new Random();
		    int y=RNG2.nextInt(superm.Empleados.size());
			Compra compra=new Compra(superm.Cajero.get(i), factura, superm.Empleados.get(y), superm);
			//SE MUESTRA LAS OPERACIONES POSIBLES SOBRE LA FACTURACIÓN DE PRODUCTOS Y SE USA UN ESCÁNER PARA SABER CUAL REALIZAR.
			System.out.println("Por favor seleccione la operacion que desea realizar: \n");
		    System.out.println("1. Facturar un producto. \n2. Finalizar facturacion.");
		    int op2=scanner.nextInt();
		    //SWITCH/CASE PARA CADA UNA DE LAS OPERACIONES ACERCA DE LA FACTURACIÓN DE PRODUCTOS.
		    switch (op2) {
		    //CASO PARA LA OPCION 1(Facturar un producto).
		    case (1):
		    	//SE MUESTRAN LOS TIPOS DE PRODUCTOS Y SE USA UN ESCÁNER PARA SABER CUAL TIPO SE VA A FACTURAR.
		    	System.out.println("Seleccione el tipo de producto que desea facturar:\n");
		        System.out.println("1. Carnes. \n2. Lacteos. \n3. Vegetales. \n4. Tecnologia. ");
		        int tipo=scanner.nextInt();
		        //SWITCH/CASE PARA CADA UNO DE LOS 4 TIPOS DE PRODUCTOS DEL SUPERMERCADO.
		        switch(tipo) {
		        //CASO PARA LA OPCION 1(Carnes).
		        case(1):
		        	//CREACIÓN DE UNA VARIABLE LOCAL PARA USARLA COMO APUNTADOR AL PRODUCTO QUE SE VA A FACTURAR.
		        	Carnes producto_car=null;
		            //REVISION DE LA LISTA DE PRODUCTOS TIPO CARNE PARA SABER SI ESTA VACIA.
		        	if (carnes.isEmpty()) {
		        		System.out.println("El supermercado "+superm.getNombre()+" no cuenta con productos de tipo carnicos, disculpe las molestias \n");
		        		break;
		        	}
		        	//SE IMPRIMEN TODOS LOS PRODUCTOS DE TIPO CARNE Y SE USA EL ESCANER PARA SELECCIONAR SOBRE EL QUE SE VA A TRABAJAR.
		            System.out.println("Por favor seleccione el producto que desea facturar: \n");
		            for (int x=0;x<carnes.size();x++) {
		            	System.out.println((x+1)+". "+carnes.get(x).nom_producto);
		            }
		            int car=scanner.nextInt();
		            //ASIGNACION A LA VARIABLE LOCAL E IMPRESION DE DATOS DEL PRODUCTO A TRABAJAR.
		            producto_car=carnes.get(car-1);
		            System.out.println(producto_car.Descripcion()+"\n");
		            if (producto_car.esPerecedero()) {
		            	System.out.println("Este producto debe mantenerce bajo refrigeracion \n");
		            }
		            System.out.println("El precio de "+producto_car.nom_producto+" es "+producto_car.precio+"\n");
		            System.out.println("Especifique la cantidad que desea facturar \n");
		            //POR CONSOLA SE INGRESA LA CANTIDAD DEL PRODUCTO A FACTURAR.
		            int cant_car=scanner.nextInt();
		            compra.agregar(producto_car, cant_car, superm);
		            break;
		        //CASO PARA LA OPCION 2(Lacteos).
		        case(2):
		        	//CREACIÓN DE UNA VARIABLE LOCAL PARA USARLA COMO APUNTADOR AL PRODUCTO QUE SE VA A FACTURAR.
		        	Lacteos producto_lac=null;
		            //REVISION DE LA LISTA DE PRODUCTOS TIPO LACTEOS PARA SABER SI ESTA VACIA.
		            if (lacteos.isEmpty()) {
		            	System.out.println("El supermercado "+superm.getNombre()+" no cuenta con productos de tipo lacteo, disculpe las molestias \n");
		            	break;
		            	}
		            //SE IMPRIMEN TODOS LOS PRODUCTOS DE TIPO LACTEOS Y SE USA EL ESCANER PARA SELECCIONAR SOBRE EL QUE SE VA A TRABAJAR.
		            System.out.println("Por favor seleccione el producto que desea facturar: \n");
		            for (int x=0;x<lacteos.size();x++) {
		            	System.out.println((x+1)+". "+lacteos.get(x).nom_producto);
		            }
		            int lac=scanner.nextInt();
		            //ASIGNACION A LA VARIABLE LOCAL E IMPRESION DE DATOS DEL PRODUCTO A TRABAJAR.
		            producto_lac=lacteos.get(lac-1);
		            System.out.println(producto_lac.Descripcion()+"\n");
		            if (producto_lac.esPerecedero()) {
		            	System.out.println("Este producto debe mantenerce bajo refrigeracion \n");
		            	}
		            System.out.println("El precio de "+producto_lac.nom_producto+" es "+producto_lac.precio+"\n");
		            System.out.println("Especifique la cantidad que desea facturar \n");
		            //POR CONSOLA SE INGRESA LA CANTIDAD DEL PRODUCTO A FACTURAR.
		            int cant_lac=scanner.nextInt();
		            compra.agregar(producto_lac, cant_lac, superm);
		            break;
		        //CASO PARA LA OPCION 3(Vegetales).
		        case(3):
		        	//CREACIÓN DE UNA VARIABLE LOCAL PARA USARLA COMO APUNTADOR AL PRODUCTO QUE SE VA A FACTURAR.
		        	Vegetales producto_veg=null;
		            //REVISION DE LA LISTA DE PRODUCTOS TIPO VEGETALES PARA SABER SI ESTA VACIA.
		            if (vegetales.isEmpty()) {
		            	System.out.println("El supermercado "+superm.getNombre()+" no cuenta con productos de tipo vegetal, disculpe las molestias \n");
		            	break;
		            	}
		            //SE IMPRIMEN TODOS LOS PRODUCTOS DE TIPO VEGETALES Y SE USA EL ESCANER PARA SELECCIONAR SOBRE EL QUE SE VA A TRABAJAR.
		            System.out.println("Por favor seleccione el producto que desea facturar: \n");
		            for (int x=0;x<vegetales.size();x++) {
		            	System.out.println((x+1)+". "+vegetales.get(x).nom_producto);
		            }
		            int veg=scanner.nextInt();
		            //ASIGNACION A LA VARIABLE LOCAL E IMPRESION DE DATOS DEL PRODUCTO A TRABAJAR.
		            producto_veg=vegetales.get(veg-1);
		            System.out.println(producto_veg.Descripcion()+"\n");
		            if (producto_veg.esPerecedero()) {
		            	System.out.println("Este producto debe mantenerce bajo refrigeracion \n");
		            	}
		            System.out.println("El precio de "+producto_veg.nom_producto+" es "+producto_veg.precio+"\n");
		            System.out.println("Especifique la cantidad que desea facturar \n");
		            //POR CONSOLA SE INGRESA LA CANTIDAD DEL PRODUCTO A FACTURAR.
		            int cant_veg=scanner.nextInt();
		            compra.agregar(producto_veg, cant_veg, superm);
		            break;
		        //CASO PARA LA OPCION 4(Tecnologia).
		        case(4):
		        	//CREACIÓN DE UNA VARIABLE LOCAL PARA USARLA COMO APUNTADOR AL PRODUCTO QUE SE VA A FACTURAR.
		        	Tecnologia producto_tec=null;
		            //REVISION DE LA LISTA DE PRODUCTOS TIPO TECNOLOGIA PARA SABER SI ESTA VACIA.
		            if (tecnologia.isEmpty()) {
		            	System.out.println("El supermercado "+superm.getNombre()+" no cuenta con productos de tipo tecnologicos, disculpe las molestias \n");
		            	break;
		            	}
		            //SE IMPRIMEN TODOS LOS PRODUCTOS DE TIPO TECNOLOGIA Y SE USA EL ESCANER PARA SELECCIONAR SOBRE EL QUE SE VA A TRABAJAR.
		            System.out.println("Por favor seleccione el producto que desea facturar: \n");
		            for (int x=0;x<tecnologia.size();x++) {
		            	System.out.println((x+1)+". "+tecnologia.get(x).nom_producto);
		            }
		            int tec=scanner.nextInt();
		            //ASIGNACION A LA VARIABLE LOCAL E IMPRESION DE DATOS DEL PRODUCTO A TRABAJAR.
		            producto_tec=tecnologia.get(tec-1);
		            System.out.println(producto_tec.Descripcion()+"\n");
		            System.out.println("El precio de "+producto_tec.nom_producto+"e s "+producto_tec.precio+"\n");
		            System.out.println("Especifique la cantidad que desea facturar \n");
		            //POR CONSOLA SE INGRESA LA CANTIDAD DEL PRODUCTO A FACTURAR.
		            int cant_tec=scanner.nextInt();
		            compra.agregar(producto_tec, cant_tec, superm);
		            break;
		            }
		        break;
		    //CASO PARA LA OPCION 1(Finalizar facturacion.).
		    case (2):
		    	System.out.println("No se facturo ningun producto.\nFinalizando operaciones\nGracias por usar nuestro sistema el dia de hoy, que tenga un buen dia y una prospera vida. \n");
		        break;
		    }
		    //CICLO QUE SE EFECTUARA HASTA QUE EL USUARIO DE LA APLICACION SELECCIONE LA OPCION DE FINALIZAR FACTURACION, ES DECIR, HASTA QUE ACABE DE FACTURAR TODOS LOS PRODUCTOS DESEADOS.
		    while(true) {
		    	System.out.println("Por favor seleccione la operacion que desea realizar: \n");
		    	System.out.println("1. Facturar otro producto. \n2. Finalizar facturacion.");
		    	int op6=scanner.nextInt();
		    	if (op6==2) {
		    		break;
		    	}
		    	//SE MUESTRAN LOS TIPOS DE PRODUCTOS Y SE USA UN ESCÁNER PARA SABER CUAL TIPO SE VA A FACTURAR.
		    	System.out.println("Seleccione el tipo de producto que desea facturar:\n");
		        System.out.println("1. Carnes. \n2. Lacteos. \n3. Vegetales. \n4. Tecnologia. ");
		        int tipo=scanner.nextInt();
		        //SWITCH/CASE PARA CADA UNO DE LOS 4 TIPOS DE PRODUCTOS DEL SUPERMERCADO.
		        switch(tipo) {
		      //CASO PARA LA OPCION 1(Carnes).
		        case(1):
		        	//CREACIÓN DE UNA VARIABLE LOCAL PARA USARLA COMO APUNTADOR AL PRODUCTO QUE SE VA A FACTURAR.
		        	Carnes producto_car=null;
		            //REVISION DE LA LISTA DE PRODUCTOS TIPO CARNE PARA SABER SI ESTA VACIA.
		        	if (carnes.isEmpty()) {
		        		System.out.println("El supermercado "+superm.getNombre()+" no cuenta con productos de tipo carnicos, disculpe las molestias \n");
		        		break;
		        	}
		        	//SE IMPRIMEN TODOS LOS PRODUCTOS DE TIPO CARNE Y SE USA EL ESCANER PARA SELECCIONAR SOBRE EL QUE SE VA A TRABAJAR.
		            System.out.println("Por favor seleccione el producto que desea facturar: \n");
		            for (int x=0;x<carnes.size();x++) {
		            	System.out.println((x+1)+". "+carnes.get(x).nom_producto);
		            }
		            int car=scanner.nextInt();
		            //ASIGNACION A LA VARIABLE LOCAL E IMPRESION DE DATOS DEL PRODUCTO A TRABAJAR.
		            producto_car=carnes.get(car-1);
		            System.out.println(producto_car.Descripcion()+"\n");
		            if (producto_car.esPerecedero()) {
		            	System.out.println("Este producto debe mantenerce bajo refrigeracion \n");
		            }
		            System.out.println("El precio de "+producto_car.nom_producto+" es "+producto_car.precio+"\n");
		            System.out.println("Especifique la cantidad que desea facturar \n");
		            //POR CONSOLA SE INGRESA LA CANTIDAD DEL PRODUCTO A FACTURAR.
		            int cant_car=scanner.nextInt();
		            compra.agregar(producto_car, cant_car, superm);
		            break;
		          //CASO PARA LA OPCION 2(Lacteos).
		        case(2):
		        	//CREACIÓN DE UNA VARIABLE LOCAL PARA USARLA COMO APUNTADOR AL PRODUCTO QUE SE VA A FACTURAR.
		        	Lacteos producto_lac=null;
		            //REVISION DE LA LISTA DE PRODUCTOS TIPO LACTEOS PARA SABER SI ESTA VACIA.
		            if (lacteos.isEmpty()) {
		            	System.out.println("El supermercado "+superm.getNombre()+" no cuenta con productos de tipo lacteo, disculpe las molestias \n");
		            	break;
		            	}
		            //SE IMPRIMEN TODOS LOS PRODUCTOS DE TIPO LACTEOS Y SE USA EL ESCANER PARA SELECCIONAR SOBRE EL QUE SE VA A TRABAJAR.
		            System.out.println("Por favor seleccione el producto que desea facturar: \n");
		            for (int x=0;x<lacteos.size();x++) {
		            	System.out.println((x+1)+". "+lacteos.get(x).nom_producto);
		            }
		            int lac=scanner.nextInt();
		            //ASIGNACION A LA VARIABLE LOCAL E IMPRESION DE DATOS DEL PRODUCTO A TRABAJAR.
		            producto_lac=lacteos.get(lac-1);
		            System.out.println(producto_lac.Descripcion()+"\n");
		            if (producto_lac.esPerecedero()) {
		            	System.out.println("Este producto debe mantenerce bajo refrigeracion \n");
		            	}
		            System.out.println("El precio de "+producto_lac.nom_producto+" es "+producto_lac.precio+"\n");
		            System.out.println("Especifique la cantidad que desea facturar \n");
		            //POR CONSOLA SE INGRESA LA CANTIDAD DEL PRODUCTO A FACTURAR.
		            int cant_lac=scanner.nextInt();
		            compra.agregar(producto_lac, cant_lac, superm);
		            break;
		        //CASO PARA LA OPCION 3(Vegetales).
		        case(3):
		        	//CREACIÓN DE UNA VARIABLE LOCAL PARA USARLA COMO APUNTADOR AL PRODUCTO QUE SE VA A FACTURAR.
		        	Vegetales producto_veg=null;
		            //REVISION DE LA LISTA DE PRODUCTOS TIPO VEGETALES PARA SABER SI ESTA VACIA.
		            if (vegetales.isEmpty()) {
		            	System.out.println("El supermercado "+superm.getNombre()+" no cuenta con productos de tipo vegetal, disculpe las molestias \n");
		            	break;
		            	}
		            //SE IMPRIMEN TODOS LOS PRODUCTOS DE TIPO VEGETALES Y SE USA EL ESCANER PARA SELECCIONAR SOBRE EL QUE SE VA A TRABAJAR.
		            System.out.println("Por favor seleccione el producto que desea facturar: \n");
		            for (int x=0;x<vegetales.size();x++) {
		            	System.out.println((x+1)+". "+vegetales.get(x).nom_producto);
		            }
		            int veg=scanner.nextInt();
		            //ASIGNACION A LA VARIABLE LOCAL E IMPRESION DE DATOS DEL PRODUCTO A TRABAJAR.
		            producto_veg=vegetales.get(veg-1);
		            System.out.println(producto_veg.Descripcion()+"\n");
		            if (producto_veg.esPerecedero()) {
		            	System.out.println("Este producto debe mantenerce bajo refrigeracion \n");
		            	}
		            System.out.println("El precio de "+producto_veg.nom_producto+" es "+producto_veg.precio+"\n");
		            System.out.println("Especifique la cantidad que desea facturar \n");
		            //POR CONSOLA SE INGRESA LA CANTIDAD DEL PRODUCTO A FACTURAR.
		            int cant_veg=scanner.nextInt();
		            compra.agregar(producto_veg, cant_veg, superm);
		            break;
		        //CASO PARA LA OPCION 4(Tecnologia).
		        case(4):
		        	//CREACIÓN DE UNA VARIABLE LOCAL PARA USARLA COMO APUNTADOR AL PRODUCTO QUE SE VA A FACTURAR.
		        	Tecnologia producto_tec=null;
		            //REVISION DE LA LISTA DE PRODUCTOS TIPO TECNOLOGIA PARA SABER SI ESTA VACIA.
		            if (tecnologia.isEmpty()) {
		            	System.out.println("El supermercado "+superm.getNombre()+" no cuenta con productos de tipo tecnologicos, disculpe las molestias \n");
		            	break;
		            	}
		            //SE IMPRIMEN TODOS LOS PRODUCTOS DE TIPO TECNOLOGIA Y SE USA EL ESCANER PARA SELECCIONAR SOBRE EL QUE SE VA A TRABAJAR.
		            System.out.println("Por favor seleccione el producto que desea facturar: \n");
		            for (int x=0;x<tecnologia.size();x++) {
		            	System.out.println((x+1)+". "+tecnologia.get(x).nom_producto);
		            }
		            int tec=scanner.nextInt();
		            //ASIGNACION A LA VARIABLE LOCAL E IMPRESION DE DATOS DEL PRODUCTO A TRABAJAR.
		            producto_tec=tecnologia.get(tec-1);
		            System.out.println(producto_tec.Descripcion()+"\n");
		            System.out.println("El precio de "+producto_tec.nom_producto+"e s "+producto_tec.precio+"\n");
		            System.out.println("Especifique la cantidad que desea facturar \n");
		            //POR CONSOLA SE INGRESA LA CANTIDAD DEL PRODUCTO A FACTURAR.
		            int cant_tec=scanner.nextInt();
		            compra.agregar(producto_tec, cant_tec, superm);
		            break;
		            }
		    }
		    //RECOPILACION DE EL RESTO DE DATOS NECESARIOS PARA LA FACTURA.
		    System.out.println("Por favor ingrese el banco al que se encuentra afiliado: \n");
		    String bank=scanner.next();
		    Factura nue_fac=compra.efectuarCompra(bank);
		    compra.setFact(nue_fac);
		    System.out.println(nue_fac.toString());
		    //SE REVISA SI EXISTE ALGUAN QUEJA CON RESPECTO AL SERVICIO Y SI ASI ES SE AGREGA A LA LISTA RESPECTIVA.
		    System.out.println("Se presento alguna queja con respecto al servicio dado: \n 1. Si. \n 2. No.");
		    int ul=scanner.nextInt();
		    if (ul==1) {
		    	System.out.println("Ingrese la queja que se presento: \n");
		    	String queja=scanner.next();
		    	superm.Cajero.get(i).Quejarse(compra,queja);
		    }
		    //FINALIZACION DEL SISTEMA
		    System.out.println("Gracias por usar nuestro sistema el dia de hoy, que tenga un buen dia y una prospera vida. \n");
			break;
	    //CASO PARA LA OPCION 2(Mostrar empleado mas valioso del supermercado).
	    //IMPLEMENTACION DE FUNCIONALIDAD
		case (2):
			if (superm.MejorMensajero()==null) {
				System.out.println("Debido a empates o falta de ventas, aun no se ha determinado al mejor empleado, lo sentimos \n");
			}
			else {
				System.out.println("El mejor empleado del supermercado "+superm.getNombre()+" es "+superm.MejorMensajero().getNombre()+"\n");
			}
			break;
		//CASO PARA LA OPCION 3(Mostrar empleado con mas quejas del supermercado).
		//IMPLEMENTACION DE FUNCIONALIDAD
		case (3):
			if (superm.MensajeroConMasQuejas()==null) {
				System.out.println("Debido a empates o falta de ventas, aun no se ha determinado al empleado con mas quejas del supermercado \n");
			}
			else {
				System.out.println("El empleado con mas quejas de "+superm.getNombre()+" es "+superm.MensajeroConMasQuejas().getNombre()+", por ende deberia ser despedido.\n");
			}
			break;
		//CASO PARA LA OPCION 4(Mostrar producto mas y menos vendido por el supermercado).
		//IMPLEMENTACION DE FUNCIONALIDAD
		case (4):
			if(superm.prodMasPopular()!=null && superm.prodMenosPopular()!=null) {
				System.out.println("En el supermercado "+superm.getNombre()+" el producto mas vendido hasta ahora ha sido: "+superm.prodMasPopular()+"; mientras que el menos vendido a sido: "+superm.prodMenosPopular()+"\n");
			}
			else if(superm.prodMasPopular()==null && superm.prodMenosPopular()==null) {
				System.out.println("En el supermercado "+superm.getNombre()+" por motivos de empates o falta de ventas, no se ha determinado aun el producto mas y menos vendido \n");
			}
			else if(superm.prodMasPopular()==null && superm.prodMenosPopular()!=null) {
				System.out.println("En el supermercado "+superm.getNombre()+" el producto mas vendido hasta ahora ha sido: "+superm.prodMasPopular()+"; sin embargo por motivos de empate no se ha determinado el menos vendido \n");
			}
			else if(superm.prodMasPopular()!=null && superm.prodMenosPopular()==null) {
				System.out.println("En el supermercado "+superm.getNombre()+" el producto menos vendido hasta ahora ha sido: "+superm.prodMenosPopular()+"; sin embargo por motivos de empate o falta de ventas aun no se ha determinado el mas vendido \n");
			}
		break;
		//CASO PARA LA OPCION 5(Agregar producto al inventario del supermercado).
		case (5):
			//SE MUESTRAN TODOS LOS TIPOS DE PRODUCTOS POSIBLES A AÑADIR Y SE SLECCIONA CUAL SE VA A AÑADIR CON ELE SCANER.
			System.out.println("Indique que tipo de producto desea agregar al inventario: \n");
		    System.out.println("1. Carne. \n2. Lacteo. \n3.Vegetal. \n4. Tecnologia. \n");
		    int tipo=scanner.nextInt();
		    //SWITCH/CASE PARA CADA UNO DE LOS 4 TIPOS DE PRODUCTOS POSIBLES.
		    switch(tipo) {
		    //CASO PARA LA OPCION 1(Carnes).
		    case(1):
		    	//SE PIDE EL NOMBRE DEL PRODUCTO Y LA CANTIDAD.
		    	System.out.println("Ingrese el nombre del producto que desea añadir: \n");
		        String producto_car=scanner.next();
		        System.out.println("Ingrese la cantadidad de "+producto_car+" que desea añadir: \n");
		        int cant_car=scanner.nextInt();
		        //SI EL PRODUCTO YA EXISTE SE AÑADE AL STOCK.
		        for (int x=0;x<carnes.size();x++) {
		        	if (carnes.get(x).nom_producto.toLowerCase()==producto_car.toLowerCase()) {
		        		carnes.get(x).stock+=cant_car;
		        		System.out.println("El producto ya se encontraba en el inventario, se agrego la cantidad al stock del producto. \n");
		        		break;
		        	}
		        }
		        //SI NO EXISTE EL PRODUCTO SE PIDEN EL RESTO DE DATOS NECESARIOS Y SE AGREGA EL PRODUCTO A LA LISTA DE PRODUCTOS DEL SUPERMERCADO.
		        System.out.println("Ingrese el id del producto que desea añadir: \n");
		        String id_car=scanner.next();
		        System.out.println("Ingrese el precio de venta del producto que desea añadir: \n");
		        int pre_car=scanner.nextInt();
		        System.out.println("ingrese el peso del producto que dea añadir: \n");
		        int pes_car=scanner.nextInt();
		        superm.AgregarProdCarnes(id_car, pre_car, producto_car, cant_car,pes_car);
		        System.out.println("Se ha agregado el producto al inventario del supermercado, gracias por usar nuestro sistema.");
		    break;
		    //CASO PARA LA OPCION 1(Lacteos).
		    case(2):
		    	//SE PIDE EL NOMBRE DEL PRODUCTO Y LA CANTIDAD.
		    	System.out.println("Ingrese el nombre del producto que desea añadir: \n");
		        String producto_lac=scanner.next();
		        System.out.println("Ingrese la cantadidad de "+producto_lac+" que desea añadir: \n");
		        int cant_lac=scanner.nextInt();
		        //SI EL PRODUCTO YA EXISTE SE AÑADE AL STOCK.
		        for (int x=0;x<lacteos.size();x++) {
		        	if (lacteos.get(x).nom_producto.toLowerCase()==producto_lac.toLowerCase()) {
		        		lacteos.get(x).stock+=cant_lac;
		        		System.out.println("El producto ya se encontraba en el inventario, se agrego la cantidad al stock del producto. \n");
		        		break;
		        	}
		        }
		        //SI NO EXISTE EL PRODUCTO SE PIDEN EL RESTO DE DATOS NECESARIOS Y SE AGREGA EL PRODUCTO A LA LISTA DE PRODUCTOS DEL SUPERMERCADO.
		        System.out.println("Ingrese el id del producto que desea añadir: \n");
		        String id_lac=scanner.next();
		        System.out.println("Ingrese el precio de venta del producto que desea añadir: \n");
		        int pre_lac=scanner.nextInt();
		        System.out.println("ingrese el peso del producto que dea añadir: \n");
		        superm.AgregarProdLacteo(id_lac, pre_lac, producto_lac, cant_lac);
		        System.out.println("Se ha agregado el producto al inventario del supermercado, gracias por usar nuestro sistema.");
		    break;
		    //CASO PARA LA OPCION 1(Vegetales).
		    case(3):
		    	//SE PIDE EL NOMBRE DEL PRODUCTO Y LA CANTIDAD.
		    	System.out.println("Ingrese el nombre del producto que desea añadir: \n");
		        String producto_veg=scanner.next();
		        System.out.println("Ingrese la cantadidad de "+producto_veg+" que desea añadir: \n");
		        int cant_veg=scanner.nextInt();
		        //SI EL PRODUCTO YA EXISTE SE AÑADE AL STOCK.
		        for (int x=0;x<vegetales.size();x++) {
		        	if (vegetales.get(x).nom_producto.toLowerCase()==producto_veg.toLowerCase()) {
		        		vegetales.get(x).stock+=cant_veg;
		        		System.out.println("El producto ya se encontraba en el inventario, se agrego la cantidad al stock del producto. \n");
		        		break;
		        	}
		        }
		        //SI NO EXISTE EL PRODUCTO SE PIDEN EL RESTO DE DATOS NECESARIOS Y SE AGREGA EL PRODUCTO A LA LISTA DE PRODUCTOS DEL SUPERMERCADO.
		        System.out.println("Ingrese el id del producto que desea añadir: \n");
		        String id_veg=scanner.next();
		        System.out.println("Ingrese el precio de venta del producto que desea añadir: \n");
		        int pre_veg=scanner.nextInt();
		        System.out.println("ingrese el peso del producto que dea añadir: \n");
		        superm.AgregarProdVegetales(id_veg, pre_veg, producto_veg, cant_veg);
		        System.out.println("Se ha agregado el producto al inventario del supermercado, gracias por usar nuestro sistema.");
		    break;
		    //CASO PARA LA OPCION 1(Tecnologia).
		    case(4):
		    	//SE PIDE EL NOMBRE DEL PRODUCTO Y LA CANTIDAD.
		    	System.out.println("Ingrese el nombre del producto que desea añadir: \n");
		        String producto_tec=scanner.next();
		        System.out.println("Ingrese la cantadidad de "+producto_tec+" que desea añadir: \n");
		        int cant_tec=scanner.nextInt();
		        //SI EL PRODUCTO YA EXISTE SE AÑADE AL STOCK.
		        for (int x=0;x<tecnologia.size();x++) {
		        	if (tecnologia.get(x).nom_producto.toLowerCase()==producto_tec.toLowerCase()) {
		        		tecnologia.get(x).stock+=cant_tec;
		        		System.out.println("El producto ya se encontraba en el inventario, se agrego la cantidad al stock del producto. \n");
		        		break;
		        	}
		        }
		        //SI NO EXISTE EL PRODUCTO SE PIDEN EL RESTO DE DATOS NECESARIOS Y SE AGREGA EL PRODUCTO A LA LISTA DE PRODUCTOS DEL SUPERMERCADO.
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
	    //CASO PARA LA OPCION 6(Mostrar salario de los mensajeros del supermercado)
		case (6):
			for (int k=0;k<superm.Empleados.size();k++) {
				System.out.println("El empleado "+superm.Empleados.get(k).getNombre()+" gana un salario de "+superm.Empleados.get(k).pagoTotal(superm.Empleados.get(k)));
			}
		break;
		//CASO PARA LA OPCION 7(Finalizar operacion).
		case (7):
			System.out.println("Gracias por usar nuestro sistema el dia hoy, que tenga un buen dia y una prospera vida \n");
		break;
		}
		//EL METODO ESCRIBIR GUARDA EN EL FICHERO TEMP TODOS LO OBJETOS.
		Lector.Escribir();
	}
}