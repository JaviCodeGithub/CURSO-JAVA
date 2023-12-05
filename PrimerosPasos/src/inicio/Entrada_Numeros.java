package inicio;
import javax.swing.*;
public class Entrada_Numeros {

	public static void main(String[] args) {
		
		//double x=10000.0;
		
		//System.out.printf("%1.2f", x/3);
		
		String num1=JOptionPane.showInputDialog("Introduce un número");
		
		double num2=Double.parseDouble(num1);
		
		System.out.print("La raíz cuadrada de " + (int)num2 + " és ");
		
		System.out.printf("%1.2f", Math.sqrt(num2));
		
		
	}

}
