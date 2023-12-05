package poo;
import java.util.*;
public class UsoEmpleado {

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
		
		Jefatura jefeRRHH=new Jefatura("Javier", 105000, 2006, 9, 25);
		
		jefeRRHH.estableceIncentivo(1000);
		
		Empleado[] empleados=new Empleado[6];	
		
		empleados[0]=new Empleado("Javier Olivares", 65000, 2002, 02, 15);
		empleados[1]=new Empleado("Ana López", 45000, 2005, 04, 23);
		empleados[2]=new Empleado("Daniela Cotelea", 25000, 2009, 07, 17);
		empleados[3]=new Empleado("Javier");
		empleados[4]=jefeRRHH;
		
//POLIMORFISMO EN ACCIÓN. PRINCIPIO DE SUSTITUCIÓN
//PODEMOS DARLE AL CONSTRUCTOR UNA OBJETO DE LA SUBCLASE EN LUGAR DE LA SUPER.
		
		
		empleados[5]=new Jefatura("María", 95000, 1999, 5, 26);
	
//EMPLEADOS[5] AL HABER SIDO AÑADIDO EN EL ARRAY DE CLASE EMPLEADO, ES DE TIPO EMPLEADO, NO JEFATURA
//CASTING DE OBJETOS, COMO JEFATURA HEREDA DE EMPLEADO, PODEMOS CONVERTIR EL OBJETO DE EMPLEADO A JEFATURA.
		
		//empleados[5].estableceincentivo(5000); --ERROR
		
		Jefatura jefaFinanzas=(Jefatura) empleados[5];
		
		jefaFinanzas.estableceIncentivo(5000);
		
		System.out.println(jefaFinanzas.tomarDecisiones("dar 2 días de vacaciones a los empleados"));
		
		System.out.println("El empleado/a " + jefaFinanzas.dimeNombre() + " tiene un bonus de " + jefaFinanzas.estableceBonus(500) + " euros");
		
		System.out.println("El empleado " + empleados[3].dimeNombre() + " Tiene un bonus de "
				+ empleados[3].estableceBonus(150) + " euros");
//POR LO QUE LO SIGUIENTE NOS DARÍA ERROR"EXCEPCIÓN"
//UN JEFE SIEMPRE SERÁ UN EMPLEADO PERO UN EMPLEADO NO SIEMPRE SERÁ UN JEFE.

		//Jefatura jefeCompras=(Jefatura) empleados[1];
		
		//-------//
		
		/*for (int i=0;i<empleados.length;i++) {
			
			empleados[i].subeSueldo(2);
			
		}*/
		
		/*for(int i=0;i<empleados.length;i++) {
			System.out.println("El empleado: " + empleados[i].dimeNombre()
					+ " Trabaja en la empresa desde " + empleados[i].dimeFecha() + " y cobra " + (int)empleados[i].dimeSueldo()
					+ " euros al año.");			
		}*/
		
		Arrays.sort(empleados);
		
		for (Empleado i:empleados) {
			
			i.subeSueldo(2);
			
			System.out.println("El empleado: " + i.dimeNombre() + ", con ID: " + i.dimeId()
			+ " Trabaja en la empresa desde " + i.dimeFecha() + " y cobra " + (int)i.dimeSueldo()
			+ " euros al año.");
			
		}
				
	}

}

class Empleado implements Comparable, Trabajadores{
	
	private final String nombre;
	
	private double sueldo;
	
	private Date altaContrato;
	
	private int Id;
	
	private static int IdSiguiente=1;
	
	
	public Empleado(String nombre, double sueldo, int anno, int mes, int dia) {
		
		this.nombre=nombre;
		
		this.sueldo=sueldo;
		
		Calendar calendario=new GregorianCalendar(anno, mes-1, dia);
		
		altaContrato=calendario.getTime();
		
		Id=IdSiguiente;
		
		IdSiguiente++;
				
	}
	
	public Empleado(String nombre) {		
		
//SOBRECARGA DE CONSTRUCTORES (PARA PODER DARLE ESTADO
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
	
	public int dimeId(){
		
		return Id;
	}
	
	public static int dimeIdSiguiente() {
		
		return IdSiguiente;
	}
	
	public int compareTo(Object miObjeto) {
		
		Empleado otroEmpleado=(Empleado) miObjeto;
		
		if(this.Id<otroEmpleado.Id) {
			
			return -1;
		}
		
		if(this.Id>otroEmpleado.Id) {
			
			return 1;
			
		}
		
		return 0;
		
	}
	
	public double estableceBonus(double gratificacion) {
		
		return Trabajadores.bonusBase+gratificacion;
		
	}
	
}

class Jefatura extends Empleado implements Jefes{
	
	
	
	private static double incentivo;
	
	
	public Jefatura(String name, double sue, int anno, int mes, int dia) {
		
		super(name, sue, anno, mes, dia);	//constructor del padre al que tiene que llamar
		
	}
	
	public void estableceIncentivo(double incentivo) {
		
		Jefatura.incentivo=incentivo;
		
	}
	
	public double dimeSueldo() {
		
		double sueldoJefe=super.dimeSueldo() + incentivo;
		
		return sueldoJefe;
		
	}
	
	public String tomarDecisiones(String decision) {
		
		return "Un miembro de la dirección ha tomado la decisión de " + decision;
		
	}
	
	public double estableceBonus(double gratificacion) {
		
		double prima=2000;
		
		double bonificacion = Trabajadores.bonusBase+gratificacion+prima;
		
		return bonificacion;
		
	}
	
	

}

class Director extends Jefatura{
	
	public Director(String name, double sueldo, int anno, int mes, int dia) {
		
		super(name, sueldo, anno, mes, dia);
		
	}
}


