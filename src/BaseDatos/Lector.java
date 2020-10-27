package BaseDatos;
import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import gestorAplicacion.productos.*;
public class Lector implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	static{
		File decoy=new File("");
		try {
			path = Files.createDirectory(Paths.get(decoy.getAbsolutePath()+"\\src\\BaseDatos").resolve("temp"));
			path= Files.createFile(path.resolve("Objetos.txt"));
			casoBase.crearObjetos();
			for (Supermercado e:listaObjetos) {
				System.out.println(e.getNombre());
			}
			Escribir();
			System.out.println("ff'nt");
		} catch (IOException e) {
			path=Paths.get(decoy.getAbsolutePath()+"\\src\\BaseDatos\\temp\\Objetos.txt");
			System.out.println("ff");
		}		
	}
	public static void Leer() {
		try {
			f1 = Files.newInputStream(path,StandardOpenOption.READ);
			o1 =new ObjectInputStream(f1);
			Supermercado sup;
			do {
				sup= (Supermercado) o1.readObject();
				listaObjetos.add(sup);
			}
			while(o1!=null);
			o1.close();
		} catch (IOException e) {
			System.out.println("f");
		}
		catch(ClassNotFoundException e) {
			System.out.println("e");
		}
	}
	public static void Escribir() {

		try {
			f = Files.newOutputStream(path,StandardOpenOption.WRITE);
			o= new ObjectOutputStream(f);
			for (Supermercado i: listaObjetos) {
				o.writeObject(i);
			}
			o.close();
		} catch (IOException e) {
			System.out.println("f");
		}

	}
}
