package PROYECTO;

import java.util.Scanner;

public class Apartado1 {
    /*
    * PROGRAMACION
    * UNIDAD 1 Y 2
    * @author Sergio Cervera Jimenez
    * @curse 1ºM DAM+
     */
    public static void main(String[] args) {

    System.out.print    ("\033[36m ############################################################################\n");
    System.out.print    ("\033[36m #         Bienvenido a tu Banco, si esta aqui es por que esta interesado   #\n");
    System.out.print    ("\033[36m #         en su futura nueva vivienda, y para esto vamos a ver si es       #\n");
    System.out.print    ("\033[36m #         posible concerderle una hipoteca                                 #\n");
    System.out.print    ("\033[36m ############################################################################");
    System.out.println("\033[37m ");
    System.out.println(" ");
    System.out.println("\033[37m Responda a las siguientes preguntas del test;");
    System.out.println(" ");

    int trabajo = 0;


    Scanner sc = new Scanner(System.in);
    System.out.println("\033[33m Para responder SI, pulse 1.");
    System.out.println("\033[33m Para responder NO, pulse 2.");
    System.out.println("\033[32m ¿Se encuentra ahora en un puesto de trabajo?");
    trabajo = sc.nextInt();


    if (trabajo == 1)
    {
        System.out.println("\033[37m Perfecto");
    }
    while (trabajo == 2)
    {
        System.out.println("\033[37m Valla, sin un puesto de trabajo fijo no podemos concederte una hipoteca");
    }

    System.out.println(" Vamos a la segunda pregunta");
    System.out.println(" ");
//a partir de aqui se debera decidir si vale esta forma de pedir los datos al usuario
    System.out.println("\033[33m El dinero que desea adqurir debe ser igual o menor al 80% del precio de la vivienda.");

    int precio=0;
    Scanner pr = new Scanner(System.in);
    System.out.println("\033[32m ¿Cuanto vale la vivienda que desea comprar?");
    precio = pr.nextInt();

    int porcentaje;
    porcentaje=precio/100*80;

    System.out.println("\033[33m PUEDES PEDIR UN PRESTAMO DE  "+porcentaje+ "O INFERIOR");
    System.out.println(" ");

    int user=0;
    Scanner us = new Scanner(System.in);
    System.out.println("\033[32m ¿Cuanto deseas pedir?");
    user = us.nextInt();

    if (user > porcentaje)
    {
        System.out.println("\033[31m El dinero solicitado es superior a lo indicado, vuelvalo a intentar");
    }
    else if (user <= porcentaje)
    {
        System.out.println("\033[37m Perfecto usted a decidido pedir un prestamo de "+user);
    }










    }
}
