package exceptions1;

import javax.swing.*;

public class Aleatorios {

	public static void main(String[] args) {

		int elementos = Integer.parseInt(JOptionPane.showInputDialog("Introduce numeros a la matriz"));
		
		int[] matriz = new int[elementos];
		
		for(int i=0; i<matriz.length; i++) {
			
			matriz[i] = (int)(Math.random()*100);
		}
		
		for(int elem:matriz) {
			
			System.out.println(elem);
		}
		
	}

}
