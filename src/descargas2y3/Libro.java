package descargas2y3;

final public class Libro extends ContenidoMultimedia/* implements IdentificableDescargable<String, Libro>, */ implements Book {
	private String id;
	private String titulo;
	private double tamano;
	
	
	
	public Libro(String id, String titulo, double tamano) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.tamano = tamano;
	}

	public String getId() {
		return id;
	}

	public double getTamano() {
		return tamano;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setTamano(double tamano) {
		this.tamano = tamano;
	}

	@Override
	public String toString() {
		String texto = id + " - " + tamano + " b";
		return texto;
	}

//	@Override
//	public int compareTo(Libro arg0) {
//		return getId().compareTo(arg0.getId());
//	}
}
