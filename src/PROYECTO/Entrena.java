package PROYECTO;

import java.util.Scanner;

public class Entrena {
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

       boolean trabajo = false;

       Scanner sc = new Scanner(System.in);
       System.out.println("Tiene trabajo?");
       trabajo = sc.nextBoolean();


       if (trabajo=false)
       {
            System.out.println("Peeneee");
       }





    }

}
