/*package Practica_Programacion_Sergio_CerveraJimenez;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

    private static String[] lista;
    private static Scanner sc;
    public static void main(String[] args) {

        sc = new Scanner(System.in);
        System.out.println("Introduzca el tamaño de la lista");
        lista = new String[sc.nextInt()];
        menu();
    }

    public static void menu(){

        System.out.println("\nIntroduzca una opcion:\n" +
                "0. Salir\n" +
                "1. Hacer la lista de la compra\n" +
                "2. Numero de items de la compra\n" +
                "3. Imprimir lista de la compra\n" +
                "4. Comprobar si exite elemento y en que posicion de la lista esta\n" +
                "5. Comprobar numero de veces que se repite un porducto en la lista de la compra\n");


        switch (sc.nextInt()) {
            case 0:
                break; //salir

            case 1: // hacer la lista de la compra
                lista = hacer_lista(lista);
                System.out.println("La lista se ha rellenado correctamente");
                menu();
                break;

            case 2: // numero de items que tiene la lista
                if (lista[0] != null) {
                    System.out.println("El numero de items de la lista es: " + lista.length);
                } else System.out.println("Primero debes inicializar el array usando la opcion 1");
                menu();
                break;

            case 3: // te dice cuales son los elementos introducidos en la lista
                if (lista[0] != null) {
                    System.out.println("Los elementos de la lista son; ");
                    imprimir_lista(lista);
                } else System.out.println("Primero debes inicializar el array usando la opcion 1");
                menu();
                break;

            case 4://comprobar si existe elemento y en que posicion de la lista esta
                if (lista[0] != null) ;
                System.out.println("Introduce el elemento que quieres comprobar");
                int[] posiciones = buscar_elemento(lista, sc.next());
                System.out.println("El elemento se encuentra en las posiciones ");
                for (int i = 0; i < posiciones.length; i++) {
                    System.out.println(posiciones[i]);
                }
                menu();
                break;

            case 5: // Comprobar numero de veces que se repite un producto
                System.out.println("Introduce el elemento que quieres contar");
                System.out.println("El elemento esta " + cuantas_veces(lista, sc.next()) + " veces");
                menu();
                break;

            case 6: // Comprobar numero de vocales de un producto
                System.out.println("Introduce el elemento de cuyas vocales quieres conocer");
                String elemento = sc.next();
                int[] contadores;
                if (cuantas_veces(lista, elemento) > 0) {
                    contadores = cuantas_vocales(elemento);
                } else contadores = cuantas_vocales("");
                System.out.println("La palabra " + elemento + " tiene las siguientes vocales\n " +
                        "a --> " + contadores[0] + "\n" +
                        "e --> " + contadores[1] + "\n" +
                        "i --> " + contadores[2] + "\n" +
                        "o --> " + contadores[3] + "\n" +
                        "u --> " + contadores[4]);
                menu();
                break;




            default: System.out.println("El dato untroducido es erroneo, vuelva a intentarlo");
            menu();
            break;
        }
    }

    //metodo imprimir

    private static void imprimir_lista(String[] lista) {
        for (int i=0; i< lista.length; i++){
            System.out.println(lista[i]);

        }
    }

    // metodo 1 para hacer la lista
    private static String[] hacer_lista(String[] lista) {
        for (int i=0; i<lista.length; i++){
            System.out.println("Introduce el elemento nº "+i);
            lista[i] = sc.next();
        }
        return lista;
    }

    // metodo 4 para buscar un elemento
    private static int[] buscar_elemento(String[] lista, String elemento){
        int[] posiciones = new int[0];
        for (int i=0; i< lista.length; i++){
            if (lista[i].equals(elemento)){
                posiciones= Arrays.copyOf(posiciones,posiciones.length+1);
                posiciones[posiciones.length-1]=i;
            }
        }
        return posiciones;
    }

    private static int[] cuantas_veces(String[] lista, String elemento){
        int contador = 0;
        for(int i = 0; i < lista.length; i++){
            if (elemento.equals(lista[i])){
                contador++;
            }
       }
        return contador;
    }

    private static int[] cuantas_vocales(String elemento){
        char[] elementoCharArray = elemento.toCharArray();
        int[] contadores = {0, 0, 0, 0, 0};
        for (int i=0; i< elementoCharArray.length; i++){
            switch (elementoCharArray[i]){
                case 'a': contadores[0]++;break;
                case 'e': contadores[1]++;break;
                case 'i': contadores[2]++;break;
                case 'o': contadores[3]++;break;
                case 'u': contadores[4]++;break;
            }
        }
        return contadores;
    }

}

*/