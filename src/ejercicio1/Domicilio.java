package ejercicio1;

public class Domicilio {
	private String calle;
	private String ciudad;
	private int numero;
	
	public String getCalle() {
		return calle;
	}
	public String getCiudad() {
		return ciudad;
	}
	public int getNumero() {
		return numero;
	}
	@Override
	public String toString() {
		return "Domicilio [calle=" + calle + ", numero=" + numero + ", ciudad=" + ciudad + "]";
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
}
