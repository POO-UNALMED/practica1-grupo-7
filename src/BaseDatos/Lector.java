package BaseDatos;
import java.io.*;
import java.nio.file.*;
public class Lector {
	private static Path path;
	private static ObjectOutputStream o;
	private static OutputStream f;
	private static InputStream f1;
	private static ObjectInputStream o1; 
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
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void Escribir() {

		try {
			f = Files.newOutputStream(Paths.get(path.toString()+"Objetos.txt"),StandardOpenOption.WRITE);
			o= new ObjectOutputStream(f);
		} catch (IOException e) {
			System.out.println("f");
		}

	}
}
