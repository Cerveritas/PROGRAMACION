package ExamenAñoPasado;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        int opcion;
        do {
            System.out.println("Funcionalidades ejercicio 2");
            System.out.println(" ");
            System.out.println("1 - Calcular sumatorio");
            System.out.println("2 - Invertir array");
            System.out.println("3 - Salir");
            System.out.println(" ");

            System.out.println("Esperando opcion...");
            Scanner sc = new Scanner(System.in);
            opcion = sc.nextInt();

            switch (opcion)
            {
                case 1:
                    System.out.println("Que numero quires el sumatorio");
                    int numeros=sc.nextInt();
                    int sumatorio = metodo1(numeros);
                    System.out.println("El sumatorio de "+numeros+" es "+sumatorio);

                case 2:


                case 3: System.out.println("Gracias por utilizar el programa...");break;
                default:System.out.println("Opcion introducida incorrecta");break;
            }


        }while (opcion!=3);
    }

    public static int metodo1(int numeros){
        int resultado=0;
        for (int i=1; i<=numeros;i++){
            resultado=resultado+1;
        }
        return resultado;
    }
}
