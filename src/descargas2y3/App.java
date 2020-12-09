package descargas2y3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class App {

	static List<Fichero> listaDescargas = new ArrayList<>();
	
	public static void main(String[] args) {

		//Pelicula 1
		Collection<Actor> actores = new ArrayList<Actor>();
		actores.add(new Actor("Chuacheneger"));
		actores.add(new Actor("Silvestre"));
		Collection<Director> directores = new ArrayList<>();
		directores.add(new Director("Cameroon"));
		ContenidoMultimedia StarWars = new Pelicula(directores, "Star Wars I", null, actores);
		listaDescargas.add(new Fichero(1, 3500, "01x22Peli1", StarWars));
		
		//Pelicula 2
		Collection<Actor> actores2 = new ArrayList<Actor>();
		actores2.add(new Actor("El Bola"));
		actores2.add(new Actor("Niña bonita A"));
		Collection<Director> directores2 = new ArrayList<>();
		directores2.add(new Director("Paco Dias"));
		ContenidoMultimedia JavaLV = new Pelicula(directores2, "Java, la venganza", null, actores2);
		listaDescargas.add(new Fichero(2, 3500, "01x23Peli2", JavaLV));
		
		//Musica 3 y 4 - Canciones
		Cantante robe = new Cantante("Roberto Iniesta");
		Collection<Cantante> extremoduro = new ArrayList<>();
		extremoduro.add(robe);
		ContenidoMultimedia agila = new Album("Agila");
		ContenidoMultimedia tomas = new Cancion(extremoduro, "Tomás", (Album) agila);
		ContenidoMultimedia buscandoLuna = new Cancion(extremoduro, "Buscando una luna",(Album) agila);
		listaDescargas.add(new Fichero(3, 150, "01x23Cancion1", tomas));
		listaDescargas.add(new Fichero(4, 150, "01x24Cancion2", buscandoLuna));
		
		//Libro 5
		listaDescargas.add(new Fichero(6, 25, "01x24Libro1", new Libro("ASK2", "Regreso a la AGM", 25)));
		
		//Saga 6 
		listaDescargas.add(new Fichero(8, 15000, "01x23Peli2", new Saga("El señor del los Ladrillos")));
		
		//Conexion
		ConexionRed conexion = new ConexionRed();
		
		System.out.println(Utils.construirInforme(listaDescargas, conexion));
	}
}
