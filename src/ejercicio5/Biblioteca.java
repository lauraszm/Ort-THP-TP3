package ejercicio5;

import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<Ejemplar> ejemplares;
	private ArrayList<Ejemplar> prestados;
	private ArrayList<Autor> autores;
	private ArrayList<Editorial> editoriales;
	private ArrayList<Lector> lectores;
	private Fecha fechaHoy;
	
	public Biblioteca(Fecha fechaHoy) {
		ejemplares = new ArrayList<>();
		prestados = new ArrayList<>();
		autores = new ArrayList<>();
		editoriales = new ArrayList<>();
		lectores = new ArrayList<>();
		this.fechaHoy = fechaHoy;
	}
	
	public EstadoPrestamo prestar(Libro libro, Lector lector) {
		EstadoPrestamo resultado = EstadoPrestamo.PRESTAMO_EXITOSO;
		Ejemplar ejemplarEncontrado;
		if (lector.tieneMulta(this.fechaHoy)) {
			resultado = EstadoPrestamo.MULTA_VIGENTE;
		} else if(!lector.tieneEspacioPrestamo()) {
			resultado = EstadoPrestamo.TOPE_PRESTAMOS_ALCANZADO;
		} else if(this.buscarEjemplar(libro) == null) {
			resultado = EstadoPrestamo.NO_HAY_EJEMPLARES;
		} else {
			ejemplarEncontrado = this.buscarEjemplar(libro);
			ejemplarEncontrado.setEstado(Estado.PRESTADO);
			ejemplarEncontrado.setFechaPrestamo(fechaHoy);
			lector.agregarPrestamo(ejemplarEncontrado);
			this.removerEjemplar(ejemplarEncontrado);
			this.agregarAListaDePrestamos(ejemplarEncontrado);

		}
		
		return resultado;
	}
	
	private Ejemplar buscarEjemplar(Libro libro) {
		Ejemplar ejemplarBuscado = null;
		Ejemplar ejemplarActual;
		int index = 0;
		int cantEjemplares = this.ejemplares.size();
		
		while(index < cantEjemplares && ejemplarBuscado == null) {
			ejemplarActual = this.ejemplares.get(index);
			if(ejemplarActual.getLibro().equals(libro)) {
				ejemplarBuscado = ejemplarActual;
			} else {
				index++;
			}
		}
		
		return ejemplarBuscado;
	}
	
	private boolean removerEjemplar(Ejemplar ejemplar) {
		return this.ejemplares.remove(ejemplar);
	}
	
	private boolean agregarAListaDePrestamos(Ejemplar ejemplar) {
		return this.prestados.add(ejemplar);
	}
}
