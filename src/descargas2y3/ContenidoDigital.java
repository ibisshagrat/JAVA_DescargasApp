package descargas2y3;

public abstract class ContenidoDigital implements Identificable<String> {
	String id;
	
	@Override
	public String getId() {
		return id ;
	}
//	
//	public int compareTo(ContenidoDigital obj) {
//		return id.compareTo(obj.getId());
//	}
	
}
