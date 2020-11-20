package descargas2y3;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Utils {

	public static String construirInforme(Collection<IdentificableDescargable<?>> listaDescargas, Conexion conexion) {
		String mensaje = "";
		double tamanoTotal = calcularTamanoTotal(listaDescargas);
		ordenarIdentificable(listaDescargas);
		for (Identificable<?> c : listaDescargas) {
			mensaje += c.getId() + "\n";
		}
		mensaje += "Tamano total: " + tamanoTotal + "\n";
		mensaje += "El tiempo de descarga estimado es: " + formatearTiempo(tamanoTotal);
		return mensaje;	
	}
	
	public static double calcularTamanoTotal(Collection<IdentificableDescargable<?>> descargables){
		double resultado = 0;
		Descargable descargable;
		for (Descargable s : descargables) {
			descargable = (Descargable) s;
			resultado += descargable.getTamano();
		}
		return resultado;
	}
	
	public static double calcularTiempoDescarga(Collection<IdentificableDescargable<?>> descargables, Conexion conexion) {
		return calcularTamanoTotal(descargables)/conexion.getVelocidad();
		
	}
	
	public static void ordenarIdentificable(Collection<IdentificableDescargable<?>> identificables) {
		Collections.sort((List<IdentificableDescargable<?>>) identificables, new Identificable.Compare());
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
