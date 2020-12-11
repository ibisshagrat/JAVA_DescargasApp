package descargas2y3;

public class Fichero implements IdentificableDescargable<Integer>, Comparable<Fichero>{

	private Integer id;
	private double tamano;
	private String nombreArchivo;		//incluye la ruta
	private ContenidoDigital contenido;
	
	public Fichero(int id, double tamano, String nombreArchivo, ContenidoDigital contenido) {
		super();
		setId(id);
		setTamano(tamano);
		setNombreArchivo(nombreArchivo);
		setContenido(contenido);
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

	@Override
	public String toString() {
		String texto = id + " - " + tamano + " b";
		return texto;
	}

	@Override
	public int compareTo(Fichero arg0) {
		return getId().compareTo(arg0.getId());
	}
}
