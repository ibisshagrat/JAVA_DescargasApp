package descargas2y3;

import java.time.LocalDate;

public class Fichero implements Identificable<Integer>, Descargable{

	private Integer id;
	private double tamano;
	private String nombreArchivo;		//incluye la ruta
	private ContenidoDigital contenido;
	private boolean premium = true;
	
	public Fichero(int id, double tamano, String nombreArchivo, ContenidoDigital contenido) {
		super();
		setId(id);
		setTamano(tamano);
		setNombreArchivo(nombreArchivo);
		setContenido(contenido);
	}

	public boolean isPremium() {
		return premium;
	}
	
	public void setPremium(boolean premium) {
		this.premium = premium;
	}
	
	public double getTamano() {
		return tamano;
	}

	public Integer getId() {
		return id;
	}

	public String getNombreArchivo() {
		return nombreArchivo;
	}

	private void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	private void setId(int id) {
		this.id = id;
	}

	private void setTamano(double tamano) {
		this.tamano = tamano;
	}
	
	public ContenidoDigital getContenido() {
		return contenido;
	}
	
	private void setContenido(ContenidoDigital contenido) {
		this.contenido =  contenido;
	}

	public LocalDate getFechaPublicacion() {
		return contenido.getFechaPublicacion();
	}
	
	@Override
	public String toString() {
		String texto = id + " - " + tamano + " b";
		return texto;
	}

}
