package Practica_Programacion_Sergio_CerveraJimenez;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2Recarte {
    private static String[] lista;
    private static Scanner sc;

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        System.out.println("Introduzca el tamaño de la lista");
        lista = new String[sc.nextInt()];
        menu();

    }
        public static void menu() {
            System.out.println("Introduca una opcion");
            System.out.println("0 - SAlir");
            System.out.println("1 - Hacer lista de la compra");
            System.out.println("2 - Numrero de items de la compra");
            System.out.println("3 - Imprimir lista de la compra");
            System.out.println("4 - Comprobar si existe elemento y en que posicion de la lista esta");
            System.out.println("5 - Compobar numero de veces que se repite un elemento de la lisa de la compra introducido");
            System.out.println("6 - Numero de vocales en un producto intoducido por teclado");
            System.out.println("7 - Eliminar el producto de la lista introducido por teclado");
            System.out.println("8 - Introducir un nuevo elemento en la lista");

            switch (sc.nextInt()) {
                case 0:
                    salir();
                    break;

                case 1:
                    lista = hacer_lista(lista);
                    System.out.println("La lista se ha rellenado coreectamente");
                    menu();
                    break;

                case 2:
                    System.out.println("El numero de items de la lista es " + lista.length);
                    System.out.println("El numero de items de la lista es: " + tamaño_lista(lista));
                    menu();
                    break;

                case 3:
                    System.out.println("Los elementos de la lista son: ");
                    imprimirLista(lista);
                    menu();
                    break;

                case 4:
                    System.out.println("Introduce el elemento que quieres comprobar");
                    int[] posiciones = buscar_elemento(lista, sc.next());
                    System.out.println("El elemento se encuentra en las posiciones ");
                    for (int i = 0; i < posiciones.length; i++) {
                        System.out.println(posiciones[i]);
                        if (i != posiciones.length - 1) {
                            System.out.println(", ");
                        }
                    }
                    menu();
                    break;

                case 5:
                    System.out.println("Introduce el elemento que quieres contat");
                    System.out.println("El elemento es " + cuantas_veces(lista, sc.next()) + " veces");
                    menu();
                    break;

                case 6:
                    System.out.println("Introduce el elemento de cuyas vocales quieres conocer");
                    String elemento = sc.next();
                    int[] contadores;
                    if (cuantas_veces(lista, elemento) > 0) {
                        contadores = cuantas_vocales(elemento);
                    } else contadores = cuantas_vocales("");
                    System.out.println("La palabra " + elemento + " tiene las siguientess vocales: ");
                    System.out.println("a --> " + contadores[0]);
                    System.out.println("e --> " + contadores[1]);
                    System.out.println("i --> " + contadores[2]);
                    System.out.println("o --> " + contadores[3]);
                    System.out.println("u --> " + contadores[4]);
                    menu();
                    break;

                case 7:
                    System.out.println("Introduce el elemento que quieres eliminar");
                    lista = eliminar_elemento(lista, sc.next());
                    System.out.println("La nueva lista es: ");
                    imprimirLista(lista);
                    menu();
                    break;

                case 8:
                    System.out.println("Introduce el elemento que quieres añadir");
                    lista = añadir_elememto(lista, sc.next());
                    System.out.println("La nueva lista es: ");
                    imprimirLista(lista);
                    menu();
                    break;

                default:
                    System.out.println("EL numero introducido es incorrecto, vuelva a intentarlo");
                    menu();
                    break;
            }
        }




    public static void salir(){
        System.out.println("Saliendo del programa");
    }

    public static String[] hacer_lista(String[]lista){
        for(int i=0; i<lista.length; i++){
            System.out.println("Introduce el elemento nº "+i);
            lista[i] = sc.next();
        }
        return lista;
    }

    public static int tamaño_lista(String[]lista){
        return lista.length;
    }

    public static int[] buscar_elemento(String[]lista, String elemento){
        int[] posiciones  = new int[0];
        for (int i = 0; i<lista.length; i++){
            if(lista[i].equals(elemento)){
                posiciones = Arrays.copyOf(posiciones, posiciones.length+1);
                posiciones[posiciones.length-1] = i;
            }
        }
        return posiciones;
    }

    public static int cuantas_veces(String[]lista, String elemento){
        int contador = 0;
        for (int i = 0; i<lista.length; i++){
            if(elemento.equals(lista[i])){
                contador++;
            }
        }
        return contador;
    }

    public static int[] cuantas_vocales(String elemento){
        char[] elementoCharArray = elemento.toCharArray();
        int[]contadores = {0, 0, 0, 0, 0};
        for (int i = 0; i<elementoCharArray.length; i++){
            switch (elementoCharArray[i]){
                case 'a':
                    contadores[0]++;
                    break;
                case 'e':
                    contadores[1]++;
                    break;
                case 'i':
                    contadores[2]++;
                    break;
                case 'o':
                    contadores[3]++;
                    break;
                case 'u':
                    contadores[4]++;
                    break;


            }
        }
        return contadores;
    }

    public static String[] eliminar_elemento(String[]lista, String elemento) {
        String[] lista_resultado = new String[lista.length - cuantas_veces(lista, elemento)];
        int j = 0;
        for (int i = 0; i < lista.length; i++) {
            if (!lista[i].equals(elemento)) {
                if (!lista[i].equals(elemento)) {
                    lista_resultado[j] = lista[i];
                    j++;
                }
            }

        }
        System.out.println("La nueva lista es: ");
        imprimirLista(lista_resultado);
        return lista_resultado;
    }

    public static String[] añadir_elememto(String[]lista, String elemento) {
            lista = Arrays.copyOf(lista, lista.length);
            lista[lista.length - 1] = elemento;
            System.out.println("La nueva lista es: ");
            imprimirLista(lista);
            return lista;
        }







    public static void imprimirLista(String[]lista) {
        for (int i=0; i<lista.length; i++){
            System.out.println(lista[i]);
            if(i != lista.length-1) {
                System.out.println(", ");
            }
        }
    }
}
