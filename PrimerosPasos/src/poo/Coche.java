package poo;

public class Coche {
	
	//CLASE: SE REDACTAN LAS CARACTERÍSTICAS COMUNES DE UN GRUPO DE OBJETOS "LA PLATAFORMA"
	
	private int ruedas;		//(PRIVATE)ENCAPSULACIÓN DE DATOS PARA QUE NO SE PUEDAN MODIFICAR
	
	private int largo;
	
	private int ancho;
	
	private int motor;
	
	private int peso;
	
	//MÉTODO CONSTRUCTOR---SIEMPRE EL MISMO NOMBRE QUE LA CLASE
	
	public Coche() {
		
		ruedas=4;
		
		largo=2000;
		
		ancho=300;
		
		motor=1600;
		
		peso=500;
		
	}
	
	public String dime_largo() {	//Método getter
		
		return "El largo del coche es " + largo + " cm";
		
	}
	
}
