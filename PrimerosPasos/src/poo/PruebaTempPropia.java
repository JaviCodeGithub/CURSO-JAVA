package poo;

import javax.swing.Timer;
import java.util.*;
import java.awt.Toolkit;
import java.awt.event.*;


public class PruebaTempPropia {

	public static void main(String[] args) {
		
		ActionListener objeto=new Temporizador();
		
		 Timer temp=new Timer(2000, objeto);
		 
		 temp.start();
		 
		 long ya=System.currentTimeMillis();
		 
		 long transcurso=30*1000;
		 
		 while (System.currentTimeMillis() < ya + transcurso) {
		
	}
		 
		 temp.stop();

}
}

class Temporizador implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		
		Date ahora= new Date();
		
		System.out.println("Te digo la fecha y la hora cada 2 segundos: " + ahora);
		
		Toolkit.getDefaultToolkit().beep();
		
	}
	
}



