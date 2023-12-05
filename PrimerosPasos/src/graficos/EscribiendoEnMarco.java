package graficos;

import java.awt.*;
import javax.swing.*;

public class EscribiendoEnMarco {

	public static void main(String[] args) {
		
		MarcoConTexto miMarco=new MarcoConTexto();
		
	}

}

class MarcoConTexto extends JFrame{
	
	public MarcoConTexto() {
		
		setVisible(true);
		
		setSize(600, 450);
		
		setLocation(600, 400);
		
		setTitle("MacOs Version");
		
		Lamina lamina1=new Lamina();
		
		add(lamina1);
		
	}
	
}

class Lamina extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.drawString("Estamos aprendiendo Swing", 100, 100);
		
	}
	
}