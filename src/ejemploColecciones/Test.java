package ejemploColecciones;
import java.util.ArrayList;
public class Test {

	public static void main(String[] args) {
		
		int n1 = 8;
		//test wrappers
		//creo una lista de numeros enteros - no puedo decirle que el tipo de dato es un primitivo, tengo que usar la clase == el wrapper;
		ArrayList<Integer> numeros = new ArrayList<>(5);
		
		numeros.add(6);
		numeros.add(0,n1);
		System.out.println(numeros);
		//para mostrar los elementos
		for(int i = 0; i<numeros.size(); i++) {
			System.out.println(i + ": " + numeros.get(i));
		}
		
		// FOREACH
		for (Integer n: numeros) {
			System.out.println(n);
		}
		
		System.out.println(numeros);
		
		Billetera billetera = new Billetera();

	}

}
