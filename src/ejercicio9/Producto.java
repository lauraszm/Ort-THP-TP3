package ejercicio9;

public class Producto {
	private String nombre;
	private int cantidad;
	private Fecha fechaVencimiento;
	
	public Producto(String nombre, int cantidad, Fecha vencimiento) {
		this.setNombre(nombre);
		this.setCantidad(cantidad);
		this.setFechaVencimiento(vencimiento);
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	private void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Fecha getFechaVencimiento() {
		return fechaVencimiento;
	}

	private void setFechaVencimiento(Fecha fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	
	public boolean estaVencido(Fecha hoy) {
		return fechaVencimiento.diferenciaEnDias(hoy) < 0;
	}
}
