package ejercicio1;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<Persona> personas;
	
	public Agenda() {
		personas = new ArrayList<>();
	}
	
	/*Método privado buscarPersona() que busca en la colección la persona con
	el dni recibido por parámetro. Si la encuentra la devuelve, sino devuelve null.*/
	
	private Persona buscarPersona(String dniBuscado) {
		Persona personaBuscada = null;
		Persona personaActual;
		int index = 0;
		
		while(personaBuscada == null && index < personas.size()) {
			personaActual = this.personas.get(index);
			
			if (personaActual.getDni().equals(dniBuscado)){
				personaBuscada = personaActual;
			} else {
				index++;
			}
		}
				
		return personaBuscada;
	}
	
	/*
	 *  Método público agregarPersona() que recibe por parámetro todos los datos
		necesarios para registrar una persona. Si no existe la persona con el dni
		recibido crea una nueva instancia de Persona con todos los datos recibidos y
		la agrega a la colección. Devuelve un booleano indicando si la acción se pudo
		realizar (si se agregó la persona) o no.

	 */
	 public boolean agregarPersona(String nombre, String apellido, String dni, Domicilio domicilio) {
		 boolean usuarioCreado = false;
		 if (this.buscarPersona(dni) == null) {
			 Persona personaNueva = new Persona(nombre, apellido, dni, domicilio);
			 personas.add(personaNueva);
			 usuarioCreado = true;
		 }
		 return usuarioCreado;
	 }
	 
	 /*
	  * Método público removerPersona(), que recibe como parámetro el número
		de dni de una persona. Si encuentra en la colección una persona con el 
		mismo dni recibido la extrae de la colección y la devuelve. Cuando no la
		encuentra devuelve null.
	  */
	 
	 public Persona removerPersona(String dni) {
		 Persona personaARemover = this.buscarPersona(dni);
		 
		 if (personaARemover != null) {
			 personas.remove(personaARemover);
		 }
		 
		 return personaARemover;
	 }
	 
	 /*
	  * Método público modificarDomicilio() que recibe por parámetro un dni y
		un domicilio. Si encuentra en la lista a la persona con ese dni modifica su
		domicilio con el recibido por parámetro. Retorna un booleano indicando si la
		operación fue exitosa o no*/
	 
	 public boolean modificarDomicilio(String dni, Domicilio domicilio) {
		 boolean cambioDomicilio = false;
		 Persona personaBuscada = this.buscarPersona(dni);
		 if (personaBuscada != null) {
			 personaBuscada.setDomicilio(domicilio);
			 cambioDomicilio = true;
		 }
		 
		 return cambioDomicilio;
	 }
	 
	 /*
	  * Método público listarPersonas() que emite por pantalla en formato de
		listado a cada persona encontrada en la colección (con sus respectivos
		atributos).
	  */
	 
	 public void listarPersonas() {
		 if(personas.size()>0) {			 
			 for(Persona pers: personas) {
				 System.out.println(pers.toString());
			 }
		 } else {
			 System.out.println("lista vacia");
		 }
	 }
	 
	 /*
	  * Método público devolverUltimo() que no recibe parámetros y devuelve el
		último elemento de la lista (si es que ésta contiene elementos).
	  */
	 
	 public Persona devolverUltimo() {
		 Persona personaBuscada = null;
		 if (personas.size()>0) {
			 personaBuscada = personas.get(personas.size() -1 );
		 }
		 return personaBuscada;
	 }
	 
	 /*
	  * Método público eliminarTodosElementosAMano() que no recibe parámetros y
		elimina todos los elementos de la lista (sin utilizar el método clear)*/
	 public void eliminarTodosElementosAMano() {
		 for (Persona pers: personas) {
			System.out.println(personas.remove(pers));
		 }
	 }
}
