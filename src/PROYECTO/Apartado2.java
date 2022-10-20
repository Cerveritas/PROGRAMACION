package PROYECTO;

import java.util.Scanner;

public class Apartado2 {
    /*
     * PROGRAMACION
     * UNIDAD 1 Y 2
     * @author Sergio Cervera Jimenez
     * @curse 1ºM DAM+
     */
    public static void main(String[] args) {
        // introduccion

        System.out.print    ("\033[36m ############################################################################\n");
        System.out.print    ("\033[36m #         Bienvenido a tu Matematico, si esta aqui es por que quiere       #\n");
        System.out.print    ("\033[36m #         aplicar distintas formulaas de un circulo asique le              #\n");
        System.out.print    ("\033[36m #         le proporcionaremos la informacion necesaria                     #\n");
        System.out.print    ("\033[36m ############################################################################");
        System.out.println("\033[37m ");
        System.out.println(" ");
        System.out.println("Vamos a empezar con asginar el radio, entonces:");

        int r = 0;
        double pi= 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cual es el valor que le quieres asignar al radio?");
        r = sc.nextInt();
        System.out.println("EL RADIO HA SIDO ASIGNADO CON EL VALOR DE "+r);

        System.out.println(" ");
        System.out.println("A continuacion elegiremos que queremos calcular:");

        int calculo=0;
        Scanner ca = new Scanner(System.in);
        System.out.println("Pulsa 1, para calcular el PERIMETRO");
        System.out.println("Pulse 2, para calcular el AREA");
        System.out.println("Pulse 3, para calcular el VOLUMEN");
        calculo = ca.nextInt();

        switch (calculo)
        {
            //calculo del perimetro
            case 1: {System.out.println("Aqui va la operacion del perimetro");break;}

            //calculo del area
            case 2: {System.out.println("Aqui va la operacion del area");break;}

            //calculo del volumen
            case 3: {System.out.println("Aqui va la operacion del volumen");break;}

        }
    }
}

