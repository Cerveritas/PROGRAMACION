package sesion2411;

import java.util.Scanner;

public class EjercicioArrayEnumerado {
    private static int [][] notas = new int[2][3];
    public static void main(String[] args) {

        System.out.println("Lo primero que haremos sera meter los datos de las notas dentro de un array BIDIMEMSIONAL");

       Scanner sc = new Scanner(System.in);

        System.out.println("Introduza practica 1 de programacion: ");
        notas[0][0]=sc.nextInt();

        System.out.println("Introduzca practica 2 de programacion: ");
        notas[0][1]=sc.nextInt();

        System.out.println("Introduzca nota examen de programacion: ");
        notas[0][2]=sc.nextInt();

        System.out.println("Introduzca practica 1 de BBDD: ");
        notas[1][0]=sc.nextInt();

        System.out.println("Introduzca practica 2 de BBDD: ");
        notas[0][1]=sc.nextInt();

        System.out.println("Introduzca nota examen de BBDD: ");
        notas[1][2]=sc.nextInt();
        menu();

    }
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("A continuacion veremos que tipo de media deseas visualizar.");
        System.out.println("Pulse 1 para: MEDIA DE UNA ASIGNATURA");
        System.out.println("Pulse 2 para: MEDIA DE AMBAS ASIGNATURAS");

        switch (sc.nextInt())
        {
            case 1: media_de_una_asignatura();break;
            case 2: media_de_ambas_asinaturas();break;
        }

    }
    public static void media_de_una_asignatura(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Has elegido ver la media de una asignatura.");
        System.out.println("A continuacion elige de que asignatura quieres ver la nota final");

        switch (sc.nextInt())
        {
            case 1: System.out.println("la nota de programacion es: "+(notas[0][0]+notas[0][1]+notas[1][1]/3));
            case 2: System.out.println("la nota de BBDD es: ");
        }



    }
    public static void media_de_ambas_asinaturas(){

    }

}
