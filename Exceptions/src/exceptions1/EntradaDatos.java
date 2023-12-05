package exceptions1;

import java.io.IOException;
import java.util.*;

//INPUT MIS MATCH EXCEPTION HEREDA DE RUNTIME EXCEPTION

public class EntradaDatos {

	public static void main(String[] args) {

		System.out.println("What do you want to do?");
		
		System.out.println("1. Introduce data");
		
		System.out.println("2. Exit");
		
		Scanner entry = new Scanner(System.in);
		
		int decision = entry.nextInt();
		
		if(decision==1) {
			
			try {
			
			pedirDatos();
			
			}catch(Exception e) {
				
				System.out.println("WTF did you type?");
			}
		}else {
			
			System.out.println("Bye");
			
			System.exit(0);
			
			
		}
		
		entry.close();
		
	}
	
	static void pedirDatos() throws Exception{
		
		//try {
		
		Scanner entry = new Scanner(System.in);
		
		System.out.println("Introduce your name please");
		
		String userName = entry.nextLine();
		
		System.out.println("Introduce your age please");
		
		int userAge = entry.nextInt();
		
		System.out.println("Hi " + userName + ", next year you will be " + (userAge+1) + " years old");
		
		entry.close();
		
		//}catch(Exception e) {
			
	//		System.out.println("WTF did you type?");
		//}
		
		System.out.println("We are done");
		
	}

}
