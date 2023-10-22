package ejercicio1;

public class Test {

	public static void main(String[] args) {

		/*
		 * Crear la clase Test con su función main(). En esta función se creará una instancia de
		la clase Agenda y se pide, por lo menos, comprobar el correcto funcionamiento de
		los 4 métodos a desarrollar citados previamente en los siguientes casos: agregar 3
		personas, eliminación no exitosa, eliminación exitosa, modificación de dirección no
		exitosa, modificación de dirección satisfactoria y listado de personas.*/
		
		Agenda agenda = new Agenda();
		
		
		Domicilio domicilio1 = new Domicilio();
		domicilio1.setCalle("calle1");
		domicilio1.setNumero(1);
		domicilio1.setCiudad("ciudad1");
		Persona persona1 = new Persona("nombre1", "apellido1", "dni1", domicilio1);
		
		Domicilio domicilio2 = new Domicilio();
		domicilio2.setCalle("calle2");
		domicilio2.setNumero(2);
		domicilio2.setCiudad("ciudad2");
		Persona persona2 = new Persona("nombre2", "apellido2", "dni2", domicilio2);
		
		Domicilio domicilio3 = new Domicilio();
		domicilio3.setCalle("calle3");
		domicilio3.setNumero(3);
		domicilio3.setCiudad("ciudad3");
		Persona persona3 = new Persona("nombre3", "apellido3", "dni3", domicilio3);
		
		agenda.listarPersonas();
		agenda.agregarPersona(persona1.getNombre(), persona1.getApellido(), persona1.getDni(), domicilio1);
		agenda.agregarPersona(persona2.getNombre(), persona2.getApellido(), persona2.getDni(), domicilio2);
		agenda.agregarPersona(persona3.getNombre(), persona3.getApellido(), persona3.getDni(), domicilio3);
		
		//listado de personas
		System.out.println("listado de personas");
		agenda.listarPersonas();
		
		//agregar un dni ya existente
		System.out.println("intento agregar un dni que ya existe");
		System.out.println(agenda.agregarPersona(persona1.getNombre(), persona1.getApellido(), persona1.getNombre(), domicilio1));
		
		//eliminacion no exitosa
		System.out.println("eliminacion no exitosa");
		System.out.println(agenda.removerPersona("dni4"));
		//eliminacion exitosa
		System.out.println("eliminacion exitosa");
		System.out.println(agenda.removerPersona("dni3"));
		
		//modificación de dirección no exitosa
		Domicilio domicilio4 = new Domicilio();
		domicilio4.setCalle("calle4");
		domicilio4.setNumero(4);
		domicilio4.setCiudad("ciudad4");
		System.out.println("modificación de dirección no exitosa");
		System.out.println(agenda.modificarDomicilio("dni4", domicilio4));
		
		//modificación de dirección satisfactoria
		System.out.println("modificación de dirección satisfactoria");
		System.out.println(agenda.modificarDomicilio("dni2", domicilio4));
		
		//borrar toda la lista
		System.out.println("borrar toda la lista");
		agenda.eliminarTodosElementosAMano();
		
	}

}
