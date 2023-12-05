package poo;

//CLASE ENUM, NECESIDAD DE ALMACENAR UNA SERIE DE VALORES POSIBLES, Y QUE SÓLO SE ACEPTEN ALGUNA DE LOS PREDETERMINADOS.
import java.util.*;

public class Uso_Tallas {
	
	//enum Talla {MINI, MEDIANO, GRANDE, MUY_GRANDE};
	
	enum Talla{
		
		MINI("S"), MEDIANA("M"), GRANDE("L"), EXTRAGRANDE("XL"); //OBJETOS CON SUS CORRESPONDIENTES ABREVIATURAS
		
		String abreviatura;
		
		private Talla(String abreviatura) {
			
			this.abreviatura=abreviatura;
			
		}
		
		public String dameAbreviatura() {
			
			return abreviatura;
			
		}
		
	}

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Escribe una talla: MINI, MEDIANA, GRANDE, o EXTRAGRANDE");
		
		String entradaDatos=entrada.next().toUpperCase();
		
		Talla laTalla=Enum.valueOf(Talla.class, entradaDatos);
		
		System.out.println("Talla = " + laTalla);
		
		System.out.println("La abreviatura de la talla: " + laTalla + " es: " + laTalla.dameAbreviatura());
		
	}

}
