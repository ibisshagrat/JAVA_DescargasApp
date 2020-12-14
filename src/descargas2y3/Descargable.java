package descargas2y3;

import java.time.LocalDate;

public interface Descargable {

	double getTamano();
	boolean isPremium();
	LocalDate getFechaPublicacion();
	
}
