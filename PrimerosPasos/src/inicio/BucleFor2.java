package inicio;

import javax.swing.JOptionPane;

public class BucleFor2 {

	public static void main(String[] args) {
		
		boolean arroba=false;
		
		String mail=JOptionPane.showInputDialog("Introduce tu e-mail");
		
		for(int i=0; i<mail.length(); i++) {
			
			if(mail.charAt(i)=='@') {
				
				arroba=true;
				
			}
			
		}
		
		if(arroba==true) {
			
			System.out.println("Dirección válida");
			
		}
		else {
			System.out.println("Dirección inválida");
		}
		
	}

}
