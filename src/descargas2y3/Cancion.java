package descargas2y3;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;

final public class Cancion extends ContenidoDigital{
	
	Collection<Cantante> artistas;
	String titulo;
	Album album;
	
	public Cancion(String titulo, Album album, LocalDate fecha, Cantante...cantantes) {
		super();
		this.artistas = Arrays.asList(cantantes);
		this.titulo = titulo;
		this.album =  album;
		id = titulo;
		fechaPublicacion = fecha;

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
