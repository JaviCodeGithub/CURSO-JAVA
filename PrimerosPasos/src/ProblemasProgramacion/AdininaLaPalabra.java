package ProblemasProgramacion;

import java.util.*;

public class AdininaLaPalabra {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        int intentos = 3;
	        String[] palabras = {"casa", "arbol", "Javi", "Daniela"};
	        String palabraSecreta = palabras[random.nextInt(palabras.length)];

	        int longitudPalabra = palabraSecreta.length();
	        int letrasAMostrar = (int) (longitudPalabra * 0.5);
	        StringBuilder palabraAdivinada = new StringBuilder(palabraSecreta.substring(0, letrasAMostrar));

	        System.out.println(random.nextInt(palabras.length));
	        System.out.println("¡Bienvenido al juego de adivinar la palabra!");
	        System.out.println("Tienes 3 intentos para adivinar la palabra.");
	        System.out.println("La palabra tiene " + longitudPalabra + " letras, con al menos el 50% de las letras reveladas.");

	        while (intentos > 0) {
	            System.out.println("Palabra actual: " + palabraAdivinada);
	            System.out.println("Intentos restantes: " + intentos);

	            System.out.print("Adivina una letra o la palabra entera: ");
	            String entrada = scanner.nextLine().toLowerCase();

	            if (entrada.length() == 1) {
	                char letra = entrada.charAt(0);
	                boolean letraAdivinada = false;

	                for (int i = 0; i < longitudPalabra; i++) {
	                    if (palabraSecreta.charAt(i) == letra) {
	                        palabraAdivinada.setCharAt(i, letra);
	                        letraAdivinada = true;
	                    }
	                }

	                if (letraAdivinada) {
	                    System.out.println("¡Correcto! La letra está en la palabra.");
	                } else {
	                    System.out.println("Letra incorrecta. Pierdes un intento.");
	                    intentos--;
	                }
	            } else if (entrada.equals(palabraSecreta)) {
	                System.out.println("¡Felicitaciones! Has adivinado la palabra correctamente.");
	                break;
	            } else {
	                System.out.println("Palabra incorrecta. Pierdes un intento.");
	                intentos--;
	            }

	            if (palabraAdivinada.toString().equals(palabraSecreta)) {
	                System.out.println("¡Ganaste! Has adivinado la palabra: " + palabraSecreta);
	                break;
	            }
	        }

	        if (intentos == 0) {
	            System.out.println("¡Perdiste! La palabra secreta era: " + palabraSecreta);
	        }

	        scanner.close();
	    }

}
