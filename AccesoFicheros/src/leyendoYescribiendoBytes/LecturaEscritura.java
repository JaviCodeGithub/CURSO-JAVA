package leyendoYescribiendoBytes;

import java.io.*;

public class LecturaEscritura {

	public static void main(String[] args) {
		
		int count = 0;
		
		int[] bytesImagen = new int[11089];

		try {
			
			FileInputStream archivoLectura = new FileInputStream("C:/Users/javie/Desktop/imagen.png");
			
			boolean finalAr = false;
			
			while(!finalAr) {
				
				int byteEntrada = archivoLectura.read();
				
				
				if(byteEntrada==-1) {
					
					finalAr = true;
				}
				
				if(byteEntrada!=-1) {
					
					bytesImagen[count]=byteEntrada;
					
					System.out.print(bytesImagen[count] + " ");
					
					count++;
				}
				
				
				
				}
			
			
			archivoLectura.close();
			
			System.out.println("El archivo contiene " + count + " bytes");
			
		}catch(IOException e) {
			
			System.out.println("Error al acceder a la imagen");
		}
		
		creaImagen(bytesImagen);
		
	}
	
	static void creaImagen(int datos[]) {
		
		 
		
		try {
			
			FileOutputStream imagen = new FileOutputStream("C:/Users/javie/Desktop/imagen2.png");
			
			for(int i=0; i<datos.length; i++) {
				
				imagen.write(datos[i]);
			}
			
			imagen.close();
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
			
		}catch(IOException e) {
			
			System.out.println("No se ha podido crear la imagen");
		}
		
		
	}

}
