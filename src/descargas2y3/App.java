package descargas2y3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class App {

	
	public static void main(String[] args) {
		
		List<Fichero> listaDescargas = new ArrayList<>();
		
		//Pelicula 1
		Collection<Director> directores = new ArrayList<>();
		directores.add(new Director("Cameroon"));
		ContenidoDigital StarWars = new Pelicula(directores, "Star Wars I", null, LocalDate.of(1989, 10, 20), new Actor("Chuacheneger"), new Actor("Silvestre"));
		listaDescargas.add(new Fichero(1, 3500, "01x22Peli1", StarWars));
		for (Fichero fichero : listaDescargas) {
			fichero.setPremium(false);
		}
		
		//Pelicula 2
		Collection<Director> directores2 = new ArrayList<>();
		directores2.add(new Director("Paco Dias"));
		ContenidoDigital JavaLV = new Pelicula(directores2, "Java, la venganza", null, LocalDate.of(1993, 12, 2), new Actor("El Bola"), new Actor("Niña bonita A"));
		listaDescargas.add(new Fichero(2, 3500, "01x23Peli2", JavaLV));
		
		//Musica 3 y 4 - Canciones
		Cantante extremoduro = new Cantante("Roberto Iniesta");
		Cantante fito = new Cantante("Fito");
		ContenidoDigital agila = new Album("Agila");
		ContenidoDigital tomas = new Cancion("Tomas", (Album) agila, LocalDate.of(1991, 1, 2), extremoduro);
		ContenidoDigital buscandoLuna = new Cancion("Buscando una luna",(Album) agila, LocalDate.of(1991, 1, 2), extremoduro, fito);
		listaDescargas.add(new Fichero(3, 150.5, "01x23Cancion1", tomas));
		listaDescargas.add(new Fichero(4, 150, "01x24Cancion2", buscandoLuna));
		
		//Libro 5
		listaDescargas.add(new Fichero(6, 25, "01x24Libro1", new Libro("ASK2", "Regreso a la AGM", 25, LocalDate.of(2007, 7, 9))));
		
		//Saga 6 
		listaDescargas.add(new Fichero(8, 15000, "01x23Peli2", new Saga("El senor del los Ladrillos", LocalDate.of(1927, 5, 27))));
		
		//Conexion
		
		System.out.println(Utils.construirInforme(listaDescargas));
	}
}
