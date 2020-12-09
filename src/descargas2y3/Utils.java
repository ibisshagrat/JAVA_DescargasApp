package descargas2y3;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Utils {

	public static String construirInforme(List<Fichero> listaDescargas, Conexion conexion) {
		String mensaje = "";
		double tamanoTotal = calcularTamanoTotal(listaDescargas);
		ordenarIdentificable(listaDescargas);
		for (Identificable<?, ?> c : listaDescargas) {
			mensaje += c.getId() + "\n";
		}
		mensaje += "Tamano total: " + tamanoTotal + "\n";
		mensaje += "El tiempo de descarga estimado es: " + formatearTiempo(tamanoTotal);
		return mensaje;	
	}
	
	public static double calcularTamanoTotal(Collection<Fichero> listaDescargas){
		double resultado = 0;
		for (Descargable s : listaDescargas) {
			resultado += s.getTamano();
		}
		return resultado;
	}
	
	public static double calcularTiempoDescarga(Collection<Fichero> listaDescargas, Conexion conexion) {
		return calcularTamanoTotal(listaDescargas)/conexion.getVelocidad();
		
	}
	
	public static void ordenarIdentificable(List<Fichero> listaDescargas) {
		
		
		Collections.sort(listaDescargas);
		
		Comparator<Descargable> compararTamano = (Descargable d1, Descargable d2) -> ((Double) d1.getTamano()).compareTo((Double) d2.getTamano());
						
		Collections.sort(listaDescargas, compararTamano);

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
