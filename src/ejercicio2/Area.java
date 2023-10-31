package ejercicio2;

import java.util.ArrayList;

public class Area {
	private String nombre;
	private ArrayList<Oficina> oficinas;
	
	public Area(String nombre) {
		this.setNombre(nombre);
		this.oficinas = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean agregarOficina(Oficina oficina) {
		return this.oficinas.add(oficina);
	}
	
	public void getListaOficinas() {
		for(Oficina oficina: this.oficinas) {
			System.out.println(oficina.getNombre());
			oficina.getListaEmpleados();
		}
	}
}
