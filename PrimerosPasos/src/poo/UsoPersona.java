package poo;

import java.util.*;

public class UsoPersona {

	public static void main(String[] args) {

		Persona[] lasPersonas=new Persona[2];
		
		lasPersonas[0]=new Empleado2("Pepito", 60000, 2002, 4, 21);
		lasPersonas[1]=new Alumno("Miguel", "Economía");
		
		for (Persona informacion: lasPersonas) {
			
			System.out.println(informacion.dameDescripcion());
			
		}
		
		//System.out.println(lasPersonas[0].dimeSueldo()); --ERROR
		
		//CASTING
		
		Empleado2 pepito=(Empleado2) lasPersonas[0];
		
		System.out.println("Pepito cobra: " + (int)pepito.dimeSueldo() + " euros al año");
		
	}
	
}

abstract class Persona{
	
	private String nombre;  
		
	public Persona(String nombre){
		
		this.nombre=nombre;
		
	}
	
	public String dimeNombre() {
		
		return nombre;
		
	}
	
	public abstract String dameDescripcion();
	
	
}

class Empleado2 extends Persona{
		
	private double sueldo;
	
	private Date altaContrato;
	
	private int Id;
	
	private static int IdSiguiente=1;
	
	
	public Empleado2(String nombre, double sueldo, int anno, int mes, int dia) {
		
		super(nombre);
				
		this.sueldo=sueldo;
		
		Calendar calendario=new GregorianCalendar(anno, mes-1, dia);
		
		altaContrato=calendario.getTime();
		
		Id=IdSiguiente;
		
		IdSiguiente++;
				
	}
	
	public String dameDescripcion() {
		
		return "El empleado: " + dimeNombre() + ", tiene un ID = " + Id + ", y cobra: " + (int)sueldo + " euros al año";
		
	}
	
	public double dimeSueldo() {//GETTER
		
		return sueldo;
	}
	
	public Date dimeFecha() {//GETTER
		
		return altaContrato;
		
	}
	
	public void subeSueldo(double porcentaje) {//SETTER
		
		sueldo=sueldo+(sueldo/100*porcentaje);
		//double aumento=sueldo*porcentaje/100;
		//sueldo+=aumento;
		
	}
	
	public int dimeId(){
		
		return Id;
	}
	
	public static int dimeIdSiguiente() {
		
		return IdSiguiente;
	}
	
	
}

class Alumno extends Persona{
	
	private String carrera;
	
	
	public Alumno(String nombre, String carrera) {
		
		super(nombre);
		
		this.carrera=carrera;
		
	}
	
 	public String dameDescripcion() {
		
		return "El alumno: " + dimeNombre() + ", está estudiando la carrea de: " + carrera;
		
	}
	
}