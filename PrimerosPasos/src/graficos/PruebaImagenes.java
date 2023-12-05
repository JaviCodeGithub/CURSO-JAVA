package graficos;

import javax.swing.*;
import javax.imageio.*;
import java.awt.*;
import java.io.*;

public class PruebaImagenes {

	public static void main(String[] args) {

		MarcoImagen marcoimagen = new MarcoImagen();
		
		
	}

}

class MarcoImagen extends JFrame	{
	
	int anchopantalla;
	
	int largopantalla;

	public MarcoImagen()	{
		
		setTitle("Marco con Imágenes");
		
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		
		Dimension tamanopantalla = mipantalla.getScreenSize();
		
		anchopantalla=tamanopantalla.width;
		
		int largopantalla=tamanopantalla.height;
		
		setBounds(anchopantalla/3, largopantalla/3, anchopantalla/2-200, largopantalla/2-100);
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		LaminaImagen lamina = new LaminaImagen();
		
		add(lamina);
		
		
		
	}
		
		
		class LaminaImagen extends JPanel	{
			
			private Image imagen;
			
						
			public void paintComponent(Graphics g)	{
				
				super.paintComponent(g);
				
				//File miimagen=new File("src/graficos/KRATOS.png");
				
				try
				{
					imagen=ImageIO.read(new File("src/graficos/España.jpg"));
									
				}
				catch(IOException e)
				{
					System.out.println("No se ha encontrado la imagen");
					
					//JLabel excep = new JLabel("La imagen no se ha encontrado");
					
					//add(excep, BorderLayout.CENTER);
				}
				
					
				if(imagen==null) {
					
					g.setFont(new Font("Little", Font.BOLD, 30));
					
					g.drawString("No se encuentra la imagen", 100, 150);
					
				}
				else {
				
				int anchuraImagen=imagen.getWidth(this);	//THIS SE REFIERE AL OBJETO EN EL QUE NOS ENCONTRAMOS(LAMINAIMAGEN)
				
				int alturaImagen=imagen.getHeight(this);
				
				g.drawImage(imagen, 0, 0, null);
				
				for(int i=0; i<300; i++) {
					
					for(int j=0; j<200; j++) {
						
						if (i+j>0) {
						
						g.copyArea(0, 0, anchuraImagen, alturaImagen, anchuraImagen*i, alturaImagen*j);
										
						}
						
					}
					
				}
				
				
				
				System.out.println(anchuraImagen + " X " + alturaImagen);
				
				//FUNCIONARÍA IGUALMENTE LO SIGUIENTE PERO SIN MENSAJE EN CONSOLA DE LA EXCEPCIÓN:
				
				//imagen = Toolkit.getDefaultToolkit().getImage("src/graficos/España.jpg");
				
				
			
			}
				
				compruebaTamano();
			
			}
			
	public void compruebaTamano() {
				
				if(imagen !=null) {
					
					System.out.println("La imagen tiene una anchura de:" + imagen.getWidth(this) + " y una altura de: " + imagen.getHeight(this));
				}
			}
			
		}
		
	
	
}

