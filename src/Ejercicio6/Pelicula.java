package Ejercicio6;

public class Pelicula {
	private String nombre;
	private Servicio servicio;

	public Pelicula(String nombre, Servicio servicio) {
		this.setNombre(nombre);
		this.setServicio(servicio);
	}
	public String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Servicio getServicio() {
		return servicio;
	}
	private void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}
	
	
}
