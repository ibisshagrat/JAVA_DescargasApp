package descargas2y3;

import java.util.Collection;

final public class Cancion extends ContenidoMultimedia{
	
	Collection<Cantante> artistas;
	String titulo;
	Album album;
	
	public Cancion(Collection<Cantante> artistas, String titulo, Album album) {
		super();
		this.artistas = artistas;
		this.titulo = titulo;
		this.album =  album;
		id = titulo;

	}
	
	public Collection<Cantante> getArtitas() {
		return artistas;
	}
	public void setArtitas(Collection<Cantante> artitas) {
		this.artistas = artitas;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Album getAlbum() {
		return album;
	}
	public void setAlbum(Album album) {
		this.album = album;
	}
}
