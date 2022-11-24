package Practica_Programacion_Sergio_CerveraJimenez;

import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        menu();

    }
    public static void menu(){

        int numero = 0;
        Scanner st = new Scanner(System.in);

        System.out.println("0.- Salir");
        System.out.println("1.- Inicializar un array que recoja la temperatura media de cada mes del año.");
        System.out.println("2.- Mostrar el mes (enumerado) con mayor temperatura.");
        System.out.println("3.- Mostrar el mes (enumerado) con menor temperatura.");
        System.out.println("4.- Imprimir la temperatura des mes introducido (de 1 a 12) por teclado.");
        System.out.println("5.- Sacar la temperatura media de los meses de verano.");
        System.out.println("6.- Sacar la temperatura media de los meses de invierno.");
        System.out.println("7.- Comparar si temperatura de dos mses (enumerados) introducidos son iguales.");

        numero = st.nextInt();
        
        


        switch (numero)
        {
            case 0:{System.out.println("El programa ha finalizado");break;}
            case 1: inicializar_array();break;
            case 2: mayor_temperatura();break;
            case 3: //menor_temperatura()
            case 4: //sacar_temperatura()
            case 5: //temp_media_verano()
            case 6: //temp_media_invierno()
            case 7: //comparar()
            default:System.out.println("Ha introducido un valor incorrecto");break;
        }
        





    }

    //metodo1
    //he bajado lo que sale del metodo (float[] temperaturas = new float[2] y asi si me funciona
    //el System "hola" es para comprobar que me lleva a este metodo
    public static float[] inicializar_array() {
        float[] temperaturas = new float[2];


        System.out.println("Hola");

        return temperaturas;
    }




    // metodo2
    public static meses mayor_temperatura(){
        float[] temperaturas;
        System.out.println("Hola");

        return null;
    }

    //metodo3
    /*public static meses menor_temperatura(float[] temperaturas){

    }

    //metodo4
    public static float sacar_temperatura(int mes, float[] temperaturas){

    }

    //metodo5
    public static float temp_media_verano(float[] temperaturas){

    }

    //metodo6
    public static float temp_media_invierno(float[] temperaturas){

    }

    //metodo7
    private static boolean comparar(meses valor1, meses valor2, float[] temperaturas_madrid){

    }

    //metodo auxiliar 1
    //metodo auxiliar 2

*/






}

