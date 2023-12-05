package graficos;

import javax.swing.*;
import java.awt.event.*;

public class VariosOyentes {

	public static void main(String[] args) {

		MarcoPrincipal miMarco = new MarcoPrincipal();
		
	}

}

class MarcoPrincipal extends JFrame{
	
	public MarcoPrincipal() {
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(475, 300, 600, 350);
		
		add(new LaminaPrincipal());
		
	}
	
}

class LaminaPrincipal extends JPanel{
	
	public LaminaPrincipal() {
		
		JButton botonNuevo = new JButton("Nuevo");
		
		add(botonNuevo);
		
		botonCerrar = new JButton("Cerrar todo");
		
		add(botonCerrar);
		
		OyenteNuevo miOyente = new OyenteNuevo();
		
		botonNuevo.addActionListener(miOyente);
		
	}
	
	JButton botonCerrar;
	
	private class OyenteNuevo implements ActionListener{		//PODRIA PERFECTAMENTE SER EXTEND ABSTRACTACTION YA QUE IMPLEMENTA ACTIONPERFORMED
		
		public void actionPerformed(ActionEvent e) {
			
			MarcoEmergente marco = new MarcoEmergente(botonCerrar);
			
		}
		
	}
	
	
	
}

class MarcoEmergente extends JFrame{
	
	private static int contador = 0;
	
	public MarcoEmergente(JButton botonDePrincipal) {
		
		contador++;
		
		setTitle("Ventana " + contador);
		
		setBounds(40*contador, 40*contador, 300, 150);
		
		setVisible(true);
		
		CierraTodos oyenteCerrar = new CierraTodos();
		
		botonDePrincipal.addActionListener(oyenteCerrar);
		
	}
	
	class CierraTodos implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			dispose();
			
			contador = 0;
			
		}
		
		
		
	}
	
}
