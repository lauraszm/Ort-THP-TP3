package ejercicio11;

import java.util.ArrayList;

public class Piloto {
	private String nombre;
	private String dni;
	private ArrayList<Vuelta> vueltas;
	
	public Piloto(String nombre, String dni, ArrayList<Vuelta> vueltas) {
		this.setNombre(nombre);
		this.setDni(dni);
		vueltas = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	private void setDni(String dni) {
		this.dni = dni;
	}
	
	public int getCantidadDeVueltas() {
		return this.vueltas.size();
	}
	
	/*
	 * La explotación del método calcularVueltaPromedio() de la clase Piloto,
que debe calcular el promedio de tiempo de dicho piloto entre todas las
vueltas que haya realizado.*/
	
	public double calcularVueltaPromedio() {
		double promedio;
		double acumVueltas = 0;
		for(Vuelta vuelta: vueltas) {
			acumVueltas += vuelta.getTiempo();
		}
		promedio = acumVueltas / this.vueltas.size();
		
		return promedio;
	}
	
}
