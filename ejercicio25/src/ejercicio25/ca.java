package ejercicio25;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ca {
	private String playlist, autor, nombreCancion[];
	private int tamanio;
	private double duracion, duracionCancion[];
	private static int salir,  num, contador;
	private static char opcion;
	private boolean borrar;

	public ca() {
		playlist = "";
		autor = "";
		duracion = 0;
		tamanio = 0;
		nombreCancion = new String[20];
		duracionCancion = new double[20];
		boolean borrar;
	}

	public static void main(String[] args) {
		String data;
		int can = 0;
		ca Disco1 ;
		Disco1 = new ca();
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("A para añadir una cancion con sus datos al disco.");
			System.out.println("B para añadir una cancion a la playlist.");
			System.out.println("C para obtener la duracion total del disco y sus datos y reproducirla");
			System.out.println("D para borrar una cancion de la playlist");
			System.out.println("E para salir del programa");
			opcion = in.next().charAt(0);
			switch (opcion) {
			case 'A':
				System.out.println("Has elegido añadir datos al disco !");
				System.out.println("Ingesa el nombre del disco : ");
				data = in.next();
				Disco1.setNombrePlaylist(data);
				System.out.println("Ingresa el autor de la playlist : ");
				data = in.next();
				System.out.println("Ahora ingrese, ¿cuantas canciones tiene la playlist?: ");
				num = in.nextInt();
				if (num > 20) {
					System.out.println("Solo se pueden almacenar un maximo de 20 canciones.");
				} else {
					Disco1.setTamanio(num);
					can = 0;
					for (int i = 0; i < Disco1.getTamanio(); i++) {
						can++;
						System.out.println("Ingrese el nombre de la cancion " + can + " :");
						Disco1.nombreCancion[i] = in.next();
						System.out.println("Ingrese la duracion de la cancion " + can + " :");
						Disco1.duracionCancion[i] = in.nextDouble();
						Disco1.duracion = Disco1.duracion + Disco1.duracionCancion[i];
					}
					contador++;
				}
				System.out.println("Se ha añadido una cancion a la playlist");

			case 'B':

				if (Disco1.tamanio >= 20) {
					System.out.println("Se ha llegado al limite de canciones.");
				} else {
					Disco1.tamanio++;
					System.out.println("Ingrese el nombre de la nueva cancion: ");
					Disco1.nombreCancion[Disco1.tamanio] = in.next();
					System.out.println("Ingrese la duracion de la nueva cancion: ");
					Disco1.duracionCancion[Disco1.tamanio] = in.nextDouble();
					Disco1.duracion = Disco1.duracion + Disco1.duracionCancion[Disco1.tamanio];
				}
			case 'C':
				System.out.println(Disco1.getPlaylist());
				System.out.println(Disco1.getAutor());
				System.out.println("Duracion del disco 1: " + Disco1.duracion);
				System.out.println("Canciones del disco ( canciones: " + Disco1.getTamanio() + "): ");
				for (int i = 0; i <= Disco1.getTamanio(); i++) {
					System.out.println(Disco1.nombreCancion[i]);
				}

			case 'D':
				salir++;
				break;
			default:
				System.out.println("El caracter que has introducido no es valido.");
				break;
			}
		} while (salir < 1);
	}

	public void setNombrePlaylist(String ponerPlaylist) {
		playlist = ponerPlaylist;
	}

	public void setAutor(String ingresoAutor) {
		autor = ingresoAutor;
	}


	public void setTamanio(int ingresoIndiceCancion) {
		tamanio = ingresoIndiceCancion;
	}

	public int getTamanio() {
		return tamanio;
	}

	public String getPlaylist() {
		return playlist;
	}

	public String getAutor() {
		return autor;
	}
	public void borrar() {
		for (int i = 0; i < duracionCancion.length; i++) {
		}
	}

	

}
