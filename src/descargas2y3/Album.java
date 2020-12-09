package descargas2y3;

import java.util.Collection;
import java.util.LinkedHashSet;

final public class Album extends ContenidoMultimedia {

	Collection<Cancion> canciones;
	Collection<Cantante> artistas;
	String album;
		
	public Album(String album) {
		super();
		this.album = album;
		id = album;
	}
	
	public void asociarCanciones () {
		//Acudir�a al fichero de canciones, y buscar�a todas las canciones con ese album. Una vez asociadas la canciones, buscar�a los artistas
		artistas = new LinkedHashSet<>();
		for (Cancion cancion : canciones) {
			for (Cantante cantante : cancion.getArtitas()) {
				artistas.add(cantante);
			}
			
		}
	}

	public Collection<Cancion> getCancion() {
		return canciones;
	}

	public void setCancion(Collection<Cancion> cancion) {
		this.canciones = cancion;
	}

	public Collection<Cantante> getArtistas() {
		return artistas;
	}

	public void setArtistas(Collection<Cantante> artistas) {
		this.artistas = artistas;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}
	
	
	
	
}
