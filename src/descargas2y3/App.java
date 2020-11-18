package descargas2y3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class App {

	static List<IdentificableDescargable<?>> listaDescargas = new ArrayList<>();
	
	public static void main(String[] args) {

		//Pelicula 1
		Collection<Actor> actores = new ArrayList<Actor>();
		actores.add(new Actor("Chuacheneger"));
		actores.add(new Actor("Silvestre"));
		Collection<Director> directores = new ArrayList<>();
		directores.add(new Director("Cameroon"));
		Pelicula StarWars = new Pelicula(directores, "Star Wars I", null, actores);
		listaDescargas.add(new Fichero(1, 3500, "01x22Peli1", StarWars));
		//Pelicula 2
		Collection<Actor> actores2 = new ArrayList<Actor>();
		actores2.add(new Actor("El Bola"));
		actores2.add(new Actor("Niña bonita A"));
		Collection<Director> directores2 = new ArrayList<>();
		directores2.add(new Director("Paco Dias"));
		Pelicula JavaLV = new Pelicula(directores2, "Java, la venganza", null, actores2);
		listaDescargas.add(new Fichero(2, 3500, "01x23Peli2", JavaLV));
		//Musica 3 y 4 - Canciones
		Cantante robe = new Cantante("Roberto Iniesta");
		Collection<Cantante> extremoduro = new ArrayList<>();
		extremoduro.add(robe);
		Album agila = new Album("Agila");
		Cancion tomas = new Cancion(extremoduro, "Tomás", agila);
		Cancion buscandoLuna = new Cancion(extremoduro, "Buscando una luna", agila);
		listaDescargas.add(new Fichero(3, 150, "01x23Cancion1", tomas));
		listaDescargas.add(new Fichero(4, 150, "01x24Cancion2", buscandoLuna));
		//Libro 5
		listaDescargas.add(new Libro("ASK2", "Regreso a la AGM", 25));
		//Saga 6 
		listaDescargas.add(new Fichero(2, 15000, "01x23Peli2", new Saga("El señor del los Ladrillos")));
		//Conexion
		ConexionRed conexion = new ConexionRed();
		System.out.println(construirInforme(listaDescargas, conexion));
	}
	
	public static String construirInforme(Collection<IdentificableDescargable<?>> listaDescargas, Conexion conexion) {
		String mensaje = "";
		double tamanoTotal = calcularTamanoTotal(listaDescargas);
		ordenarIdentificable(listaDescargas);
		for (Identificable<?> c : listaDescargas) {
			mensaje += c.getId() + "\n";
		}
		mensaje += "Tamano total: " + tamanoTotal + "\n";
		mensaje += "El tiempo de descarga estimado es: " + formatearTiempo(tamanoTotal);
		return mensaje;	
	}
	
	public static double calcularTamanoTotal(Collection<IdentificableDescargable<?>> descargables){
		double resultado = 0;
		Descargable descargable;
		for (Descargable s : descargables) {
			descargable = (Descargable) s;
			resultado += descargable.getTamano();
		}
		return resultado;
	}
	
	public static double calcularTiempoDescarga(Collection<IdentificableDescargable<?>> descargables, Conexion conexion) {
		
		return calcularTamanoTotal(descargables)/conexion.getVelocidad();
		
	}
	
	public static void ordenarIdentificable(Collection<IdentificableDescargable<?>> identificables) {
	
		Collections.sort((List<IdentificableDescargable<?>>) identificables, new Identificable.Compare());
	}
	
	public static String formatearTiempo(double segundos) {
		String mensajeSalida = "";
		int minutos = 0;
		int horas = 0;
		if (segundos >= 60) {			//Se observa si hay minutos
			minutos = (int) segundos/60;
			segundos += -minutos*60;
			if (minutos >= 60) {		//Se observa si hay horas
				horas = minutos/60;
				minutos += -horas*60;
			}
		}
		mensajeSalida = horas + ":" + minutos + ":" + segundos;
		return mensajeSalida;
	}
	
}
