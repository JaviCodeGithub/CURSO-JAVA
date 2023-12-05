package graficos;

import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;

public class PruebaEventos {

	public static void main(String[] args) {

		new MarcoBotones();
		
	}

}

class MarcoBotones extends JFrame{
	
	public MarcoBotones() {
		
		setTitle("Botones y Eventos");
		
		Toolkit mipantalla=Toolkit.getDefaultToolkit();
		
		Dimension tamanoPantalla = mipantalla.getScreenSize();
		
		int anchopantalla = tamanoPantalla.width;
		
		int altoPantalla = tamanoPantalla.height;
		
		setBounds(anchopantalla/3+100, altoPantalla/3+50, 500, 300);
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		LaminaBotones milamina = new LaminaBotones();
		
		add(milamina);
		
		
	}
	
}

class LaminaBotones extends JPanel implements ActionListener{
	
	JButton botonRojo = new JButton("Rojo");
	
	JButton botonAmarillo = new JButton("Amarillo");
	
	JButton botonBlanco = new JButton("Blanco");
	
	public LaminaBotones() {
		
		add(botonRojo);
		
		add(botonAmarillo);
		
		add(botonBlanco);
		
		botonRojo.addActionListener(this);	//ACTION SIGNIFICA AL HACER CLIC, WINDOW DE TIPO VENTANA, ETC...
		
		botonAmarillo.addActionListener(this);
		
		botonBlanco.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		Object botonPulsado = e.getSource();
		
		if (botonPulsado==botonRojo) {
			
			setBackground(Color.RED);
			
		}
		
		else if (botonPulsado==botonAmarillo) {
			
			setBackground(new Color(255, 208, 76));
			
		} 
		
		else {
			
			setBackground(Color.white);
			
		}
				
		
	}
	
}