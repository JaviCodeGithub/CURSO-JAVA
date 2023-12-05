package graficos;

import javax.swing.*;
import java.awt.*;

public class MarcoCentrado {

	public static void main(String[] args) {
		
				MiMarcoCentrado miMarco2=new MiMarcoCentrado();
				
				miMarco2.setVisible(true);
				
				miMarco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MiMarcoCentrado extends JFrame{
	
	public MiMarcoCentrado() {
		
		 Toolkit mipantalla=Toolkit.getDefaultToolkit();//DEVUELVE EL SISTEMA NATIVO DE VENTANAS EN UN OBJETO TIPO TOOLKIT
		 
		 Dimension tamanoPantalla=mipantalla.getScreenSize();	//GETSCRENSIZE DEVUELVE OBJETO TIPO DIMENSION
		 
		 int alturaPantalla=tamanoPantalla.height;
		 
		 int anchoPantalla=tamanoPantalla.width;
		 
		 setSize(anchoPantalla/5, alturaPantalla/5);
		 
		 setLocation(anchoPantalla/2-200, alturaPantalla/2-100);
		 
		 Image miIcono=mipantalla.getImage("src/graficos/iconoMac.png");
		 
		 setIconImage(miIcono);
		
	}
	
}
