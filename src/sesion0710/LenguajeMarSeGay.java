package sesion0710;

import java.util.Scanner;

/* Este programa trata de que vamos a dejar que el usuario decida el personaje a escoger.
*  Tendra 3 opciones = 3 numeros.
*  1 para Steve, 2 para Mario y 3 Para tu abuela.
*  Una vez elijamos saldra una imagen de nuestro personaje escogido.
*  Si metemos un numero fuera del rango indicado saldra una mensaje de error.
 */

public class LenguajeMarSeGay {

    public static void main(String[] args) {

        // declaramos y inicializamos la variable personaje
        int personajes =0;

        // solicitud y lectura del numero del personaje
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el personaje que quiere usar;");
        System.out.println("Pulse 1 para seleccionar a CUADRADO");
        System.out.println("Pulse 2 para seleccionar a TRIANGULO");
        System.out.println("Pulse 3 para seleccionar a tu ROMBO"); //corregir al finalizar
        personajes = sc.nextInt();

        // determina el personaje escogido
        if (personajes == 1)
        {
            System.out.printf("\033[36m  ██████████  \n");
            System.out.printf("\033[36m  █        █  \n");
            System.out.printf("\033[36m  █        █  \n");
            System.out.printf("\033[36m  ██████████  \n");
        }
        else if (personajes == 2)
        {
            System.out.printf("\033[35m      ██      \n");
            System.out.printf("\033[35m     █  █     \n");
            System.out.printf("\033[35m    █    █    \n");
            System.out.printf("\033[35m   █      █   \n");
            System.out.printf("\033[35m  █        █  \n");
            System.out.printf("\033[35m  ██████████  \n");
        }
        else if (personajes == 3)
        {
            System.out.printf("\033[32m      ██      \n");
            System.out.printf("\033[32m     █  █     \n");
            System.out.printf("\033[32m    █    █    \n");
            System.out.printf("\033[32m   █      █   \n");
            System.out.printf("\033[32m   █      █   \n");
            System.out.printf("\033[32m    █    █    \n");
            System.out.printf("\033[32m     █  █     \n");
            System.out.printf("\033[32m      ██      \n");
        }
        else
        {
            System.out.println("No has introducido un numero correcto, intentelo de nuevo");
        }












    }






}
