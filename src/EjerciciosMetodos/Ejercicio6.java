/*package EjerciciosMetodos;

import java.util.Scanner;


public class Ejercicio6 {
    public static int[]numeros;
    public Scanner sc;

    public static void main(String[] args) {

        System.out.println("Que es lo que quieres hacer: ");
        System.out.println(" ");
        System.out.println("(1) - Generar un array");
        System.out.println("(2) - Valor minimo del array");
        System.out.println("(3) - Valor maximo del array");
        System.out.println("(4) - Media del array");
        System.out.println("(5) - Ver si un numero esta en el array o no");
        System.out.println("(6) - Ver en que posicion se encuentra un numero");
        System.out.println("(7) - Copiar el array en otro array");


        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        opcion = sc.nextInt();



        switch (opcion)
        {
            case 1:
                System.out.println("De que tamaño deseas crear tu array");
                numeros=generarArray(numeros);
                System.out.println("El array se ha creado correctamente con un tamaño de "+);
                break;

            case 2:numeros=devolverMinimo(numeros);

            case 3:numeros=devolverMaximo(numeros);

            case 4:numeros=devolverMedia(numeros);

            case 5:verSiNumeroEsta(numeros);

            case 6:numeros=devovlerPosicion(numeros);

            case 7:numeros=copiarArray(numeros);

                default:System.out.println("El numero introducido no es correcto.");

        }



    }

    // METODO 1 --> Genera un array
    public static int[] generarArray(int[]numeros){
    }


    public static int[] devolverMinimo(int[]numeros){
    }

    public static int[] devolverMaximo(int[]numeros){

    }

    public static int[] devolverMedia(int[]numeros){

    }

    public static boolean[] verSiNumeroEsta(int[]numeros){

    }

    public static int[] devovlerPosicion(int[]numeros){

    }

    public static int[] copiarArray(int[]numeros){

    }


}
*/