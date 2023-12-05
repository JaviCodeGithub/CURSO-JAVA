package inicio;

public class Arrays2D_Mejorado {

	public static void main(String[] args) {
		
		int [][] matrix= {
				{10,15,16,19,21},
				{5,25,37,41,15},
				{7,19,32,14,90},
				{85,2,7,40,27}
				
		
		};		
		
		/*for (int i=0;i<4;i++) {
			System.out.println();
			for (int j=0;j<5;j++) {
				
				System.out.print(matrix[i][j] + " ");
			}
			
		}*/
		
		for(int[]fila:matrix) {
			System.out.println();   /*El bucle externo for recorre cada elemento de la matriz matrix.
									En cada iteración, un elemento de la matriz se asigna
									a la variable fila. La variable fila es un array de enteros.*/
			
			for (int z:fila) {
			System.out.print(z + " ");	/*El bucle interno for recorre cada elemento del array fila.
										En cada iteración, un elemento del array se asigna a la variable z,
										que es de tipo entero.*/
			
			
		}
}
}
}
