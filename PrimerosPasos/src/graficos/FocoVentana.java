package graficos;

import javax.swing.*;

import java.awt.event.*;

public class FocoVentana extends JFrame implements WindowFocusListener{
	
	public static void main(String[] args) {

		FocoVentana programa = new FocoVentana();
		
		programa.iniciar();
		
	}
	
	public void windowGainedFocus(WindowEvent e) {
		
		if(e.getSource()==marco1) {
			
			marco1.setTitle("Tengo el foco");
			
		}else {
			
			marco2.setTitle("Tengo el foco");
			
		}
		
	}
	
	public void windowLostFocus(WindowEvent e) {
		
		if(e.getSource()==marco1) {
			
			marco1.setTitle("");
			
		}else {
			
			marco2.setTitle("");
			
		}
		
	}
	

	public void iniciar() {
		
		marco1 = new FocoVentana();
		
		marco2 = new FocoVentana();
		
		marco1.setVisible(true);
		
		marco2.setVisible(true);
		
		marco1.setBounds(200, 100, 600, 350);
		
		marco2.setBounds(800, 100, 600, 350);
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco1.addWindowFocusListener(this);
		
		marco2.addWindowFocusListener(this);
		
	}
	
	FocoVentana marco1;
	
	FocoVentana marco2;
	
}
