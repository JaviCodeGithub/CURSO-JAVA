package graficos;

import javax.swing.*;

import java.awt.event.*;

import java.awt.*;

public class PruebaAcciones {

	public static void main(String[] args) {
		
		PruebaAccion accion1 = new PruebaAccion();

	}

}

class PruebaAccion extends JFrame{
	
	public PruebaAccion() {
		
		setVisible(true);
		
		setBounds(525, 200, 500, 350);
		
		setTitle("Prueba Acciones");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PanelAccion lamina = new PanelAccion();
		
		add(lamina);
		
	}
	
}

class PanelAccion extends JPanel{
	
	
	public PanelAccion() {
		
		/*JButton botonAmarillo = new JButton();
		
		JButton botonAzul = new JButton();
		
		JButton botonRojo = new JButton();
		
		add(botonAmarillo);		
		add(botonAzul);		
		add(botonRojo);*/
		
		AccionColor accionAmarillo = new AccionColor("Amarillo", new ImageIcon("src/graficos/amarillo.png"), Color.yellow);	
		
		AccionColor accionAzul = new AccionColor("Azul", new ImageIcon("src/graficos/azul.png"), new Color(31, 173, 215));	
		
		AccionColor accionRojo = new AccionColor("Rojo", new ImageIcon("src/graficos/rojo.png"), Color.RED);
		
		/*JButton amarillo = new JButton(accionAmarillo);
		
		JButton azul = new JButton(accionAzul);
		
		JButton rojo = new JButton(accionRojo);
		
		add(amarillo);
		
		add(azul);
		
		add(rojo);*/
		
		add(new JButton(accionAmarillo));
		
		add(new JButton(accionAzul));
		
		add(new JButton(accionRojo));
		
		//COMBINACION DE TECLAS PARA FONDO AMARILLO
		
		InputMap mapaEntrada=getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		
		//KeyStroke teclaAmarillo=KeyStroke.getKeyStroke("ctrl A");
		
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"),"fondo_amarillo");	//SIMPLIFICANDO
		
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondo_azul");
		
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "fondo_rojo");
		
		ActionMap mapaAccion = getActionMap();
		
		mapaAccion.put("fondo_amarillo", accionAmarillo);
		
		mapaAccion.put("fondo_azul", accionAzul);
		
		mapaAccion.put("fondo_rojo", accionRojo);
		
		//COMBINACION DE TECLS PARA FONDO ROJO
		
		
		
		
		
	}
	
	private class AccionColor extends AbstractAction{
		
		public AccionColor(String nombre, Icon icono, Color color) {
		
		putValue(Action.NAME, nombre);
		
		putValue(Action.SMALL_ICON, icono);
		
		putValue(Action.SHORT_DESCRIPTION, "Fondo de pantalla de color " + nombre);
		
		putValue("color de fondo", color);
		
	}
		
		public void actionPerformed(ActionEvent e) {
		
		Color colorfondo = (Color)getValue("color de fondo");
		
		setBackground(colorfondo);
		
		System.out.println("Nombre del boton: " + getValue(Action.NAME) + "\nDescripcion del boton: " + getValue(Action.SHORT_DESCRIPTION));
		
	}
	
}
	
}
