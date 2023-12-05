package inicio;
import java.util.*;
public class Bucle_While {

	public static void main(String[] args) {
		
		int aleatorio=(int)(Math.random()*100);
		
		//System.out.println(Math.random()*100);
		
		Scanner entrada=new Scanner(System.in);
		
		int numero=0;
		
		int intentos=0;
		
		while(numero!=aleatorio) {
			intentos++;
			System.out.println("Introduce un número del 0 al 100");
			
			numero=entrada.nextInt();
			
			if(aleatorio<numero) {
				
				System.out.println("Prueba con otro número más bajo");
			
			}
			
			else if(aleatorio>numero) {
				
				System.out.println("Prueba con otro número más alto");
			}
		}
		
		System.out.println("¡Exacto, enhorabuena, lo has adivinado en " + intentos +" intentos!");
	}

}
