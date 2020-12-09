package descargas1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class App {

	static List<IdentificableDescargable> listaDescargas = new ArrayList<>();
	
	public static void main(String[] args) {
		//Pelicula 1
		Collection<Actor> actores = new ArrayList<Actor>();
		actores.add(new Actor("Chuacheneger"));
		actores.add(new Actor("Silvestre"));
		listaDescargas.add(new Pelicula(1, 3500, "Star Wars I", actores, new Director("Cameroon")));
		//Pelicula 2
		Collection<Actor> actores2 = new ArrayList<Actor>();
		actores2.add(new Actor("Bad Pit"));
		actores2.add(new Actor("La morritos"));
		listaDescargas.add(new Pelicula(2, 3000, "El matrimonio chungo", actores2, new Director("Pepe Dias")));
		//Musica 3
		listaDescargas.add(new Musica(3, 150, "La cancion del verano", new Cantante("Pum Pum Chim")));
		//Musica 4
		listaDescargas.add(new Musica(3, 150, "Bailandose", new Cantante("Pum Pum Chim")));
		//Conexion
		ConexionRed conexion = new ConexionRed();
		System.out.println(Utils.construirInforme(listaDescargas, conexion));
	}
}
