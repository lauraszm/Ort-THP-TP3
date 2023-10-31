package ejercicio11;

import java.util.ArrayList;

public class Carrera {
	private String fecha;
	private String hora;
	private Dificultad dificultad;
	int cantVueltas;
	ArrayList<Piloto> pilotos;
	
	public Carrera(String fecha, String hora, Dificultad dificultad, int cantVueltas) {
		this.fecha = fecha;
		this.hora = hora;
		this.dificultad = dificultad;
		this.cantVueltas = cantVueltas;
		this.pilotos = new ArrayList<>();
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public String getHora() {
		return hora;
	}
	
	public void setHora(String hora) {
		this.hora = hora;
	}
	
	public Dificultad getDificultad() {
		return dificultad;
	}
	
	public void setDificultad(Dificultad dificultad) {
		this.dificultad = dificultad;
	}
	
	public int getCantVueltas() {
		return cantVueltas;
	}
	
	public void setCantVueltas(int cantVueltas) {
		this.cantVueltas = cantVueltas;
	}
	
	/*
	 * La explotación del método buscarPilotosPorDebajoDe() de la clase
Carrera y que recibe como parámetro un valor en segundos para devolver
una lista de aquellos pilotos que hayan realizado al menos 10 vueltas y cuyo
promedio de tiempo no supere los segundos enviados por parámetro.*/
	
	public ArrayList<Piloto> buscarPilotosPorDebajoDe(int segundosMax){
		ArrayList<Piloto> pilotosPorDebajoDe = new ArrayList<>();
		
		for(Piloto pilotoActual: pilotos) {
			if(pilotoActual.getCantidadDeVueltas() >= 10) {
				if(pilotoActual.calcularVueltaPromedio() < segundosMax) {
					pilotosPorDebajoDe.add(pilotoActual);
				}
			}
		}
		
		return pilotosPorDebajoDe;
	}
	
	/*
	 * La explotación del método mostrarMenorPromedio() de la clase Carrera
que no recibe ningún parámetro y debe mostrar por pantalla el nombre y dni
del piloto con menor promedio.
	TODO crear clase ResumenDeCarrera que devuelve lista de nombre y dni de pilotos
*/
	
}
