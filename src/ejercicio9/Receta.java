package ejercicio9;

import java.util.ArrayList;

public class Receta {
	private int codigo;
	private String nombre;
	private ArrayList<Ingrediente> ingredientes;
	
	public Receta(int codigo, String nombre) {
		this.setCodigo(codigo);
		this.setNombre(nombre);
		this.ingredientes = new ArrayList<>();
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	private void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public ArrayList<Ingrediente> getIngredientes() {
		return ingredientes;
	}
	
	
}
