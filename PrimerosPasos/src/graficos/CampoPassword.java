package graficos;

import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;

public class CampoPassword {

	public static void main(String[] args) {

		MarcoPassword miMarco = new MarcoPassword();
	}

}

class MarcoPassword extends JFrame{
	
	public MarcoPassword() {
		
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		
		Dimension tamanoPantalla = miPantalla.getScreenSize();
		
		int anchoPantalla = tamanoPantalla.width;
		
		int altoPantalla = tamanoPantalla.height;
		
		setBounds(anchoPantalla/3, altoPantalla/3, 600, 400);
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new LaminaPassword());
	}
}

class LaminaPassword extends JPanel{
	
	JLabel etiqueta1;
	
	JLabel etiqueta2;
	
	JTextField campoNombre;
	
	JPasswordField campoContrasena;
	
	JButton enviar;
	
	
	
	public LaminaPassword() {
		
		setLayout(new BorderLayout());
		
		JPanel laminaSuperior = new JPanel();
		
		laminaSuperior.setLayout(new GridLayout(2,2));
		
		add(laminaSuperior, BorderLayout.NORTH);
		
		etiqueta1 = new JLabel("Nombre: ");
		
		campoNombre = new JTextField(15);
		
		etiqueta2 = new JLabel("Contrasena: ");
		
		campoContrasena = new JPasswordField(15);
		
		laminaSuperior.add(etiqueta1);
		
		laminaSuperior.add(campoNombre);
		
		laminaSuperior.add(etiqueta2);
		
		laminaSuperior.add(campoContrasena);
		
		enviar = new JButton("Enviar");
		
		add(enviar, BorderLayout.SOUTH);
		
		Document contraDoc = campoContrasena.getDocument();
		
		contraDoc.addDocumentListener(new Comprueba_pass());   
	}
	
	
	private class Comprueba_pass implements DocumentListener{
		
		public void changedUpdate(DocumentEvent e) {
			
			
		}
		
		public void insertUpdate(DocumentEvent e) {
			
			char [] contrasena;
			
			contrasena = campoContrasena.getPassword();
			
			if(contrasena.length<8 || contrasena.length>12) {
				
				campoContrasena.setBackground(Color.RED);
			}else {
				
				campoContrasena.setBackground(Color.green);
			}
		}
		
		public void removeUpdate(DocumentEvent e) {
			
			char [] contrasena;
			
			contrasena = campoContrasena.getPassword();
			
			if(contrasena.length<8 || contrasena.length>12) {
				
				campoContrasena.setBackground(Color.RED);
			}else {
				
				campoContrasena.setBackground(Color.green);
			}
		}
		
	}
}
