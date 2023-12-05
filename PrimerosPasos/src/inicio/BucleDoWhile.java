package inicio;
import java.util.*;
public class BucleDoWhile {

	public static void main(String[] args) {
		
		int aleatorio=(int)(Math.random()*100);
		
		Scanner entrada=new Scanner(System.in);
		
		int numero=0;
		
		int intentos=0;
		
		do {
			intentos++;
			System.out.println("Introduce un número de 0 a 100");
			
			numero=entrada.nextInt();
			
			if(numero>aleatorio){
				
				System.out.println("Más bajo");
				
			}
			
			else if(numero<aleatorio) {
				
				System.out.println("Más alto");
			}
			
		}while(numero!=aleatorio);
	
		System.out.println("Correcto, ¡Enhorabuena! Lo has conseguido en " + intentos + " intentos");
		
	}

}
