package exceptions1;

import java.io.EOFException;

import javax.swing.JOptionPane;

public class CompruebaMail {
	
	static int valido;
	
	static String mail;

	public static void main(String[] args) {
		
	do {
		
		mail = JOptionPane.showInputDialog("Introduce tu mail");
		
		if(mail==null) {
			
			System.out.println("El programa se ha cerrado");
			
			System.exit(0);
		}
		
		
		
		try {
			
		compruebaMail(mail);
		
		}catch(LengthError e){
			
			System.out.println("El mail que has introducido es demasiado corto: " + mail );
			
			e.printStackTrace();		//SEGUIMIENTO DE LA PILA DE EXCEPCIONES, LISTA DETALLADA DE LOS METODOS QUE SE HAN EJECUTADO ANTES DE LANZAR LA EXCEPCION
			
			System.out.println(e.getMessage());		//EN ESTE CASO, IMPRIME EN CONSOLA EL MENSAJE QUE YA TIENE EL CONSTRUCTOR DEL ERROR
			
		}
	
	if(valido==-1) {
		
		System.out.println("El formato de mail introducido no es valido");
	}
	
	}while(valido!=1);
	
	}
	
	static void compruebaMail(String mail) throws LengthError{
		
		int arroba=0;
		
		boolean punto=false;
		
		int correcto=0;
		
		valido=0;
		
		if(mail.length()<=3) {
			
			//ArrayIndexOutOfBoundsException miException = new ArrayIndexOutOfBoundsException();
			
			//throw new EOFException();
			
			throw new LengthError("El mail debe tener mas de 3 caracteres");
			
			
		}else {
		
		for(int i=0; i<mail.length(); i++) {
			
			if(mail.charAt(i)=='@'){
				
				arroba++;
			}
		}
		
		for(int x=0; x<mail.length(); x++) {
			
			if(mail.charAt(x)=='.') {
				
				punto=true;
			}
		}
		
		if(mail.indexOf('@')<mail.indexOf('.')&&mail.indexOf('.')>mail.indexOf('@')+1 && mail.indexOf('.')<mail.length()-1) {
			
			correcto++;
		}
			
			if(arroba==1&&punto==true&&correcto==1) {
				
				
				System.out.println("El formato del mail introducido es correcto");
				
				valido++;
				
			}else {
				
				valido--;
			}
			
		
		
	}
		
	}

}

class LengthError extends Exception{
	
	
	public LengthError() {
		
		
	}
	
	public LengthError(String errorMsg) {
		
		
		super(errorMsg);	//ESTAMOS LLAMANDO AL CONSTRUCTOR DE LA CLASE PADRE(EXCEPTION) Y LE PASAMOS LO QUE HAY ALMACENADO EN (errorMsg)
		
		
	}
}
