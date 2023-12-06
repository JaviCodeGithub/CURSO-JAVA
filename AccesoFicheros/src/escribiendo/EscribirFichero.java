package escribiendo;

import java.io.*;
import java.io.IOException;

public class EscribirFichero {
	
	//PRUEBA DE GIT
	
	public static void main(String[] args) {
		
		Escribiendo esc = new Escribiendo();
		
		esc.escribir();
		
	}

}

class Escribiendo{
	
	public void escribir() {
		
		String frase = "Esto es una prueba de escritura, esta guapo no?";
		
		try {
			FileWriter escritura = new FileWriter("C:/Users/javie/Desktop/ejemplo2.txt");
			
			BufferedWriter escri = new BufferedWriter(escritura);
						
			escri.write(frase);
			
			escritura.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}