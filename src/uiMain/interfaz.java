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
		System.out.println("1. Supermercado 1"+"\n"+"2. Supermercado 2"+"\n"+"3. Supermercado"+"\n"+"4. Supermercado");
		int sup= scanner.nextInt();
		switch (sup) {
		case (1):
			//CARGAR DATOS DEL SUPERMERCADO 1 A LA VARIABLE LOCAL SUPERM
			break;
		case (2):
			//CARGAR DATOS DEL SUPERMERCADO 2 A LA VARIABLE LOCAL SUPERM
			break;
		case (3):
			//CARGAR DATOS DEL SUPERMERCADO 3 A LA VARIABLE LOCAL SUPERM
			break;
		case (4):
			//CARGAR DATOS DEL SUPERMERCADO 4 A LA VARIABLE LOCAL SUPERM
			break;
		}
		System.out.println("Por favor seleccione la operación que desea realizar en "+superm.getNombre()+": \n");
		System.out.println("1. Realizar facturación de productos. \n2. Mostrar empleado mas valioso del supermercado. \n3. Mostrar producto mas y menos vendido por el supermercado \n4. Finalizar operaciones");
		int op1=scanner.nextInt();
		switch (op1) {
		case (1):
			//AGREGAR TODOS LOS PRODUCTOS A FACTURAR SUMAR LOS PRECIOS Y TODO ESO
			break;
		case (2):
			//FUNCIONALIDAD: DE MOMENTO MOSTRAR AL EMPLEADO CON MAS FACTURAS
			break;
		case (3):
			//FUNCIONALIDAD: DE MOEMNTO MOSTRAR EL PRODUCTO MAS Y MENOS VENDIDO
			break;
		case (4):
			System.out.println("Gracias por usar nuestro sistema el dia hoy, que tenga un buen dia y una prospera vida");
		    //AQUI GUARDAR TODOS LOS DATOS OTRA VEZ (AUNQUE EN ESTE CASO NO SE REALIZARON CAMBIOS), LAS VARIABLES LOCALES SE REINICAN CADA VEZ QUE SE EJECUTA EL MAIN ASI QUE NO AHY NECESIDAD DE INICIALIZARLAS
		    break;
		}
	}

}
