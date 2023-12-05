package graficos;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.*;

import java.awt.*;

public class CambioEstado {

	public static void main(String[] args) {

		FrameState myFrame = new FrameState();
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class FrameState extends JFrame{
	
	public FrameState() {
		
		Toolkit myScreen = Toolkit.getDefaultToolkit();
		
		Dimension myScreenSize = myScreen.getScreenSize();
		
		int myScreenWidth = myScreenSize.width;
		
		int myScreenHeight = myScreenSize.height;
		
		setBounds(myScreenWidth/3,myScreenHeight/3,500,300);
		
		setVisible(true);
		
		ChangeState newState = new ChangeState();
		
		addWindowStateListener(newState);
		
		//addWindowStateListener(new ChangeState());	ES LO MISMO QUE ARRIBA PERO MAS CORTO
		
	}
	
	class ChangeState implements WindowStateListener{
		
		public void windowStateChanged(WindowEvent e) {
			
			System.out.println("La ventana ha cambiado de estado");
			
			//System.out.println(e.getNewState());	//METODO DE WINDOW EVENT DEVULEVE UN NUMERO QUE SIGNIFICA EL ESTADO DE LA VENTANA
			
			if (e.getNewState()==Frame.MAXIMIZED_BOTH) {	// O ==6 ES LO MISMO (CONSTANT FIELD VALUE)
				
				System.out.println("La ventana esta en pantalla completa");
				
			}
			
			else if (e.getNewState()==Frame.NORMAL) {
				
				System.out.println("La ventana esta en su estado inicial");
				
			}
			
			else if (e.getNewState()==Frame.ICONIFIED) {
				
				System.out.println("La ventana esta minimizada");
				
			}
		}

		
	}
	
}
