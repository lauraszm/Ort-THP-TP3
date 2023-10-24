package ejercicio3;
import java.util.Scanner;

public class Test {
	public static final Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inmobiliaria inmobiliaria = new Inmobiliaria();
		Barrio barrio1 = new Barrio("Barrio1");
		Barrio barrio2 = new Barrio("Barrio2");
		Propiedad propiedad1 = new Propiedad("Domicilio1", 1000, TipoPropiedad.PH);
		Propiedad propiedad2 = new Propiedad("Domicilio2", 1000, TipoPropiedad.CASA);
		Propiedad propiedad3 = new Propiedad("Domicilio3", 1000, TipoPropiedad.DEPARATAMENTO);

		System.out.println("agregar propiedad1 a barrio1");
		System.out.println(barrio1.agregarPropiedad(propiedad1));
		System.out.println("agregar propiedad2 a barrio1");
		System.out.println(barrio1.agregarPropiedad(propiedad2));
		System.out.println("agregar propiedad3 a barrio1");
		System.out.println(barrio1.agregarPropiedad(propiedad3));
		
		System.out.println("agregar propiedad1 a barrio2");
		System.out.println(barrio2.agregarPropiedad(propiedad1));
		System.out.println("agregar propiedad2 a barrio2");
		System.out.println(barrio2.agregarPropiedad(propiedad2));
		System.out.println("agregar propiedad3 a barrio2");
		System.out.println(barrio2.agregarPropiedad(propiedad3));
		
		inmobiliaria.agregarBarrio(barrio1);
		inmobiliaria.agregarBarrio(barrio2);
		System.out.println("mostrar propiedades");
		inmobiliaria.mostrarPropiedades(); 
		
		System.out.println("remover prop3 de barrio2");
		System.out.println(barrio2.removerPropiedad(propiedad3));

		System.out.println("mostrar barrio max prop");
		inmobiliaria.mostrarBarrioMaxProp();
		
		System.out.println("cambio domicilio3 de barrio1 a barrio2");
		System.out.println(inmobiliaria.cambiarPropiedadDeBarrio("Domicilio3", barrio2));
		
		System.out.println("mostrar barrio max prop");
		inmobiliaria.mostrarBarrioMaxProp();
		
		System.out.println("Borrar propiedad3");
		System.out.println(inmobiliaria.borrarPropiedad("Domicilio3"));
		
		System.out.println("Buscar propiedad x tipo");
		barrio1.mostrarPropiedades(TipoPropiedad.PH);
		
		input.close();
	}

}
