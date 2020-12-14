package descargas2y3;

import java.time.LocalDate;
import java.util.Collection;

final public class Saga extends ContenidoDigital {
	
	String tituloSaga;
	Collection<Pelicula> peliculas;

	public Saga(String tituloSaga, LocalDate fecha) {
		this.tituloSaga = tituloSaga;
		id = tituloSaga;
		fechaPublicacion = fecha;

	}

	public String getTituloSaga() {
		return tituloSaga;
	}

	public void setTituloSaga(String tituloSaga) {
		this.tituloSaga = tituloSaga;
	}
	
	public void asociarPeliculas() {
		//Se acudiria al listado de peliculas (BBDD o fichero) y consultaria todas las peliculas de esa saga
	}

}
