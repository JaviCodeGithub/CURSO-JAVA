package inicio;

import java.util.*;

public class buclewhile {

	public static void main(String[] args) {

		int aleatorio=(int)(Math.random()*100);
		
		int numero=0;
		
		int intentos=0;
		
		Scanner entrada=new Scanner(System.in);
		
		while(aleatorio!=numero) {
			
			System.out.println("Introduce un número del 0 al 100");
			
			numero=entrada.nextInt();
			
			intentos++;
			
			if (numero<aleatorio) {
				
				System.out.println("Introduce un número mayor");
				
			}
			
			if (numero>aleatorio) {
				
				System.out.println("Introduce un número menor");
				
			}
			
		}
		
		System.out.println("Enhorabuena, has acertado el número en " + intentos + " intentos.");
		
	}

}
