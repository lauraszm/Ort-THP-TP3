package ejercicio11;

public class Vuelta {
	private int tiempo;
	private int numDeVuelta;
	
	public Vuelta (int tiempo, int numero) {
		this.setTiempo(tiempo);
		this.setNumDeVuelta(numero);
	}

	public int getTiempo() {
		return tiempo;
	}

	private void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public int getNumDeVuelta() {
		return numDeVuelta;
	}

	private void setNumDeVuelta(int numDeVuelta) {
		this.numDeVuelta = numDeVuelta;
	}
	
	
}
