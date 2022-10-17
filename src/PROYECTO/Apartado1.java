package PROYECTO;

import java.util.Scanner;

public class Apartado1 {
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

    System.out.println("\033[33m El dinero que desea adqurir debe ser igual o menor al 80% del precio de la vivienda.");
    System.out.println("\033[32m ¿Cuanto dinero deseas solicitar?");








    }
}
