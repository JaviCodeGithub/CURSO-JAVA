package inicio;
import java.util.*;
import javax.swing.*;

public class Areas {

	public static void main(String[] args) {

		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Elige una opción: \n 1: Cuadrado \n 2: Rectágulo \n 3: Triángulo \n 4: Círculo");
		
		
		int figura=entrada.nextInt();
		
		switch (figura) {
		case 1:
			int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce medida del lado"));			
			System.out.println("El area del cuadrado es " + (int)Math.pow(lado, 2));
			
			break;
			
		case 2:
			int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la medida de la base"));
			int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la medida de la altura"));
			System.out.println("El area del rectángulo es " + base*altura);
			
			break;
			
		case 3:
			int base2=Integer.parseInt(JOptionPane.showInputDialog("Introduce la medida de la base"));
			int altura2=Integer.parseInt(JOptionPane.showInputDialog("Introduce la medida de la altura"));
			System.out.println("El area del triángulo es " + (base2*altura2)/2);
			
			break;
			
		case 4:
			int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce la medida del radio del círculo"));
			System.out.print("El area del círculo es ");
			System.out.printf("%1.3f", Math.PI*(Math.pow(radio, 2)));
			
			break;
			
		default:
			System.out.println("Introduce un número del 1 al 4");
			
		}
		
		}
		

}
