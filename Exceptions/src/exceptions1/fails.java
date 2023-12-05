package exceptions1;

import javax.swing.JOptionPane;

public class fails {

	public static void main(String[] args) {

		int[] matriz = new int[5];
		
		matriz[0]=5;
		matriz[1]=38;
		matriz[2]=15;
		matriz[3]=92;
		matriz[4]=71;
		matriz[5]=5;
		
		for(int i=0; i<5; i++) {
			
			System.out.println(matriz[i]);
		}
		
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
		
		System.out.println();
		
		System.out.println("Hola " + nombre + " tienes " + edad + " anos " + "El programa termino su ejecucucion");
		
	}

}
