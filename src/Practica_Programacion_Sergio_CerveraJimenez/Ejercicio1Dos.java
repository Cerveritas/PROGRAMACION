package Practica_Programacion_Sergio_CerveraJimenez;

import java.util.Scanner;

public class Ejercicio1Dos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero=0;
        float[] temps = new float[12];


        System.out.println("(0) - Salir");
        System.out.println("(1) - Inicializar un array que recoja las temperaturas media de cada mes del año.");
        System.out.println("(2) - Mostrar el mes (enumerado) con mayor temperatura.");
        System.out.println("(3) - Mostrar el mes (enumerado) con menos temperatura.");
        System.out.println("(4) - Imprimir la temperatura del mes introducido (de 1 a 12) por teclado.");
        System.out.println("(5) - Sacar temperatura media de los meses de verano.");
        System.out.println("(6) - Sacar temperatura media de los meses de invierno.");
        System.out.println("(7) - Comparar si temperatura de dos meses (enumerados) introducidos son iguales");

        System.out.println(" ");

        System.out.println("¿Cual es la opcion que quieres elegir?: ");

        numero=sc.nextInt();
        switch (numero)
        {
            case 1: temps=inicializar_array(temps);break;
            default:System.out.println("El nujkf");
        }
    }

    public static float[] inicializar_array(float[] temperaturas){
        Scanner sc = new Scanner(System.in);


        System.out.println("Dime la temperatura del mes de ENERO: ");
        temperaturas[0]=sc.nextFloat();

        System.out.println("Dime la temperatura del mes de FEBRERO");
        temperaturas[1]=sc.nextFloat();

        System.out.println("Dime la temperatura del mes de MARZO");
        temperaturas[2]=sc.nextFloat();

        System.out.println("Dime la temperatura del mes de ABRIL");
        temperaturas[3]=sc.nextFloat();

        System.out.println("Dime la temperatura del mes de MAYO");
        temperaturas[4]=sc.nextFloat();

        System.out.println("Dime la temperatura del mes de JUNIO");
        temperaturas[5]=sc.nextFloat();

        System.out.println("Dime la temperatura del mes de JULIO");
        temperaturas[6]=sc.nextFloat();

        System.out.println("Dime la temperatura del mes de AGOSTO");
        temperaturas[7]=sc.nextFloat();

        System.out.println("Dime la temperatura del mes de SEPTIEMBRE");
        temperaturas[8]=sc.nextFloat();

        System.out.println("Dime la temperatura del mes de OCTUBRE");
        temperaturas[9]=sc.nextFloat();

        System.out.println("Dime la temperatura del mes de NOVIEMBRE");
        temperaturas[10]=sc.nextFloat();

        System.out.println("Dime la temperatura del mes de DICIEMBRE");
        temperaturas[11]=sc.nextFloat();

        for (int i=0; i<temperaturas.length; i++) {
                System.out.println(temperaturas[i]);
            }


        return null;


    }

}

