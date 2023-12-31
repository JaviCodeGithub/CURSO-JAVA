package exceptions1;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.*;


import javax.imageio.*;
import javax.swing.*;

public class LeerImagen {
	
 public static void main(String[] args) {
  
  MarcoImagen mimarco = new MarcoImagen();
  
  mimarco.setVisible(true);
  
  mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
}


class MarcoImagen extends JFrame { 
	
 public MarcoImagen() {
	 
  setTitle("Marco con imagen");
  
  setBounds(550, 300, 600, 400);
  
  LaminaConImagen milamina = new LaminaConImagen();
  
  add(milamina);
 }
}


class LaminaConImagen extends JPanel {
	
 private Image imagen;
 
 public LaminaConImagen() {
	 
	 //IO EXCEPTION
	

 }
 
 public void paintComponent(Graphics g) throws NullPointerException {
	 
	 //NULLPOINTEREXCEPTION
	 
 try {
		 
		 imagen = ImageIO.read(new File("src/exceptions1/España.jpg"));
		 
	 }catch(IOException e) {
		 
		 System.out.println("La imagen no se encuentra");
	 }
	  
  super.paintComponent(g);
  
  try {

  int anchuraImagen = imagen.getWidth(this);
  
  int alturaImagen = imagen.getHeight(this);
   
  g.drawImage(imagen, 0, 0, null);
   
  for(int i = 0; i < 300; i++) {
	  
   for(int j = 0; j < 200; j++) {
	   
    if(i + j > 0) {
    	
     g.copyArea(0, 0, anchuraImagen, alturaImagen, anchuraImagen * i, alturaImagen * j);
     
    }
    
   }
   
  }
  
  }catch(NullPointerException e){
	  
	  g.setFont(new Font("Little", Font.BOLD, 20));
	  
	  g.drawString("No se ha podido cargar la imagen", 20, 50);
  }
  
	 
 }
 
}