package ejercicio9;

public class Ingrediente {
	private int cantidad;
	private String nombre;
	private boolean esRefrigerado;
	
	public Ingrediente(int cantidad, String nombre, boolean esRefrigerado) {
		this.setCantidad(cantidad);
		this.setNombre(nombre);
		this.setEsRefrigerado(esRefrigerado);
	}
	
	public int getCantidad() {
		return cantidad;
	}
	private void setCantidad(int cantidad) {
		this.cantidad = cantidad;
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
	
	
}
