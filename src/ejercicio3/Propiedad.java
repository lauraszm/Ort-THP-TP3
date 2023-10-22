package ejercicio3;

public class Propiedad {
	private String domicilio;
	private int precio;
	private TipoPropiedad tipoPropiedad;
	
	public Propiedad(String domicilio, int precio, TipoPropiedad tipo) {
		this.domicilio = domicilio;
		this.precio = precio;
		this.tipoPropiedad = tipo;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public TipoPropiedad getTipoPropiedad() {
		return tipoPropiedad;
	}

	public void setTipoPropiedad(TipoPropiedad tipoPropiedad) {
		this.tipoPropiedad = tipoPropiedad;
	}

	@Override
	public String toString() {
		return "Propiedad [domicilio=" + domicilio + ", precio=" + precio + ", tipoPropiedad=" + tipoPropiedad + "]";
	}
	
	
}
