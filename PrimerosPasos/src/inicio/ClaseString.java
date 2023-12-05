package inicio;
public class ClaseString {

	public static void main(String[] args) {

	String nombre="Pepito";
	
	System.out.println("Mi nombre es " + nombre);
	
	System.out.println("Mi nombre tiene " + nombre.length() + " letras"); //número de carácteres
	
	System.out.println("Mi nombre empieza por " + nombre.charAt(0)); //qué caracter se encuentra en la posición 0 en este caso(primera letra)
	
	int ultimaletra;
	ultimaletra=nombre.length(); //creo variable ultimaletra y con valor: número de carácteres en total de nombre
	
	System.out.println("La última letra de mi nombre es " + nombre.charAt(ultimaletra-1));// o lo que es lo mismo: + nombre.chartAt(nombre.lenght()-1)
		
	}

}
