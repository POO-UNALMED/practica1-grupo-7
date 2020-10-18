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
	}

}
