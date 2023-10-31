package ejercicio2;

import java.util.ArrayList;

public class Oficina {
	private String nombre;
	private ArrayList<Empleado> empleados;
	
	public Oficina(String nombre) {
		this.empleados = new ArrayList<>();
		this.setNombre(nombre);
	}
	
	public boolean agregarEmpleado(Empleado empleado) {		
		return this.empleados.add(empleado);
	}
	
	public void getListaEmpleados() {
		for(Empleado empl: this.empleados) {
			System.out.println(empl.getNombre());
		}
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
