package descargas2y3;

import java.util.Collection;

final public class Cancion extends Multimedia{
	
	Collection<Cantante> artitas;
	String titulo;
	Album album;
	
	public Cancion(Collection<Cantante> artitas, String titulo, Album album) {
		super();
		this.artitas = artitas;
		this.titulo = titulo;
		this.album =  album;
		id = titulo;

	}
	
	public Collection<Cantante> getArtitas() {
		return artitas;
	}
	public void setArtitas(Collection<Cantante> artitas) {
		this.artitas = artitas;
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
