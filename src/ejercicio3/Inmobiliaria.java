package ejercicio3;

import java.util.ArrayList;

public class Inmobiliaria {

	/*
	 * Una inmobiliaria posee una lista con todos los barrios en donde tiene propiedades a
la venta. Cada barrio tiene su nombre y una lista con todas las propiedades a vender.
De cada propiedad se sabe el domicilio (String), su precio y su tipo (Departamento,
Casa o PH). */
	
	private ArrayList<Barrio> barrios;
	
	public Inmobiliaria() {
		barrios = new ArrayList<>();
	}
	
	public void agregarBarrio(Barrio barrio) {
		barrios.add(barrio);
	}
	
	/*
	 * Explotá el método mostrarPropiedades() de la clase Inmobiliaria, el cual
debe mostrar la dirección y el precio de todas las propiedades que posea a la
venta.
*/
	public void mostrarPropiedades() {
		for (Barrio barrio: barrios) {
			barrio.mostrarPropiedades();
		}
	}
	
	/*
	 * Desarrollá el método obtenerBarrioMaxProp() de la clase Inmobiliaria,
que devuelva una lista de él o los barrios con la mayor cantidad de propiedades 
en cartera. Debe ser usado desde el método de la misma clase
mostrarBarrioMaxProp().*/
	
	private int obtenerBarrioMaxProp(){
		int maxCantProp = 0;
		for(Barrio bar: barrios) {
			if (bar.getCantPropiedades()> maxCantProp) {
				maxCantProp = bar.getCantPropiedades();
			}
		}
		return maxCantProp;
	}
	
	public void mostrarBarrioMaxProp() {
		ArrayList<Barrio> barrioMaxProp = new ArrayList<>();
		int maxCantProp = obtenerBarrioMaxProp();
		for(Barrio bar: barrios) {
			if (bar.getCantPropiedades() == maxCantProp) {
				barrioMaxProp.add(bar);
			}
		}
		for(Barrio bar: barrioMaxProp) {
			System.out.println(bar.getNombre());
		}
	}
	
	/*Una propiedad puede ser cargada en el barrio incorrecto. Explotá el método
cambiarPropiedadDeBarrio() de la clase Inmobiliaria, que reciba un
domicilio y un barrio y mueva la propiedad asociada a ese domicilio al nuevo
barrio, removiéndola del barrio anterior.*/
	public boolean cambiarPropiedadDeBarrio(String domicilio, Barrio nuevoBarrio) {
		boolean cambioDeBarrio = false;
		Barrio barrioDeBusqueda;
		Propiedad propAMover;
		Barrio barrioAnterior = null;
		int index = 0;
		
		while (index < barrios.size() && barrioAnterior == null) {
			barrioDeBusqueda = barrios.get(index);
			propAMover = barrioDeBusqueda.buscarPropPorDomicilio(domicilio);
			if (propAMover != null) {
				barrioAnterior = barrioDeBusqueda;
				barrioAnterior.removerPropiedad(propAMover);
				cambioDeBarrio = nuevoBarrio.agregarPropiedad(propAMover);
			} else {
				index++;
			}
		}
		return cambioDeBarrio;
	}
	
	/*
	 * Explotá el método borrarPropiedad() de la clase Inmobiliaria, que reciba
un domicilio y elimine la propiedad asociada a ese domicilio del barrio donde
se encuentre.
*/
	
	public boolean borrarPropiedad(String domicilio) {
		boolean fueBorrada = false;
		Propiedad propABorrar = null;
		Barrio barrioDeBusqueda;
		int index = 0;
		
		while (index < barrios.size() && propABorrar == null) {
			barrioDeBusqueda = barrios.get(index);
			propABorrar = barrioDeBusqueda.buscarPropPorDomicilio(domicilio);
			if (propABorrar != null) {
				fueBorrada = barrioDeBusqueda.removerPropiedad(propABorrar);
			} else {
				index++;
			}
		}
		
		
		return fueBorrada;
	}
	
}
