package inicio;
import javax.swing.*;
public class BucleDoWhile2 {

	public static void main(String[] args) {
		
		String genero="";
				
		do {
			
			genero=JOptionPane.showInputDialog("Introduce tu género (H) o (M)");
			
			
		}while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		
		int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));
		
		int pesoideal=0;
		
		if(genero.equalsIgnoreCase("H")) {
			
			pesoideal=(altura-100);
			
		}
		else if(genero.equalsIgnoreCase("M")) {
			
			pesoideal=(altura-110);
			
		}
		System.out.println("Tu peso ideal es " + pesoideal + " kg");
	}

}
