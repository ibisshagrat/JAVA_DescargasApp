package descargas1;

import java.util.Collection;

final class Pelicula extends Fichero {

	Director director;
	Collection<Actor> actoresPrincipales;
	
	public Pelicula(int id, double tamano, String titulo, Collection<Actor> actoresPrincipales, Director director) {
		super(id, tamano, titulo);
		this.director = director;
		this.actoresPrincipales = actoresPrincipales;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public Collection<Actor> getActoresPrincipales() {
		return actoresPrincipales;
	}

	public void setActoresPrincipales(Collection<Actor> actoresPrincipales) {
		this.actoresPrincipales = actoresPrincipales;
	}

}
