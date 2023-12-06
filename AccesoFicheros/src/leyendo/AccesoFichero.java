package leyendo;

import java.io.*;

public class AccesoFichero {
	
	public static void main(String[] args) {
		
		LeerFichero accediendo = new LeerFichero();
		
		accediendo.lee();
		
	}

}

class LeerFichero{
	
	FileReader entrada;
	
	public void lee(){
		
		try {
		
		entrada = new FileReader("C:/Users/javie/Desktop/ejemplo.txt");
		
		BufferedReader mibuffer = new BufferedReader(entrada);
		
		String linea ="";
		
		//int c = 0;
		
		while(linea!=null) {
			
			//c = entrada.read();
			
			//char letra = (char)c;
			
			linea = mibuffer.readLine();
			
			if(linea != null) {
				
				System.out.println(linea);
			}
			
		}
		
		//entrada.close();
		
		}catch(FileNotFoundException e) {
			
			System.out.println("El archivo no se ha podido encontrar");
		}catch(IOException e) {
			
			System.out.println("El archivo no se ha podido leer");
		}finally {
			
			try {
				entrada.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		
	}
}