package ejercicio5;

public class Libro {
	private String titulo;
	private Genero genero;
	private Editorial editorial;
	private int anio;
	private Autor autor;
	
	public Libro(String titulo, Genero genero, Editorial editorial, int anio, Autor autor) {
		this.setTitulo(titulo);
		this.setGenero(genero);
		this.setEditorial(editorial);
		this.setAnio(anio);
		this.setAutor(autor);
	}
	public String getTitulo() {
		return titulo;
	}
	public Genero getGenero() {
		return genero;
	}
	public Editorial getEditorial() {
		return editorial;
	}
	public int getAnio() {
		return anio;
	}
	public Autor getAutor() {
		return autor;
	}
	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	private void setGenero(Genero genero) {
		this.genero = genero;
	}
	private void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}
	private void setAnio(int anio) {
		this.anio = anio;
	}
	private void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	
}
