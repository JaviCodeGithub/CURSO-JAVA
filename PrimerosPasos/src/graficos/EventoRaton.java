package graficos;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class EventoRaton {

	public static void main(String[] args) {

		new MarcoRaton().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
		
	}

}

class MarcoRaton extends JFrame{
	
	public MarcoRaton() {
		
		setTitle("Eventos de raton");
		
		setBounds(Toolkit.getDefaultToolkit().getScreenSize().width/3, Toolkit.getDefaultToolkit().getScreenSize().height/4,600,400);
		
		setVisible(true);
		
		addMouseListener(new EventosdeRaton());
		
		addMouseMotionListener(new EventosDeRaton2());
		
		
	}
	
}



class EventosdeRaton extends MouseAdapter{

	@Override
	/*public void mouseClicked(MouseEvent e) {

		//System.out.println("Has hecho click en las coordenadas X: " + e.getX() + " Y: " + e.getY() + " de la ventana del programa" );
		
		System.out.println("Has hecho clic " + e.getClickCount() + " veces");
		
		
	}*/

	
	public void mousePressed(MouseEvent e) {

		//System.out.println("Has presionado");
		
		if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK) {		// LO MISMO SERIA ==1024
			
			System.out.println("Has presionado el boton izquierdo");
		}
		
		else if( e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK) {
						
			System.out.println("Has pulsado el boton derecho");
			
		}
		
		
		else if (e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK) {
			
			System.out.println("Has pulsado la rueda del raton");
			
		}
		
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {

		//System.out.println("Has soltado");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {

		//System.out.println("Raton dentro de la ventana del programa");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {

		//System.out.println("Raton fuera de la ventana del programa");
		
	}
	
	
}

class EventosDeRaton2 implements MouseMotionListener{
	
	public void mouseDragged(MouseEvent e) {
		
		System.out.println("Estas arrastrando el raton");
		
	}
	
	public void mouseMoved(MouseEvent e) {
		
		System.out.println("Estas moviendo el raton");
		
	}
	
}
