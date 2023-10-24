package Ejercicio6;

import java.util.ArrayList;

public class Cliente {

	/*
	 * Del cliente del cual se conocen su DNI, su nombre y el saldo a pagar que
debe (si no debe estará en cero, si pagó de más será negativo).*/
	private String dni;
	private String nombre;
	private double saldo;
	private Servicio servicio;
	private ArrayList<Pelicula> historialPeliculas;
	
	public Cliente(String dni, String nombre, Servicio servicio) {
		this.setDni(dni);
		this.setNombre(nombre);
		this.setServicio(servicio);
		this.setSaldo(0);
		this.historialPeliculas = new ArrayList<>();
	}
	
	public boolean esDeudor() {
		return this.getSaldo()<0;
	}
	
	public String getDni() {
		return dni;
	}
	public String getNombre() {
		return nombre;
	}
	public double getSaldo() {
		return saldo;
	}
	public Servicio getServicio() {
		return servicio;
	}
	private void setDni(String dni) {
		this.dni = dni;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	private void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}
	
	
}
