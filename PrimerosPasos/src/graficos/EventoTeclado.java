package graficos;

import java.awt.Toolkit;

import java.awt.event.*;

import javax.swing.*;

public class EventoTeclado {

	public static void main(String[] args) {

		new CharFrame();
		
	}

}

class CharFrame extends JFrame{
	
	public CharFrame() {
		
		setBounds(Toolkit.getDefaultToolkit().getScreenSize().width/3, Toolkit.getDefaultToolkit().getScreenSize().height/3,600,400);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
		addKeyListener(new Key());
	}
	
}

class Key implements KeyListener{
	
	
	public void keyPressed(KeyEvent e) {

		//int code = e.getKeyCode();
		
		//System.out.println(code);
		
		if(e.getKeyChar()==KeyEvent.CHAR_UNDEFINED) {
			
			System.out.println("La tecla presionada no corresponde a ningun caracter");
		}
		
	}

	
	public void keyReleased(KeyEvent e) {
		
		
	}

	
	public void keyTyped(KeyEvent e) {

		char character = e.getKeyChar();
		
		System.out.println(character);
		
			
		
		
	}
	
}
