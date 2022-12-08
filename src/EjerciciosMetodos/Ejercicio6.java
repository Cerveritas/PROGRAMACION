package EjerciciosMetodos;

import java.util.Scanner;


public class Ejercicio6 {
    public Scanner sc;

    public static void main(String[] args) {

        int opcion = 0;
        int[] numeros = new int[9];
    do {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que es lo que quieres hacer: ");
        System.out.println(" ");
        System.out.println("(1) - Generar un array");
        System.out.println("(2) - Valor minimo del array");
        System.out.println("(3) - Valor maximo del array");
        System.out.println("(4) - Media del array");
        System.out.println("(5) - Ver si un numero esta en el array o no");
        System.out.println("(6) - Ver en que posicion se encuentra un numero");
        System.out.println("(7) - Copiar el array en otro array");
        opcion = sc.nextInt();



        switch (opcion) {
            case 1:
                numeros = generarArray(numeros);
                System.out.println("Array creado correctamente...");
                break;


            case 2:System.out.println("El numero minimo es "+devolverMinimo(numeros));break;




            //case 3:numeros=devolverMaximo(numeros);break;

            case 4:System.out.println("La media de los numeros del array es: "+devolverMedia(numeros));
                break;

            //case 5:verSiNumeroEsta(numeros);break;

            //case 6:numeros=devovlerPosicion(numeros);break;

            //case 7:numeros=copiarArray(numeros);break;

            default:
                System.out.println("El numero introducido no es correcto.");
                break;

        }
    } while (opcion != 0) ;


    }

    // METODO 1 --> Genera un array
    public static int[] generarArray(int[] numeros){
        numeros=new int[9];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<9; i++){
            System.out.println("Introduce el nuemero"+i);
            numeros[i]= sc.nextInt();
        }
        return numeros;

    }


    public static int[] devolverMinimo(int[]numeros){
        int minNumero = numeros[0];
        for (int i=0; i<9; i++){
            if (minNumero>numeros[i]){
                minNumero=numeros[i];
                minNumero=i;


            }
        }
        return numeros;
    }

    //public static int[] devolverMaximo(int[]numeros){

  //  }

    public static int devolverMedia(int[]numeros){
        return (numeros[0]+numeros[1]+numeros[2]+numeros[3]+numeros[4]+numeros[5]+numeros[6]+numeros[7]+numeros[8])/9;

    }

   // public static boolean[] verSiNumeroEsta(int[]numeros){

  //  }

  //  public static int[] devovlerPosicion(int[]numeros){
//
//    }

 //   public static int[] copiarArray(int[]numeros){

 //   }


}
