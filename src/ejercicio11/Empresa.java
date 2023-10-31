package ejercicio11;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<Carrera> carreras;
	
	public Empresa() {
		this.carreras = new ArrayList<>();
	}
	
	/*
	 * La explotación del método buscarCarrera() de la clase Empresa, que
recibiendo como parámetro una fecha, debe devolver una instancia de la
Carrera encontrada o null en caso de no existir.
*/
	
	public Carrera buscarCarrera(String fecha) {
		Carrera carreraBuscada = null;
		Carrera carreraActual;
		int index = 0;
		int cantCarreras = this.carreras.size();
		
		while(index < cantCarreras && carreraBuscada == null) {
			carreraActual = this.carreras.get(index);
			if (carreraActual.getFecha().equals(fecha)) {
				carreraBuscada = carreraActual;
			} else {
				index++;
			}
		}
		
		return carreraBuscada;
	}
	
	/*
	 * La explotación del método pilotosPorCarrera() de la clase Empresa que
no recibe ningún parámetro y debe crear y devolver una lista con la cantidad
de pilotos que participaron en cada una de las fecha de las carreras.
*/
}
