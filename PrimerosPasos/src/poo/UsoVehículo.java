package poo;

import javax.swing.*;

public class UsoVehículo {

	public static void main(String[] args) {
		
		/*Coche2 Rivian=new Coche2();
		
		Rivian.establece_color(JOptionPane.showInputDialog("Introduce el color del modelo"));
		
		System.out.println(Rivian.dime_datos_generales());
		
		System.out.println(Rivian.dime_color());
		
		Rivian.configura_asientos(JOptionPane.showInputDialog("Asientos de cuero: si/no"));
		
		System.out.println(Rivian.dime_asientos());
		
		Rivian.configura_climatizador(JOptionPane.showInputDialog("Climatizador: si/no"));
		
		System.out.println(Rivian.dime_climatizador());
		
		System.out.println(Rivian.dime_peso_coche());
		
		System.out.println("El precio final del modelo es " + Rivian.precio_coche() + " euros");*/
		
		Coche2 Rivian=new Coche2();
		
		Rivian.establece_color("CyberBlue");
		
		Furgoneta Ford=new Furgoneta(7, 580);
		
		Ford.establece_color("Azul");
		
		Ford.configura_asientos("si");
		
		Ford.configura_climatizador("si");
		
		System.out.println(Rivian.dime_datos_generales() + " " + Rivian.dime_color());
		
		System.out.println(Ford.dime_datos_generales() + " " + Ford.dime_color()+
				". " + Ford.dimeDatosFurgoneta());
	}

}
