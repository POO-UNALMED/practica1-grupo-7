package BaseDatos;
import java.util.ArrayList;

import gestorAplicacion.personas.*;
import gestorAplicacion.productos.*;
public class casoBase {
	private ArrayList<Mensajero> mensajeros=new ArrayList<>();
	private ArrayList<Usuario> cajeros=new ArrayList<>();
	public void crearObjetos() {
		String[] nombresGenericos= new String[] {"Carlos", "Juan", "Rosa", "Rosalba", "Jorge", "Mariana", "Matilda", "Steven", "Zaratustra","Clara", "Rafael","Clarence"};
		String[] idsGenericos=new String[] {"1000294025", "923135078", "980432808", "997453286", "994395782", "967284910", "945285904", "999123456", "666666666","996734653", "998244075","989234086"};
		String[] generosGenericos=new String[] {"M", "N/A", "F", "F", "M", "F", "N/A", "N/A", "SuperM","F", "M","M"};
		String[] direccionesGenericas=new String[] {"Av 55 No. 13 23", "Calle 35b No 38 94", "Carrera 55 No 13 02", "Av 12 No 09 23", "Calle 13 No 12 10", "Carrera 13 No 12 03", "Calle 43 No 12 53", "Av 75 No 15 32", "Av 09 No 34 65","Calle 53 No 54 09", "Carrera 42 No 54 31","Calle 01 No 01 01"};
		String[] telGenericos=new String[] {"6123982", "8964729", "9472754", "1263585", "2583532", "35725427", "1133525", "56427436", "6666666","1252636", "13585474","2468495"};
		String[] celGenericos=new String[] {"3118640586", "3216784839", "3267653524", "3556458705", "3625673428", "3723458642", "3926542714", "3652376538", "6666666666","3472461423", "3527436235","3864569362"};
		String[] transportesGenericos=new String[] {"Carro", "Camion", "Caballo", "Potro", "Carro", "Deportivo", "Dron", "Caja", "Pie","Escoba", "Carruaje","Otra Persona Viva"};		
		for(int i=0; i<3;i++) {
			mensajeros.add(new Mensajero(nombresGenericos[(int) Math.floor(Math.random()*12+1)],idsGenericos[(int) Math.floor(Math.random()*12+1)],generosGenericos[(int) Math.floor(Math.random()*12+1)],direccionesGenericas[(int) Math.floor(Math.random()*12+1)],
					telGenericos[(int) Math.floor(Math.random()*12+1)],celGenericos[(int) Math.floor(Math.random()*12+1)],transportesGenericos[(int) Math.floor(Math.random()*12+1)],0,0));
			cajeros.add(new Usuario(nombresGenericos[(int) Math.floor(Math.random()*12+1)],idsGenericos[(int) Math.floor(Math.random()*12+1)],generosGenericos[(int) Math.floor(Math.random()*12+1)],direccionesGenericas[(int) Math.floor(Math.random()*12+1)],
					telGenericos[(int) Math.floor(Math.random()*12+1)],celGenericos[(int) Math.floor(Math.random()*12+1)],i));
		}
	}
}
