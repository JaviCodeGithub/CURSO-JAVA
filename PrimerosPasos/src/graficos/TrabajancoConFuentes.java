package graficos;

import java.awt.Color; 
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;


import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrabajancoConFuentes {

	public static void main(String[] args) {

		MarcoConFuentes mimarco=new MarcoConFuentes();
		
		 mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		
		 
	}

}

class MarcoConFuentes extends JFrame
{
	public MarcoConFuentes()
	{
		setTitle("Pruebas Con Colores");
		
		setSize(400,400);
		
		setVisible(true);
		
		setLocation(750,300);
		
		LaminaConFuentes milamina2=new LaminaConFuentes();
		
		add(milamina2);
		
		//milamina2.setForeground(Color.BLUE);	//TODOS LOS ELEMENTOS DE LA LÁMINA
		
	}
}

class LaminaConFuentes extends JPanel
{
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		Graphics2D g2=(Graphics2D) g;
		
		Font mifuente=new Font("Arial", Font.BOLD, 20);
		
		g2.setFont(mifuente);
		
		g2.setColor(new Color(93, 139, 230));
		
		g2.drawString("Trabajando con fuentes", 55, 150);
		
		g2.setFont(new Font("Arial", Font.ITALIC, 25));
		
		g2.setColor(new Color(215, 132, 224));
		
		g2.drawString("Curso de Java", 55, 130);
	}
}