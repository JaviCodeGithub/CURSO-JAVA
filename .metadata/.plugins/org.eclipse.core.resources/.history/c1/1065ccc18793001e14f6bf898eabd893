package inicio;
import java.util.*;
import javax.swing.*;
public class AreasPrueba {

	public static void main(String[] args) {

		Scanner entry=new Scanner(System.in);
		
		System.out.println("Chose one of the different options: \n 1: Square \n 2: Rectangle \n 3: Triangle \n 4: Circle");
		
		int figure=entry.nextInt();
		
		switch (figure) {
		
		case 1:
			int side=Integer.parseInt(JOptionPane.showInputDialog("Enter the side measure of your square"));
			
			System.out.println("The area of your square is " + Math.pow(side,2));
			
			break;
		
		case 2:
			int recbase=Integer.parseInt(JOptionPane.showInputDialog("Enter the measure of the side of your rectangle"));
			
			int recheight=Integer.parseInt(JOptionPane.showInputDialog("Enter the measure of the rectangle's height"));
			
			System.out.println("The area of your rectangle is " + recbase*recheight);
			
			break;
			
		case 3:
			
			int tribase=Integer.parseInt(JOptionPane.showInputDialog("Introduce the measure of your triangle's base"));
			
			int triheight=Integer.parseInt(JOptionPane.showInputDialog("Introduce your triangle's height"));
			
			System.out.println("The area of your triangle is " + (tribase*triheight));
			
			System.out.println();
			
		case 4:
			
			int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce the measure of your circle's radio"));
			
			System.out.print("The area of your circle is: " );
			
			System.out.printf("%1.3f", Math.PI*(Math.pow(radio, 2)));
			
		break;
			
		default:
			
			System.out.println("Introduce a number between 1 and 4");
		
		}
		
		
		
	}

}
