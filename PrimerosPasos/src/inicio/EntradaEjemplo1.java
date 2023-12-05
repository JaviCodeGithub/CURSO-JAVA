package inicio;

import java.util.*;

public class EntradaEjemplo1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre");
		
		String nombre_usuario=entrada.nextLine();
		
		System.out.println("Introduce tu edad");
		
		int edad=entrada.nextInt();
		
		System.out.println("Hola " + nombre_usuario + ". El año que viene tendrás " + (edad+1) + " años");
		
		System.out.println("Si tienes " + edad + " años, naciste en el año " + (2023-edad) + " o bien cumplirás " +
		(edad+1) + " éste año por lo que naciste en el año " + (2023-(edad+1)));		
		
	}

}
