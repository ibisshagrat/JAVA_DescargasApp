package descargas1;

public abstract class Fichero implements IdentificableDescargable {

	private int id;
	private double tamano;
	private String titulo;
		
	public Fichero(int id, double tamano, String titulo) {
		setId(id);
		setTamano(tamano);
		setTitulo(titulo);
	}

	public double getTamano() {
		return tamano;
	}

	public int getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTamano(double tamano) {
		this.tamano = tamano;
	}
}
