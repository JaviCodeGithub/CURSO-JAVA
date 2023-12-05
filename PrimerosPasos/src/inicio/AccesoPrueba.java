package inicio;
import javax.swing.*;
public class AccesoPrueba {

	public static void main(String[] args) {

		String pass="melasuda";
		
		String clave="";
		
		while(clave.equals(pass)==false) {
			
			clave=JOptionPane.showInputDialog("Introduce la contrasena");
			
			
		}
		
		if (clave.equals(pass)==false) {
			
			System.out.println("La contrasena no es correcta");
			
		}
		
		else {

			System.out.println("La contrasena es correcta, acceso permitido");
			
		}
		
		
		
	}

}
