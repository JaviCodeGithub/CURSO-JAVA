package inicio;
import javax.swing.*;
public class Acceso_Aplicacion {

	public static void main(String[] args) {

		String clave="Javi";
		
		String pass="";
		
		while (clave.equals(pass)==false) {
			
			pass=JOptionPane.showInputDialog("Introduce tu contraseña");
			
			if (clave.equals(pass)==false) {
				
				System.out.println("La contraseña no es correcta");
			}
			
			else System.out.println("Contraseña correcta. Acceso permitido");
		}
		
		
		
	}

}
