package graficos;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

public class TrabajandoColores {

	public static void main(String[] args) {
		
		new MarcoConColor().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoConColor extends JFrame
{
	public MarcoConColor()
	{
		setTitle("Pruebas Con Colores");
		
		setSize(400,400);
		
		setVisible(true);
		
		setLocation(750,300);
		
		LaminaConColor milamina=new LaminaConColor();
		
		add(milamina);
		
		milamina.setBackground(SystemColor.window);	//COLOR POR DEFECTO DEL SISTEME OPERATIVO
		
		
	}
}

class LaminaConColor extends JPanel
{
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		Graphics2D g2=(Graphics2D) g;
		
		Rectangle2D rectangulo=new Rectangle2D.Double(100,100,200,150);
		
		
		
		g2.setPaint(new Color(0,100,250));
		
		//g2.draw(rectangulo);	//SOLO EL CONTORNO
		
		g2.fill(rectangulo);
		
		Ellipse2D elipse=new Ellipse2D.Double();
		
		elipse.setFrame(rectangulo);
		
		Color micolor=new Color(20,189,200);
		
		//g2.setPaint(new Color(100,150,50).brighter());
		
		g2.setPaint(micolor);
		
		//g2.draw(elipse);
		
		g2.fill(elipse);
		
		g2.draw(rectangulo);
		
		micolor=Color.pink;
		
		g2.setPaint(micolor);
		
		g2.draw(elipse);
		
		
		
		
	}
}
