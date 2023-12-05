package exceptions1;
import java.security.KeyStore.Entry;
import java.util.*;

import javax.swing.*;

public class AreaPesosPrueba {

	static boolean next=false;
	
	static int figure;
	
	public static void main(String[] args) {
		
		do {
			
		try {
			
			calculate();
			
		}catch (InputMismatchException e) {
			
			System.out.println("You have to introduce a number between 1 and 4.");
			
		}
		
	}while(next==false);
		
		
	}
		
		static void calculate() {
			
		Scanner entry = new Scanner(System.in);
			
		System.out.println("Choose a number according to the object's area you want to calculate: \n1: Square \n2: Triangle \n3: Rectangle \n4: Circle");
		
		figure = entry.nextInt();
					
		switch(figure) {
		
		case 1:
			
			int Sside = Integer.parseInt(JOptionPane.showInputDialog("Introduce de measure of the side of the square"));
			
			JOptionPane.showMessageDialog(null, "The area of your square is: \n" + Sside*Sside);
			
			entry.close();
						
			next=true;
			
			break;
			
		case 2:
			
			int Tside = Integer.parseInt(JOptionPane.showInputDialog("Introduce the measure of the side of your triangle"));
			
			JOptionPane.showMessageDialog(null, "The area of your triangle is: \n" + (Tside*Tside/2));
			
			entry.close();
			
			next=true;
			
			break;
			
		case 3:
			
			int Rbase = Integer.parseInt(JOptionPane.showInputDialog("Introduce the measure of the base of your rectangle"));
			
			int Rheight = Integer.parseInt(JOptionPane.showInputDialog(" Introduce the measure of the heigth of your rectangle"));
			
			JOptionPane.showMessageDialog(null, "The area of your rectangle is: \n" + Rbase*Rheight);
			
			entry.close();
			
			next=true;
			
			break;
			
		case 4:
			
			int Cradio = Integer.parseInt(JOptionPane.showInputDialog("Introduce the measure of the radio of your circle"));
			
			JOptionPane.showMessageDialog(null, "The area of your circle is: \n" + (Cradio*Cradio)*Math.PI);
			
			entry.close();
			
			next=true;
			
			break;
			
		default:
			
			System.out.println("The case selected is not in the previous options");
			
		}
		
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		if(next==true) {
			
			int height = Integer.parseInt(JOptionPane.showInputDialog("Introduce your height"));
			
			System.out.println("With " + height + " cm, If you are a Man, your weight should be around " + (height-105) + "kg");
			
			System.out.println( "But if you are a Woman, " + "with " + height + " cm, your weight should be around " + (height-115) + "kg");
		}
		
		}
		
}
		
