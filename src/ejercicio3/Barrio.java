package ejercicio3;

import java.util.ArrayList;

public class Barrio {
	private String nombre;
	private ArrayList<Propiedad> propiedades;
	
	public Barrio(String nombre) {
		this.nombre = nombre;
		propiedades= new ArrayList<>();
	}
	
	/*
	 * Explotá el método mostrarPropiedades(...) de la clase Barrio, que reciba
un tipo de propiedad y muestre las direcciones y precios de todas las
propiedades de ese tipo*/
	
	public void mostrarPropiedades(TipoPropiedad tipo) {
		for (Propiedad prop: propiedades) {
			if (tipo != null && prop.getTipoPropiedad() == tipo) {
				System.out.println(prop.toString());
			}
		}
	}
	
	public void mostrarPropiedades() {
		for (Propiedad prop: propiedades) {
			System.out.println(prop.toString());
		}
	}
	
	public int getCantPropiedades() {
		return propiedades.size();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public Propiedad buscarPropPorDomicilio(String domicilio) {
		Propiedad propiedadBuscada = null;
		Propiedad propiedadActual;
		int index = 0;
		
		while (index < propiedades.size() && propiedadBuscada == null) {
			propiedadActual = propiedades.get(index);
			if(propiedadActual.getDomicilio().equals(domicilio)) {
				propiedadBuscada = propiedadActual;
			} else {
				index++;
			}
		}
		
		return propiedadBuscada;
	}
	
	public boolean removerPropiedad(Propiedad prop) {
		boolean fueRemovida = false;
		Propiedad propiedadARemover = buscarPropPorDomicilio(prop.getDomicilio());

		if(prop != null && propiedadARemover != null) {
			propiedades.remove(prop);
			fueRemovida = true;
		}
		return fueRemovida;
	}
	
	public boolean agregarPropiedad(Propiedad prop) {
		boolean fueAgregada = false;
		if (propiedades.size() == 0) {
			propiedades.add(prop);
			fueAgregada = true;
		} else if (propiedades.size() > 0){
			Propiedad propiedadAAgregar = buscarPropPorDomicilio(prop.getDomicilio());
			if (prop != null && propiedadAAgregar == null) {
				propiedades.add(prop);
				fueAgregada = true;
			}
		}
		return fueAgregada;
	}
	
}
