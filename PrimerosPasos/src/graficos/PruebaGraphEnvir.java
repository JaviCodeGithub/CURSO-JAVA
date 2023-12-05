package graficos;

import java.awt.*;
import javax.swing.*;

public class PruebaGraphEnvir {

	public static void main(String[] args) {
		
		String fuente=JOptionPane.showInputDialog("Introduce fuente");
		
		boolean existefuente=false;
		
		String [] nombresDeFuentes=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		for (String nombreFuente: nombresDeFuentes) {
			
			if (fuente.equalsIgnoreCase(nombreFuente))
			{
				existefuente=true;
			}
			
		}
		
		if (existefuente)
		{
			System.out.println(fuente + " está disponible");
		}
		else
		{
			System.out.println(fuente + " no está disponible");
		}
		
		}
		
		
	}


