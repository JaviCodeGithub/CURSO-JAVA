package graficos;

import java.awt.Toolkit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventoFoco {

	public static void main(String[] args) {

		JFrame miMarco= new MarcoFoco();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoFoco extends JFrame{
	
	public MarcoFoco() {
		
		setVisible(true);
		
		setBounds(Toolkit.getDefaultToolkit().getScreenSize().width/3+75, Toolkit.getDefaultToolkit().getScreenSize().height/3+50, 400, 250);
		
		add(new LaminaFoco());
		
	}
	
}

class LaminaFoco extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		setLayout(null);	//ELIMINAMOS LA DISPOSICON DE ELEMENTOS POR DEFECTO
		
		cuadro1=new JTextField();
		
		cuadro2=new JTextField();
		
		cuadro1.setBounds(120,100,150,20);
		
		cuadro2.setBounds(120,300,150,20);
		
		add(cuadro1);
		
		add(cuadro2);
		
		LanzaFocos foco=new LanzaFocos();
		
		cuadro1.addFocusListener(foco);
		
	}
	
	
	
	JTextField cuadro1;
	
	JTextField cuadro2;
	
	private class LanzaFocos implements FocusListener{

		  
		public void focusGained(FocusEvent e) {
			
			
			
		}
		
		public void focusLost(FocusEvent e) {
			
			String email = cuadro1.getText();
			
			boolean comprobacion = false;
			
			for (int i=0;i<email.length();i++) {
				
				if (email.charAt(i)=='@') {
					
					comprobacion = true;
					
				}
				
			}
			
			if(comprobacion) {
				
				System.out.println("Email valido");
				
			}
			
			else  {
				
				System.out.println("El formato del email no es valido");
				
			}
			
			
			
		}
		
		
	}
	
}
	
