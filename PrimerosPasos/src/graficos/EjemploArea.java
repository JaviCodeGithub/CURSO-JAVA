package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class EjemploArea {

	public static void main(String[] args) {
		
		MarcoArea marcoArea = new MarcoArea();

	}

}

class MarcoArea extends JFrame{
	
	public MarcoArea() {
		
		setBounds(450, 200, 600, 450);
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new LaminaArea());
		
	}
}

class LaminaArea extends JPanel{
	
	JButton miboton;
	
	JTextArea miarea;
	
	public LaminaArea() {
		
		miarea = new JTextArea(8,20);
		
		miarea.setLineWrap(true);
		
		miarea.setBackground(Color.LIGHT_GRAY);
		
		JScrollPane laminaScroll = new JScrollPane(miarea);
		
		add(laminaScroll);
		
		miboton = new JButton("Dale");
		
		miboton.addActionListener(new GestionaArea());
		
		add(miboton);
	}
	
	private class GestionaArea implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			System.out.println(miarea.getText());
			
		}

	}
}
