package descargas1;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Utils {

	public static String construirInforme(Collection<IdentificableDescargable> listaDescargas, Conexion conexion) {
		String mensaje = "";
		double tamanoTotal = calcularTamanoTotal(listaDescargas);
		ordenarIdentificable((List<IdentificableDescargable>)listaDescargas);
		for (IdentificableDescargable c : listaDescargas) {
			mensaje += c.getId() + "\n";
		}
		mensaje += "Tamano total: " + tamanoTotal + "\n";
		mensaje += "El tiempo de descarga estimado es: " + formatearTiempo(tamanoTotal);
		return mensaje;	
	}
	
	public static double calcularTamanoTotal(Collection<IdentificableDescargable> descargables){
		double resultado = 0;
		Descargable descargable;
		for (IdentificableDescargable s : descargables) {
			descargable = (Descargable) s;
			resultado += descargable.getTamano();
		}
		return resultado;
	}
	
	public static double calcularTiempoDescarga(Collection<IdentificableDescargable> descargables, Conexion conexion) {
		
		return calcularTamanoTotal(descargables)/conexion.getVelocidad();
		
	}
	
	public static void ordenarIdentificable(List<IdentificableDescargable> identificables) {
		
		class OrdenarPorId implements Comparator<IdentificableDescargable> {
			
			@Override
			public int compare(IdentificableDescargable obj1, IdentificableDescargable obj2) {
				int id1 = obj1.getId();
				int id2 = obj2.getId();
				
				return id1 - id2;
			}
		}
		
		Collections.sort(identificables, new OrdenarPorId());
	}
	
	public static String formatearTiempo(double segundos) {
		String mensajeSalida = "";
		int minutos = 0;
		int horas = 0;
		if (segundos >= 60) {		//Se observa si hay minutos
			minutos = (int) segundos/60;
			segundos += -minutos*60;
			if (minutos >= 60) {
				horas = minutos/60;
				minutos += -horas*60;
			}
		}
		mensajeSalida = horas + ":" + minutos + ":" + segundos;
		return mensajeSalida;
	}
	
}
