package poo;

import java.awt.Toolkit; 
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import javax.swing.Timer;

public class PruebaTemporizador {

	public static void main(String[] args) {
		
		DameLaHora oyente = new DameLaHora(3000, true);
		
		Timer mitemp = new Timer(oyente.dimeIntervalo(), oyente);
		
		mitemp.start();
		
		//BUCLE INFINITO
		
		/*while (true) {
			
		}
		
		//BUCLE DURANTE 30 SEGUNDOS
		
		long horaActual=System.currentTimeMillis();
		
		long tiempoAccion=30*1000; //30 SEGUNDOS EN MILISEGUNDOS
		
		while (System.currentTimeMillis() - horaActual < tiempoAccion) {
			
		}
		
		mitemp.stop();*/
		
		//BUCLE HASTA QUE SE CIERRE LA VENTANA JOPTIONPANE
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");
		
		mitemp.stop();
		
	}

}

class DameLaHora implements ActionListener{
	
	private boolean sonido;
	
	private int intervalo;
	
	public DameLaHora(int intervalo, boolean sonido) {
		
		this.intervalo=intervalo;
		
		this.sonido=sonido;
		
	}
	
	public int dimeIntervalo() {
		
		return intervalo;
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		Date ahora=new Date();
		
		System.out.println("Te doy la hora cada " + intervalo/1000 + " segundos: " + ahora);
		
		if (sonido) {
			
			Toolkit.getDefaultToolkit().beep();
			
		}
	}
	
}
