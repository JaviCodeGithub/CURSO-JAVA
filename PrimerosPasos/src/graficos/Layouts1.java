package graficos;

import javax.swing.*;

import java.awt.*;

public class Layouts1 {

	public static void main(String[] args) {

		MarcoLayout marco = new MarcoLayout();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco.setVisible(true);
		
	}

}

class MarcoLayout extends JFrame{
	
	public MarcoLayout() {
		
		setTitle("Prueba Acciones");
		
		setBounds(450,250,700,450);
		
		PanelLayout lamina = new PanelLayout();
		
		//FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
		
		//lamina.setLayout(layout);
		
		PanelLayout2 lamina2 = new PanelLayout2();
		
		add(lamina, BorderLayout.NORTH);
		
		add(lamina2, BorderLayout.SOUTH);
		
	}
		
}

class PanelLayout extends JPanel{
	
	public PanelLayout() {
		
		//setLayout(new FlowLayout(FlowLayout.CENTER, 100, 30));
		
		setLayout(new FlowLayout(FlowLayout.LEFT));		//SOLO SE PUEDE USAR UN LAYOUT POR PANEL
		
		add(new JButton("Amarillo"));
		
		add(new JButton("Rojo"));
		
		
		
	}
	
}

class PanelLayout2 extends JPanel{
	
	public PanelLayout2() {
		
		setLayout(new BorderLayout());
		
		add(new JButton("Azul"), BorderLayout.WEST);
		
		add(new JButton("Verde"), BorderLayout.EAST);
		
		add(new JButton("Naranja"), BorderLayout.CENTER);
		
	}
	
}
