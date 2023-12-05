package poo;
import java.util.*;
public class Uso_Empleado {

	public static void main(String[] args) {
		
		/*Empleado empleado1=new Empleado("Javier Olivares", 65000, 2002, 02, 15);
		Empleado empleado2=new Empleado("Ana López", 45000, 2005, 04, 23);
		Empleado empleado3=new Empleado("Paco Gimenez", 25000, 2009, 07, 17);
		
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		
		System.out.println("Nombre: " + empleado1.dimeNombre() +
		"  	Sueldo: " + (int)empleado1.dimeSueldo() +
		"         Fecha de alta: " + empleado1.dimeFecha());
		System.out.println("Nombre: " + empleado2.dimeNombre() +
		" 		Sueldo: " + (int)empleado2.dimeSueldo() +
		"         Fecha de alta: " + empleado2.dimeFecha());
		System.out.println("Nombre: " + empleado3.dimeNombre() +
		" 		Sueldo: " + (int)empleado3.dimeSueldo() +
		"         Fecha de alta: " + empleado3.dimeFecha());*/
		
		Empleado5[] empleados=new Empleado5[4];	
		
		empleados[0]=new Empleado5("Javier Olivares", 65000, 2002, 02, 15);
		empleados[1]=new Empleado5("Ana López", 45000, 2005, 04, 23);
		empleados[2]=new Empleado5("Daniela Cotelea", 25000, 2009, 07, 17);
		empleados[3]=new Empleado5("Javier");
		
		/*for (int i=0;i<empleados.length;i++) {
			
			empleados[i].subeSueldo(2);
			
		}*/
		
		/*for(int i=0;i<empleados.length;i++) {
			System.out.println("El empleado: " + empleados[i].dimeNombre()
					+ " Trabaja en la empresa desde " + empleados[i].dimeFecha() + " y cobra " + (int)empleados[i].dimeSueldo()
					+ " euros al año.");			
		}*/
		
		for (Empleado5 i:empleados) {
			
			i.subeSueldo(2);
			
			System.out.println("El empleado: " + i.dimeNombre()
			+ " Trabaja en la empresa desde " + i.dimeFecha() + " y cobra " + (int)i.dimeSueldo()
			+ " euros al año.");
		}
		
		
	}

}

class Empleado5{
	
	private String nombre;
	
	private double sueldo;
	
	private Date altaContrato;
	
	
	public Empleado5(String nombre, double sueldo, int anno, int mes, int dia) {
		
		this.nombre=nombre;
		
		this.sueldo=sueldo;
		
		Calendar calendario=new GregorianCalendar(anno, mes-1, dia);
		
		altaContrato=calendario.getTime();
				
	}
	
	public Empleado5(String nombre) {		//SOBRECARGA DE CONSTRUCTORES (PARA PODER DARLE ESTADO
											//INICIAL DIFERENTE A LOS OBJETOS
		this(nombre, 20000, 2023, 01, 01);
		
	}
	
	public String dimeNombre() {//GETTER
		
		return nombre;
		
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
	

	
}