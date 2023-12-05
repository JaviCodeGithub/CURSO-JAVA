package graficos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Calculadora {

	public static void main(String[] args) {

		MarcoCalculadora mimarco = new MarcoCalculadora();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoCalculadora extends JFrame{
	
	public MarcoCalculadora() {
		
		setTitle("Calculadora");
		
		setBounds(500,300,450,300);
		
		setVisible(true);
		
		LaminaCalculadora milamina = new LaminaCalculadora();
		
		add(milamina);
		
		//pack();		ESTABLECE UN TAMANO DE MARCO ACORDE CON EL TAMANO DE LOS ELEMENTOS, BOTONES...
		
	}
	
}

class LaminaCalculadora extends JPanel{
	
	private JButton pantalla;
	
	private JPanel milamina2 = new JPanel();
	
	private boolean principio=true;
	
	private double resultado;
	
	private String ultimaOperacion="=";
	
	public LaminaCalculadora() {		
		
		setLayout(new BorderLayout());
		
		 pantalla = new JButton("0");
		 
		 pantalla.setEnabled(false);
		 
		 add(pantalla, BorderLayout.NORTH);		
		 
		 milamina2.setLayout(new GridLayout(4,4));
		 
		 add(milamina2, BorderLayout.CENTER);
		 
		 ActionListener insertar = new InsertaNumero();
		 
		 ActionListener insertarOp = new AccionOrden();
		 
		final String[] rotulos={
			"1","2","3","4","5","6","7","8","9","0","."};
		
		final String[] rotulosOp= {
				"/","+","-","x","="
		};
		
		
		
		for(String r: rotulos) {
			
			ponerBoton(r, insertar);
			
		}
		
		for (String r: rotulosOp) {
			
			ponerBotonOp(r, insertarOp);
			
		}
		
		
			
	}
	
	 
	
	private void ponerBoton(String rotulo, ActionListener oyente) {
		
		JButton boton = new JButton(rotulo);
		
		milamina2.add(boton);
		
		boton.addActionListener(oyente);
		
	}
	
	private void ponerBotonOp(String rotuloOp, ActionListener oyenteOp) {
		
		JButton botonOp = new JButton(rotuloOp);
		
		milamina2.add(botonOp);
		
		botonOp.addActionListener(oyenteOp);
		
	}
	
	
	
	private class InsertaNumero implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			String entrada = e.getActionCommand();
						
			if (principio) {
				
				pantalla.setText("");
				
				principio=false;
				
			}
			
			pantalla.setText(pantalla.getText()+entrada);
			
			
			
		}
		
	}
	
	private class AccionOrden implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			String operacion = e.getActionCommand(); 
			
			
						
			calcular(Double.parseDouble(pantalla.getText()));
			
			principio = true;
			
			ultimaOperacion = operacion;
			
			
			
		}
		
		public void calcular(double x) {
			
			if (ultimaOperacion.equals("+")) {
								
				resultado += x;
				
				
			}
			
			else if(ultimaOperacion.equals("-")) {
				
				resultado-=x;
				
			}
			
			else if(ultimaOperacion.equals("x")) {
				
				resultado*=x;
				
			}
			
			else if(ultimaOperacion.equals("/")) {
				
				resultado/=x;
				
			}
			
			else if(ultimaOperacion.equals("=")) {
				
				resultado=x;
				
			}
			
			pantalla.setText("" + resultado);
			
		}
			
		}
		
	}
	

