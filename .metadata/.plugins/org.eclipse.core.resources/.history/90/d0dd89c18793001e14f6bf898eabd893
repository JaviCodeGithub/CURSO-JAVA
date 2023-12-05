package inicio;
//PREGUNTA TECNICA DE MI AMIGO CHATGPT
public class Prueba2 {
    public static void main(String[] args) {
        
        double acumulado=10000;

        double interes=0.05;

        

        double[][] saldo = new double[5][12];

        for(int i=0; i<1; i++){

            for (int x=0; x<12; x++){

                saldo[0][0]=10000;

                acumulado = acumulado + (acumulado*interes);

                saldo[i][x] = acumulado;
            }
        }

        interes=interes+0.01;

        for(int i=1; i<2; i++){

            for (int x=0; x<12; x++){

                

                acumulado = acumulado + (acumulado*interes);

                saldo[i][x] = acumulado;
            }

        }

        interes=interes+0.01;

        for(int i=2; i<3; i++){

            for(int x=0; x<12; x++){

                acumulado=acumulado+(acumulado*interes);

                saldo[i][x]=acumulado;
            }
        }

        interes=interes+0.01;

        for(int i=3; i<5; i++){

            for(int x=0; x<12; x++){

                acumulado=acumulado+(acumulado*interes);

                saldo[i][x]=acumulado;
            }
        }

        for(int z=0; z<5; z++){

            System.out.println("");

            for (int y=0; y<12; y++){

                System.out.printf(" "+"%1.2f",saldo[z][y]);
            }
        }

        
    }
}
