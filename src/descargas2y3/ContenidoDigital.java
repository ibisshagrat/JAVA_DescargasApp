package descargas2y3;

import java.time.LocalDate;

public abstract class ContenidoDigital implements Identificable<String> {
	protected String id;
	protected LocalDate fechaPublicacion;
	
	@Override
	public String getId() {
		return id ;
	}
	
	public LocalDate getFechaPublicacion() {
		return fechaPublicacion;		
	}
	
}
