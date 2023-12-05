package exceptions1;

public class Operaciones {

	public static void main(String[] args) {

		Suma suma = new Suma();
		
		Resta resta = new Resta();
		
		Division division = new Division();
		
		Multiplicacion multiplicacion = new Multiplicacion();
		
		System.out.println(suma.calculo(7, 8));
		
		System.out.println(resta.calculo(7, 8));
		
		System.out.println(division.calculo(7, 8));
		
		System.out.println(multiplicacion.calculo(7, 8));
		
	}

}
