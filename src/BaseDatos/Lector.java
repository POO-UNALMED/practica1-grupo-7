package BaseDatos;
import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import gestorAplicacion.personas.*;
import gestorAplicacion.productos.*;
public class Lector {
	private static Path path;
	private static ObjectOutputStream o;
	private static OutputStream f;
	private static InputStream f1;
	private static ObjectInputStream o1; 
	private static ArrayList<Supermercado> listaObjetos=new ArrayList<>();
	public static ArrayList<Supermercado> getListaObjetos() {
		return listaObjetos;
	}
	public static void setListaObjetos(ArrayList<Supermercado> listaObjetos) {
		Lector.listaObjetos = listaObjetos;
	}
	{
		File decoy=new File("");
		try {
			path = Files.createDirectory(Paths.get(decoy.getAbsolutePath()+"\\src\\BaseDatos").resolve("temp"));
		} catch (IOException e) {
			System.out.println("f");
		}		
	}
	public static void Leer() {
		try {
			f1 = Files.newInputStream(Paths.get(path.toString()+"Objetos.txt"),StandardOpenOption.READ);
			o1 =new ObjectInputStream(f1);
			Supermercado sup;
			do {
				sup= (Supermercado) o1.readObject();				
			}
			while(o1!=null);
		} catch (IOException e) {
			System.out.println("f");
		}
		catch(ClassNotFoundException e) {
			System.out.println("f");
		}
	}
	public static void Escribir() {

		try {
			f = Files.newOutputStream(Paths.get(path.toString()+"Objetos.txt"),StandardOpenOption.WRITE);
			o= new ObjectOutputStream(f);
			for (Supermercado i: listaObjetos) {
				o.writeObject(i);
			}
		} catch (IOException e) {
			System.out.println("f");
		}

	}
}
