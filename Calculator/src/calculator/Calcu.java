package calculator;


import java.awt.*;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calcu {

	public static void main(String[] args) {

		CalFrame calc = new CalFrame();
		
	}

}

class CalFrame extends JFrame{
	
	public CalFrame() {
		
		setVisible(true);
		
		setBounds(Toolkit.getDefaultToolkit().getScreenSize().width/4, Toolkit.getDefaultToolkit().getScreenSize().height/4, 400, 500);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(new CalPanel());
	}
}

class CalPanel extends JPanel{
	
	private JButton boton;
	
	private JButton cero;
	
	private JPanel cuadricula;
	
	private boolean pantalla=true;
	
	private double resultado;
	
	String ultimaOp = "=";
	
	public CalPanel(){
		
		setLayout(new BorderLayout());
		
		cuadricula = new JPanel();
		
		cuadricula.setLayout(new GridLayout(4,4));
		
		add(cuadricula, BorderLayout.CENTER);
		
		cero = new JButton("0");
		
		cero.setEnabled(false);
		
		add(cero, BorderLayout.NORTH);		
		
		String[] botones = {
				
				"1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9", "X", ".", "/", "=", "C"
		};
		
		BotNum botnum = new BotNum();
		
		BotOp botop = new BotOp();
		
		BotonC botonC = new BotonC();
		
		for(int i=0; i<3; i++) {
			
			colocaboton(botones[i], botnum);
		}
		
		colocaboton(botones[3], botop);
		
		for(int i=4; i<7; i++) {
			
			colocaboton(botones[i], botnum);
		}
		
		colocaboton(botones[7], botop);
		
		for(int i=8; i<11; i++) {
			
			colocaboton(botones[i], botnum);
		}
		
		for(int i=11; i<15; i++) {
			
			colocaboton(botones[i], botop);
		}
		
		colocaboton(botones[15], botonC);
	}
	
	private void colocaboton(String b, ActionListener al) {
		
		boton = new JButton(b);
		
		cuadricula.add(boton);
		
		boton.addActionListener(al);
	}
	
	private class BotonC implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			cero.setText("0");
			
			resultado=0;
		}
	}
	
	private class BotNum implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			String num = e.getActionCommand();
			
			if(pantalla) {
				
				cero.setText("");
				
				pantalla=false;
			}
			
			cero.setText(cero.getText() + num);
		}
	}
	
	private class BotOp implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			pantalla=true;
			
			calcula(Double.parseDouble(cero.getText()));
			
			ultimaOp = e.getActionCommand();
			
			cero.setText("" + resultado);
		}
		
		private void calcula(double x) {
			
			if(ultimaOp == "=") {
				
				resultado=x;
			}
			
			if(ultimaOp == "+") {
				
				resultado+=x;
			}
			
			if(ultimaOp == "-") {
				
				resultado-=x;
			}
			
			if(ultimaOp.equalsIgnoreCase("x")) {
				
				resultado*=x;
			}
			
			if(ultimaOp == "/") {
				
				resultado/=x;
			}
			
		}
	}
}
