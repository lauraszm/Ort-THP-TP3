package ejercicio5;

public class Autor {
	private String nombre;
	private String nacionalidad;
	private Fecha fechaDeNacimiento;
	
	public Autor(String nombre, String nacionalidad, Fecha fecha) {
		this.setFechaDeNacimiento(fecha);
		this.setNacionalidad(nacionalidad);
		this.setNombre(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public Fecha getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	private void setFechaDeNacimiento(Fecha fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	
}
