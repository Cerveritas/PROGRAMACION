package EjerciciosMetodos;

import sesion1811.ArrayArgumento;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        System.out.println("Vamos a hacer un cambio de divisa");

int radio =0;
    CambioMoneda(radio);


    }
    public static double CambioMoneda(double moneda){
        int opcion=0;
        Scanner sc = new Scanner(System.in);
        opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
                System.out.println("0,86 libras es 1€");break;

            case 2:System.out.println("1,38611 % es 1€");break;

            case 3:System.out.println("129,852 yenes es 1€");break;

            default:System.out.println("El numero introducido es incorrecto");
        }
        return 0; // <--- Cambiar
    }

}
