package descargas1;

final class Musica extends Fichero{

	private Cantante cantante;
	
	public Musica(int id, double tamano, String titulo, Cantante cantante) {
		super(id, tamano, titulo);
		this.cantante =  cantante;
	}

	public Cantante getCantante() {
		return cantante;
	}
}
