package exceptions1;

import javax.swing.JOptionPane;

public class VariasExcepciones {

	public static void main(String[] args) {

		try {
			
			division();	
		
		}catch(ArithmeticException e) {
			
			System.out.println("No se puede dividir por 0");
			 
		}catch(NumberFormatException e){
			
			System.out.println("No has introducido un numero entero");
			
			System.out.println(e.getMessage());		//NOS ENSENA LO QUE HEMOS TECLEADO QUE HAYA PROVOACADO LA EXCEPCION
			
			System.out.println("Se ha generado un error del tipo: " + e.getClass().getName());
		}
		
	}
	
	
	static void division() {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dividendo"));
		
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el divisor"));
		
		int resultado = num1/num2;
		
		JOptionPane.showMessageDialog(null, "El resultado de tu division es: " + resultado); 
	}

}
