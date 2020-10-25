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
		System.out.println("Bienvenido al sistema de compra de productos:"+"\n"+"\n"+"Por favor escoja el supermercado donde se relizo la orden:."+"\n"+"\n");
		//RECORRER LISTA DE SUPERMERCADOS IMPRIMIENDO EL NOMBRE A CADO UNO POR MEDIO DE UN FOR PARA MOSTRARLOS TODOS
		int sup= scanner.nextInt();
		//DEPENDIENDO DEL NUMERO INGRESADO EN SUP ALMACENAR EL SUPERMERCADO CON INDICE DE LISTA == SUP EN LA VARIABLE LOCAL SUPERMERCADO
		System.out.println("Por favor seleccione la operacion que desea realizar: \n");
		System.out.println("1. Realizar facturacion de productos. \n2. Mostrar empleado mas valioso del supermercado. \n3. Mostrar producto mas y menos vendido por el supermercado \n4. Finalizar operaciones");
		int op1=scanner.nextInt();
		switch (op1) {
		case (1):
			System.out.println("Porfavor seleccione la operacion que desea realizar: \n");
		    System.out.println("1. Facturar un producto. \n2. Finalizar facturacion.");
		    int op2=scanner.nextInt();
		    switch (op2) {
		    case (1):
		    	System.out.println("Seleccione el tipo de producto que desea facturar:\n");
		        System.out.println("1. Carnes. \n2. Lacteos. \n3.Vegetales. \n4. Tecnologia. ");
		        int op3=scanner.nextInt();
		        //AQUI OTRO SWITCH/CASE EN EL QUE DEPENDIENDO DEL TIPO ELEGIDO MOSTRAR LOS PRODUCTOS DE ESE TIPO Y DENTRO DE ESE OTRO PARA SELECCIONAR EL PRODUCTO, AHI SE USAN TODOS LOS METODOS NECESARIOS PARA EVALUAR EL PRECIO Y GUARDAR LOS DATOS Y OBJETOS CREADOS
		        break;
		    case (2):
		    	System.out.println("No se facturo ningun producto.\nFinalizando operaciones\nGracias por usar nuestro sistema el dia de hoy, que tenga un buen dia y una prospera vida. ");
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
		        int op3=scanner.nextInt();
		        //AQUI OTRO SWITCH/CASE EN EL QUE DEPENDIENDO DEL TIPO ELEGIDO MOSTRAR LOS PRODUCTOS DE ESE TIPO Y DENTRO DE ESE OTRO PARA SELECCIONAR EL PRODUCTO, AHI SE USAN TODOS LOS METODOS NECESARIOS PARA EVALUAR EL PRECIO Y GUARDAR LOS DATOS Y OBJETOS CREADOS
		    }
		    //AQUI IMPLEMNETAR FUNCIONALIDAD: REVISAR EL NUMERO DE VENTAS DEL SUPERMERCADO Y REALIZAR DESCUENTO SI DE CADA 4 COMPRAS ESTA ES LA CUARTA
		    //AQUI IMPLEMENTAR FUNCIONALIDAD: REVISAR EL COSTO TOTAL DE LA COMPRA, SI ES MAS PEQUEÑA QUE UN X VALOR.AGREGAR PROPINA AL TOTAL
		    //(OPCIONAL) AQUI MOSTRAR LA FACTURA COMPLETA DE SER ENCESARIO
		    System.out.println("Gracias por usar nuestro sistema el dia de hoy, que tenga un buen dia y una prospera vida.");
			break;
		case (2):
			System.out.println("El empleado mas valioso del supermercado "+superm.getNombre()+"es "+MejorMensajero().getNombre());
			break;
		case (3):
			//FUNCIONALIDAD: DE MOEMNTO MOSTRAR EL PRODUCTO MAS Y MENOS VENDIDO
			break;
		case (4):
			System.out.println("Gracias por usar nuestro sistema el dia hoy, que tenga un buen dia y una prospera vida");
		    break;
		}
		//AQUI GUARDAR TODO LOS OBJETOS DE NUEVO
	}

}
