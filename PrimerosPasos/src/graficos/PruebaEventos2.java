package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PruebaEventos2 {

	public static void main(String[] args) {

		MarcoBotones2 mimarco2 = new MarcoBotones2();
		
	}

}

class MarcoBotones2 extends JFrame{
	
	public MarcoBotones2() {
		
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

class LaminaBotones2 extends JPanel{
	
	JButton botonRojo = new JButton("Rojo");
	
	JButton botonAmarillo = new JButton("Amarillo");
	
	JButton botonBlanco = new JButton("Blanco");
	
	public LaminaBotones2() {
		
		add(botonRojo);
		
		add(botonAmarillo);
		
		add(botonBlanco);
		
		ColorFondo Amarillo =new ColorFondo(Color.YELLOW);
		
		ColorFondo Rojo = new ColorFondo(Color.RED);
		
		ColorFondo Blanco = new ColorFondo(Color.WHITE);		
		
		botonRojo.addActionListener(Rojo);	//ACTION SIGNIFICA AL HACER CLIC, WINDOW DE TIPO VENTANA, ETC...
		
		botonAmarillo.addActionListener(Amarillo);
		
		botonBlanco.addActionListener(Blanco);
		
	}
	
	private class ColorFondo implements ActionListener{
		
		private Color colorDeFondo;
		
		public ColorFondo(Color c) {
			
			colorDeFondo=c;
			
		}
		
		public void actionPerformed(ActionEvent e) {

			setBackground(colorDeFondo);
			
		}
		
		

		
		
	}
	
}


