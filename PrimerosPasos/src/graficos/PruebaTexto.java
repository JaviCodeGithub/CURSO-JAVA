package graficos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class PruebaTexto {

	public static void main(String[] args) {

		MarcoTexto mimarco = new MarcoTexto();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoTexto extends JFrame{
	
	public MarcoTexto() {
		
		setBounds(550, 250, 600, 450);
		
		setVisible(true);
		
		add(new LaminaTexto());
		
	}
}

class LaminaTexto extends JPanel{
	
	private JTextField campo1;
	
	private JTextField campo2;
	
	private JLabel resultado; 
	
	JButton botonCampo1;
	
	public LaminaTexto() {
		
		setLayout(new BorderLayout());
		
		AbstractAction mievento = new DameElTexto("Submit");
		
		JPanel lamina2 = new JPanel();
		
		lamina2.setLayout(new FlowLayout());
		
		add(lamina2, BorderLayout.NORTH);
		
		resultado = new JLabel("", JLabel.CENTER);	
		
		JLabel label1 = new JLabel("Introduce tu email: ");
		
		lamina2.add(label1);
		
		campo1 = new JTextField(20);
		
		campo2 = new JTextField(20);
		
		lamina2.add(campo1);
		
		lamina2.add(campo2);
		
		Focuslist mievento2 = new Focuslist();
		
		campo1.addFocusListener(mievento2);
		
		botonCampo1 = new JButton(mievento);
		
		lamina2.add(botonCampo1);
		
		add(resultado, BorderLayout.CENTER);		//SE PODRIA OBVIAR YA QUE POR DEFECTO SI NO LO INDICAMOS SE SITUA EN EL CENTRO
		
		//System.out.println(campo1.getText().trim());	//CON TRIM ELIMINAMOS LOS ESPACIOS ADICIONALES DEL TEXTO		
		
		//botonCampo1.addActionListener(mievento);
		
		InputMap inputMap = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		
		inputMap.put(KeyStroke.getKeyStroke("ENTER"), "intro");
		
		ActionMap actionMap = getActionMap();
		
		actionMap.put("intro", mievento);
		
		
	}
	
	private class Focuslist implements FocusListener{

		@Override
		public void focusGained(FocusEvent e) {

			campo1.setBackground(Color.WHITE);
		}

		@Override
		public void focusLost(FocusEvent e) {
			
			

			int correcto = 0;
			
			String mail = campo1.getText().trim();
			
			int posicionPunto = mail.indexOf('.');
			
			int posicionArroba = mail.indexOf('@');
			
			for( int i=0; i<mail.length();i++) {
				
				if(mail.charAt(i)=='@') {
					
					correcto++;
				}
				
				if(mail.charAt(i)=='.') {
					
					correcto++;
				}
				
				if(mail.charAt(i)==' ') {
					
					correcto++;
				}
								
			}
			
			if(posicionPunto + 1 < mail.length()) {
				
				correcto++;
			}
			
			if(posicionArroba + 1 < posicionPunto) {
				
				correcto++;
			}
			
			if(correcto==4) {
				
				resultado.setForeground(Color.green);
				
				campo1.setBackground(Color.green);
				
				resultado.setText("mail valido");
				
			}else {
				
				resultado.setForeground(Color.red);
				
				resultado.setText("mail invalido");
				
				campo1.setBackground(Color.red);
				
				Toolkit.getDefaultToolkit().beep();
			}
		}
		
		
	}
	
	
	
	private class DameElTexto extends AbstractAction{
		
		public DameElTexto(String nombre) {
			
			putValue(Action.NAME, nombre);
			
			putValue(Action.SHORT_DESCRIPTION, "Introduce el e-mail");
		}
		
		public void actionPerformed(ActionEvent e) {
			
			//System.out.println(campo1.getText().trim());
			
			int correcto = 0;
			
			String mail = campo1.getText().trim();
			
			int posicionPunto = mail.indexOf('.');
			
			int posicionArroba = mail.indexOf('@');
			
			for( int i=0; i<mail.length();i++) {
				
				if(mail.charAt(i)=='@') {
					
					correcto++;
				}
				
				if(mail.charAt(i)=='.') {
					
					correcto++;
				}
				
				if(mail.charAt(i)==' ') {
					
					correcto++;
				}
								
			}
			
			if(posicionPunto + 1 < mail.length()) {
				
				correcto++;
			}
			
			if(posicionArroba + 1 < posicionPunto) {
				
				correcto++;
			}
			
			if(correcto==4) {
				
				resultado.setForeground(Color.green);
				
				resultado.setText("mail valido");
				
			}else {
				
				resultado.setForeground(Color.red);
				
				resultado.setText("mail invalido");
				
				Toolkit.getDefaultToolkit().beep();
			}
						
						
		}

		
		
	}
	
}
