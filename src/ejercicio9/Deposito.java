package ejercicio9;

import java.util.ArrayList;

public class Deposito {
	private String nombre;
	private boolean esRefrigerado;
	private ArrayList<Producto> productos;
	private Fecha hoy;
	
	public Deposito(String nombre, boolean esRefrigerado) {
		this.setNombre(nombre);
		this.setEsRefrigerado(esRefrigerado);
		this.productos = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isEsRefrigerado() {
		return esRefrigerado;
	}

	private void setEsRefrigerado(boolean esRefrigerado) {
		this.esRefrigerado = esRefrigerado;
	}
	
	public Ingrediente obtenerFaltante(String nombre, int cantRequerida) {
		Ingrediente ingredienteFaltante = null;
		Producto producto;
		int index = 0;
		
		while (index < this.productos.size() && cantRequerida > 0) {
			producto = this.productos.get(index);
			if (producto.getNombre().equals(nombre) && !producto.estaVencido(hoy)) {
				cantRequerida -= producto.getCantidad();
			}
			index++;
		}
		
		if(cantRequerida > 0) {
			ingredienteFaltante = new Ingrediente(cantRequerida, nombre, this.isEsRefrigerado());
		}
		
		return ingredienteFaltante;
	}
	
}
