package poo;

public class Pruebas {

	public static void main(String[] args) {
		
		Empleados empleado1=new Empleados("Javier");
		Empleados empleado2=new Empleados("Daniela");
		Empleados empleado3=new Empleados("Antonio");
		Empleados empleado4=new Empleados("Maria");
		
		
		empleado1.cambiaSeccion("Programación");
		
		empleado2.cambiaSeccion("Complience");
		
		System.out.println(empleado1.devuelveDato() + "\n" + empleado2.devuelveDato()
				+ "\n" + empleado3.devuelveDato() + "\n" + empleado4.devuelveDato());
		
		System.out.println(Empleados.dameIdSiguiente());
		
		
		
	}

}

class Empleados{
	
	private final String nombre;
	private String seccion;
	private int id;
	private static int idSiguiente=1;	//DECLARAMOS VARIABLE STATIC, PERTENECE A LA CLASE Y NO A NINGÚN OBJETO
	
	public static String dameIdSiguiente() {
		return "El id siguiente a asigar es: " + idSiguiente;
	}
	
	public Empleados(String nom) {
				
		nombre=nom;
		
		seccion="Administración";
		
		id=idSiguiente;
		
		idSiguiente++;
		
	}
	
	public void cambiaSeccion(String seccion) {//SETTER
		
		this.seccion=seccion;
	}
	
	
	public String devuelveDato(){
		
	return "El nombre es " + nombre + " y trabaja en la sección de " + seccion + " su id es: " + id+".";
		
	}
	
	
	
	
	
}