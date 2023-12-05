package graficos;

import java.awt.Toolkit;
import java.awt.event.*;

import javax.swing.*;

import java.awt.*;

public class EventosVentana {

	public static void main(String[] args) {
		
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		
		Dimension tamanoPantalla = mipantalla.getScreenSize();
		
		int anchopantalla = tamanoPantalla.width;
		
		int altopantalla = tamanoPantalla.height;

		MarcoVentana marco1 = new MarcoVentana();
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco1.setTitle("Venatana 1");
		
		marco1.setBounds(anchopantalla/4, altopantalla/4, anchopantalla/5, altopantalla/5);
		
		MarcoVentana marco2 = new MarcoVentana();
		
		marco2.setBounds(anchopantalla/2, altopantalla/4, anchopantalla/5, altopantalla/5);
		
		marco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		marco2.setTitle("Ventana 2");
		
	}

}

class MarcoVentana extends JFrame{
	
	public MarcoVentana() {
		
		setVisible(true);
		
		//setTitle("Eventos con Ventanas");		
		
		//setBounds(anchopantalla/3, altopantalla/3+50, 700, 400);
		
		/*M_Ventana ventana1 = new M_Ventana();
		
		addWindowListener(ventana1);*/
		
		addWindowListener(new M_Ventana());
		
	}
	
}

class M_Ventana extends WindowAdapter implements WindowListener {	//CON WINDOWADAPTER PODEMOS ESCRIBIR SOLO LOS METODOS QUE QUEREMOS
																	//SIN NECESIDAD DE TENER QUE ESCRIBIR TODOS LOS DEMAS
	public void windowActivated(WindowEvent e) {					
		
		System.out.println("Ventana Activada");
		
	}
	
	/*public void windowClosed(WindowEvent e) {
		
		System.out.println("La ventana 2 ha sido cerrada");
		
	}
	
	public void windowClosing(WindowEvent e) {
		
		System.out.println("Cerrando Ventana");
		
	}
	
	public void windowDeactivated(WindowEvent e) {
		
		System.out.println("Ventana Desactivada");
		
	}
	
	public void windowDeiconified(WindowEvent e) {
		
		System.out.println("Ventana Restaurada");
		
	}
	
	public void windowIconified(WindowEvent e) {
		
		System.out.println("Ventana minimizada");
		
	}
	
	public void windowOpened(WindowEvent e) {
		
		System.out.println("Ventana abierta");*/
		
	}
	

