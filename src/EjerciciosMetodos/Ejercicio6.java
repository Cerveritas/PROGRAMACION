/*package EjerciciosMetodos;

import java.util.Scanner;


public class Ejercicio6 {
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
            case 1: numeros=generarArray(int[]numeros);

                }


        //    case 2:numeros=devolverMinimo(numeros);break;

        //    case 3:numeros=devolverMaximo(numeros);break;

        //    case 4:numeros=devolverMedia(numeros);break;

        //    case 5:verSiNumeroEsta(numeros);break;

        //    case 6:numeros=devovlerPosicion(numeros);break;

        //    case 7:numeros=copiarArray(numeros);break;

               // default:System.out.println("El numero introducido no es correcto.");break;

        }



    }

    // METODO 1 --> Genera un array
    public static int[] generarArray(int numeros){
        Scanner stc = new Scanner(System.in);
        int[] array;
        System.out.println("Intruzca la dimension del array");
        int dimension = stc.nextInt();
        array = new int[dimension];
        for (int i=0; i<array.length; i++){
            System.out.println("Introduzca el valor "+i);
            array[i] = stc.nextInt();
            return array;



    }


    //public static int[] devolverMinimo(int[]numeros){
  //  }

  //  public static int[] devolverMaximo(int[]numeros){

  //  }

  //  public static int[] devolverMedia(int[]numeros){

  //  }

  //  public static boolean[] verSiNumeroEsta(int[]numeros){

  //  }

  //  public static int[] devovlerPosicion(int[]numeros){

  //  }

 //   public static int[] copiarArray(int[]numeros){

   // }


}
*/