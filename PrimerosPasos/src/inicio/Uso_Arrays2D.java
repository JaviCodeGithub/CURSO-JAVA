package inicio;

public class Uso_Arrays2D {

	public static void main(String[] args) {
		
		int [][] matrix=new int [4][5];
		
		matrix[0][0]=15;
		matrix[0][1]=21;
		matrix[0][2]=67;
		matrix[0][3]=13;
		matrix[0][4]=54;
		
		matrix[1][0]=21;
		matrix[1][1]=11;
		matrix[1][2]=5;
		matrix[1][3]=27;
		matrix[1][4]=48;
		
		matrix[2][0]=16;
		matrix[2][1]=4;
		matrix[2][2]=72;
		matrix[2][3]=28;
		matrix[2][4]=19;
		
		matrix[3][0]=41;
		matrix[3][1]=24;
		matrix[3][2]=37;
		matrix[3][3]=10;
		matrix[3][4]=23;
		
		//System.out.println("Valor almacenado en la posicion 2,3 " + matrix[2][3]);
		
		for(int i=0;i<4;i++) {
			System.out.println();
			for(int j=0;j<5;j++) {
				
				System.out.print(matrix[i][j] + " ");
			}
			
		}
		
	}

}
