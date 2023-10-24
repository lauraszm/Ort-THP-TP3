package ejercicio5;

import java.util.ArrayList;

public class Lector {
	private final int MAX_PRESTAMOS = 3;
	private String dni;
	private String nombre;
	private String domicilio;
	private String telefono;
	private int diasDeMulta;
	private ArrayList<Ejemplar> prestamos;
	
	public Lector(String dni, String nombre, String domicilio, String telefono) {
		this.setDni(dni);
		this.setNombre(nombre);
		this.setDomicilio(domicilio);
		this.setTelefono(telefono);
		this.diasDeMulta = 0;
		this.prestamos = new ArrayList<>();
	}
	
	public void procesarLibroMultas(Fecha fechaHoy) {
		int cantDias;
		for(Ejemplar ejemplar: prestamos) {
			cantDias = ejemplar.getFechaPrestamo().diferenciaEnDias(fechaHoy);
			if(ejemplar.getFechaPrestamo().diferenciaEnDias(fechaHoy) >= 7) {
				this.diasDeMulta+=(cantDias*2);
			}
		}
	}
	
	public boolean tieneMulta(Fecha fechaHoy) {
		int cantDias, cantDiasMulta = 0, index = 0;
		Ejemplar ejemplar;
		boolean tieneMulta = false;

		while (index < this.prestamos.size() && !tieneMulta) {
			ejemplar = this.prestamos.get(index);
			cantDias = ejemplar.getFechaPrestamo().diferenciaEnDias(fechaHoy);
			tieneMulta = (cantDias >= 7);	
		}
	
		
		return tieneMulta;
	}
	
	public boolean tieneEspacioPrestamo() {
		return this.prestamos.size() < MAX_PRESTAMOS;
	}
	
	public boolean agregarPrestamo(Ejemplar ejemplar) {
		
		boolean fueAgregado = false;
		if(this.prestamos.size() < MAX_PRESTAMOS) {
			this.prestamos.add(ejemplar);
			fueAgregado = true;
		}
		return fueAgregado;
	}
	
	public boolean removerPrestamo(Ejemplar ejemplar) {
		
		return this.prestamos.remove(ejemplar);
	}
	
	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	private void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	
	
	
}
