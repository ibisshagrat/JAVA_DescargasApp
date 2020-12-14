package descargas2y3;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Utils {
	
	public static final String LINEA = "------------------";

	public static <T extends Identificable<Integer> & Descargable> String construirInforme(List<T> listaDescargas, Conexion conexion) {
		String mensaje = "";
		double tamanoTotal = calcularTamanoTotal(listaDescargas);
		ordenarIdentificable(listaDescargas,2);
		int contador = 0;
		for (T c : listaDescargas) {
			contador++;
			mensaje += contador + "# " + ((c.isPremium())? "*":"") + c.getId() + "\n";
		}
		mensaje += LINEA + "\n";
		mensaje += "Tamano total: " + tamanoTotal + " MB \n";
		mensaje += "El tiempo de descarga estimado es: " + formatearTiempo(tamanoTotal);
		return mensaje;	
	}
	
	public static double calcularTamanoTotal(Collection<? extends Descargable> listaDescargas){
		double resultado = 0;
		for (Descargable s : listaDescargas) {
			resultado += s.getTamano();
		}
		return resultado;
	}
	
	public static double calcularTiempoDescarga(Collection<? extends Descargable> listaDescargas, Conexion conexion) {
		return calcularTamanoTotal(listaDescargas)/conexion.getVelocidad();
		
	}
	
	public static void ordenarIdentificable(List<Fichero> listaDescargas) {
		
		ordenarIdentificable(listaDescargas, 0);
	}
	//criterio ordenacion: 0 -> id, 1 -> tamaño,2->fecha
	public static <T extends Identificable<Integer> & Descargable> void ordenarIdentificable(List<T> listaDescargas, int criterio) {
		
		if (criterio == 0) {
			Collections.sort(listaDescargas);
		} else {
			if (criterio == 1) {
				Comparator<Descargable> ordenacion = (Descargable d1, Descargable d2) -> ((Double) d1.getTamano()).compareTo((Double) d2.getTamano());
				Collections.sort(listaDescargas, ordenacion);

			} else if (criterio == 2) {
				Comparator<T> ordenacion = (T d1, T d2) -> (d1.getFechaPublicacion()).compareTo(d2.getFechaPublicacion());
				Collections.sort(listaDescargas, ordenacion);

			}
		}
	}
	
	public static String formatearTiempo(double segundos) {
		String mensajeSalida = "";
		int minutos = 0;
		int horas = 0;
		if (segundos >= 60) {			//Se observa si hay minutos
			minutos = (int) segundos/60;
			segundos += -minutos*60;
			if (minutos >= 60) {		//Se observa si hay horas
				horas = minutos/60;
				minutos += -horas*60;
			}
		}
		mensajeSalida = horas + ":" + minutos + ":" + segundos;
		return mensajeSalida;
	}
	
}
