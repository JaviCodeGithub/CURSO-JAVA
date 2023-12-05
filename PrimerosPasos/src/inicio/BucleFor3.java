package inicio;
import javax.swing.*;

public class BucleFor3 {

	public static void main(String[] args) {
		
	
		int arroba=0;
		
		boolean punto=false;
		
		String mail=JOptionPane.showInputDialog("Introducen una dirección de correo válida");
		
		int ultimaletra=mail.length()-1;
		
		for (int i=0;i<mail.length();i++) {
			
			if(mail.charAt(i)=='@') {				
				arroba++;
				
			}
			
			if(mail.charAt(i)=='.') {			
				punto=true;
				
		}
			if (mail.charAt(0)=='.') {
				punto=false;
			}
			
			if (mail.charAt(0)=='@') {
				arroba--;
			}
			
			if (mail.charAt(ultimaletra)=='.') {
				punto=false;
			}
			
			if (mail.charAt(ultimaletra)=='@') {
				arroba--;
			}
			
		}
		if (arroba==1 && punto==true) {
			
			System.out.println("Dirección válida, revisa tu bandeja de entrada para continuar.");
			
		}
		
		else {
			
			System.out.println("Dirección inválida, Inserte una dirección de correo válida.");
			
		}
		
	}
}


