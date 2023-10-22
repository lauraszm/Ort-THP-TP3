package ejercicio1;

public class Persona {
	private String nombre;
	private String apellido;
	private String dni;
	private Domicilio domicilio;
	
	//ejercicio3, constructor x defecto
	public Persona(String nombre, String apellido, String dni, Domicilio domicilio) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.domicilio = domicilio;
	}
	
	public void ponerNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void ponerApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String obtenerNombreCompleto() {
		return this.getNombre() + " " + this.getApellido();
		//return this.nombre + " " + this.apellido;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", domicilio=" + mostrarDomicilio()
				+ "]";
	}

	public String mostrarDomicilio() {
		if(this.domicilio != null) {			
			return this.domicilio.toString();
		} else {
			String mensaje = "No tiene domicilio";
			return mensaje;
		}
	}
}
