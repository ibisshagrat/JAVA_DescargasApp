package descargas2y3;

public class Fichero implements IdentificableDescargable<Integer> {

	private Integer id;
	private double tamano;
	private String nombreArchivo;
	private Multimedia contenido;
	
	public Fichero(int id, double tamano, String nombreArchivo, Multimedia contenido) {
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

	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTamano(double tamano) {
		this.tamano = tamano;
	}
	
	public Multimedia getContenido() {
		return contenido;
	}
	
	public void setContenido(Multimedia contenido) {
		this.contenido = contenido;
	}
	
	@Override
	public String toString() {
		String texto = id + " - " + tamano + " b";
		return texto;
	}
}
