package Ejercicio6;

import java.util.ArrayList;

public class HistorialPeliculas {
	private ArrayList<Pelicula> historial;
	
	public HistorialPeliculas() {
		historial = new ArrayList<>();
	}
	
	private boolean buscarPeliculaEnHistorial(Pelicula pelicula) {
		boolean existePelicula = false;
		int index = 0, cant = this.historial.size();
		
		while (!existePelicula && index < cant) {
			Pelicula peliculaActual = this.historial.get(index);
			if (peliculaActual.getNombre().equals(pelicula.getNombre())) {
				existePelicula = true;
			}
		}
		return existePelicula;
	}
	
	public void agregarPeliculaAHistorial(Pelicula pelicula) {
		if(!this.buscarPeliculaEnHistorial(pelicula)) {
			this.historial.add(pelicula);
		}
	}
	
}
