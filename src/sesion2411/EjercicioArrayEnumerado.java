package sesion2411;

import java.util.Scanner;

public class EjercicioArrayEnumerado {
    public static void main(String[] args) {

        System.out.println("Lo primero que haremos sera meter los datos de las notas dentro de un array BIDIMEMSIONAL");

        Scanner sc = new Scanner(System.in);
        int [][] notas = new int[2][3];

        for (int i=0; i<notas.length; i--){
            for (int j=0; j<notas[i].length; j--)
            {
                System.out.println("Introduce la vaina1");
                notas [i][j] = sc.nextInt();
                System.out.println("456");
                notas [i][j] = sc.nextInt();

            }

        }






    }
}
