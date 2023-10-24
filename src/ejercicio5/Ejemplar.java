package ejercicio5;

public class Ejemplar {
	private String identificador;
	private Fecha fechaPrestamo;
	private Estado estado;
	private Libro libro;
	
	public Ejemplar(String identificador, Libro libro) {
		this.setEstado(Estado.BIBLIOTECA);
		this.setIdentificador(identificador);
		this.setLibro(libro);
	}

	public String getIdentificador() {
		return identificador;
	}

	private void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public Fecha getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(Fecha fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Libro getLibro() {
		return libro;
	}

	private void setLibro(Libro libro) {
		this.libro = libro;
	}
	
	
}
