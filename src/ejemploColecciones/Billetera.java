package ejemploColecciones;

import java.util.ArrayList;

public class Billetera {
	private ArrayList<Tarjeta> tarjetas;
	
	//PARA INSTANCIAR EL ATRIBUTO TENGO QUE CREARLO EN EL CONSTRUCTOR
	public Billetera() {
		this.tarjetas = new ArrayList<>();
	}
	
	public boolean agregarTarjeta(Tarjeta t) {
		boolean sePudoAgregar = false;
		
		//esto devuelve true si existe la misma instancia - si hay otro elemento igual pero de distinta identidad entonces devuelve false;
		if(!tarjetas.contains(t)) {	
			this.tarjetas.add(t);
			sePudoAgregar = true;
		}
		return sePudoAgregar;
	}
	
	public boolean eliminarTarjeta(Tarjeta t) {
		return this.tarjetas.remove(t);
	}

	//no se suelen hacer getters/setters para arraylists porque acceder desde otra clase implica romper el encapsulamiento como si la lista fuera publica
	private ArrayList<Tarjeta> getTarjetas() {
		return tarjetas;
	}
	
	//se puede hacer pero no es tan normal
	public void setTarjetas(ArrayList<Tarjeta> tarjetas) {
		this.tarjetas = tarjetas;
	}
	
	//quiero que busque la tarjeta y me devuelva el banco al que pertenece, asumiendo que el numero es un identificador unico
	//si no encuentra nada que devuelva un null
	public Tarjeta buscarTarjeta(int numeroBuscado) {
		Tarjeta tarjetaEncontrada = null;
		
		//el problema con esto es que no corta nunca hasta llegar al final, incluso cuando lo encontro
		/*for(Tarjeta t: this.tarjetas) {
			if (t.getNumero() == numeroBuscado) {
				tarjetaEncontrada = t;
			}
		}*/
		
		int posicion = 0;
		int cantidadElementos = this.tarjetas.size();
		while (posicion < cantidadElementos && tarjetaEncontrada == null) {
			if (this.tarjetas.get(posicion).getNumero() == numeroBuscado) {
				tarjetaEncontrada = this.tarjetas.get(posicion);
			} else {
				posicion++;
			}
		}
		
		
		return tarjetaEncontrada;
	}
	
	
	
}
