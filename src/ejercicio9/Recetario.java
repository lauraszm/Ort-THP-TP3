package ejercicio9;

import java.util.ArrayList;

public class Recetario {
	private ArrayList<Receta> recetas;
	
	public Recetario() {
		this.recetas = new ArrayList<>();
	}
	
	public ArrayList<Ingrediente> prepararListadoAComprar(String nombreReceta, int cantPorciones, Deposito deposito){
		ArrayList<Ingrediente> ingredientes = new ArrayList<>();
		Receta receta = buscarRecetaPorNombre(nombreReceta);
		
		
		if(receta != null) {
			obtenerIngredientesFaltantes(receta, deposito, cantPorciones, ingredientes);
		}
		
		
		return ingredientes;
	}
	
	private Receta buscarRecetaPorNombre(String nombre) {
		Receta recetaBuscada = null;
		Receta recetaActual;
		int index = 0;
		int cantRecetas = this.recetas.size();
		
		while(recetaBuscada == null && index < cantRecetas) {
			recetaActual = this.recetas.get(index);
			if (recetaActual.getNombre() == nombre) {
				recetaBuscada = recetaActual;
			} else {
				index++;
			}
		}
		return recetaBuscada;
	}
	
	private void obtenerIngredientesFaltantes(Receta receta, Deposito deposito, int cantPorciones, ArrayList<Ingrediente> ingredientes) {
		Ingrediente ingredienteFaltante;
		
		for (Ingrediente unIngrediente: receta.getIngredientes()) {
			if(unIngrediente.isEsRefrigerado() == deposito.isEsRefrigerado()) {
				ingredienteFaltante = deposito.obtenerFaltante(unIngrediente.getNombre(), (unIngrediente.getCantidad()*cantPorciones));
				
				if(ingredienteFaltante != null) {
					ingredientes.add(unIngrediente);
				}
			}
		}
	}
	
}
