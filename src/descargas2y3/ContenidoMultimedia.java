package descargas2y3;

public abstract class ContenidoMultimedia implements Identificable<String, ContenidoMultimedia> {
	String id;
	
	@Override
	public String getId() {
		return id ;
	}
	
	public int compareTo(ContenidoMultimedia obj) {
		return id.compareTo(obj.getId());
	}
	
}
