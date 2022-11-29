package Practica_Programacion_Sergio_CerveraJimenez;

import java.awt.desktop.PreferencesEvent;
import java.util.Scanner;

public class Ejercicio1Recarte {

    private static float[] temperaturas;
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        menu();
    }

    public static void menu(){
        System.out.println("0. - Salir");
        System.out.println("1. - Inicializar un array que recoja la temperatura media de cada mes del año");
        System.out.println("2. - Mostrar el mes (enumerado) con mayor temperatura");
        System.out.println("3. - Mostrar el mes (enumerado) con menor temperatura");
        System.out.println("4. - Imprimir la temperatura del mes introducido (de 1 a 12) por teclado");
        System.out.println("5. - Sacar temperatura media de los meses de verano");
        System.out.println("6. - Sacar temperatura media de los meses de invierno");
        System.out.println("7. - Comparar si temperatura de dos meses (enumerados) introducidos son iguales");

        switch (sc.nextInt()){
            case 0:
                salir();
                break;

            case 1:
                temperaturas=inicializar_array(temperaturas);
                System.out.println("La lista se ha inicializado correctamente");
                menu();
                break;

            case 2:
                System.out.println("La mayor temperatura del año ha sido en "+mayor_temperatura(temperaturas));
                menu();
                break;

            case 3:
                System.out.println("La menor temperatura del año ha sido en "+menor_temperatura(temperaturas));
                menu();
                break;

            case 4:
                System.out.println("Escribe el mes del que que quieres saber la temperatura");
                int mes = sc.nextInt();
                System.out.println("La temperatura media fue de: "+sacar_temperatura(mes, temperaturas));
                menu();
                break;

            case 5:
                System.out.println("La temperatura media de verano es: "+sacar_temperatura_media_verano(temperaturas));
                menu();
                break;

            case 6:
                System.out.println("La temperatura media de invierno es: "+sacar_temperatura_media_invierno(temperaturas));
                menu();
                break;

            case 7:
                System.out.println("Introduce el primer mes que quieres comparar: ");
                    meses mes2 = meses.valueOf(sc.next().toUpperCase());
                System.out.println("Introduce el segundo mes que quieres comparar:");
                    meses mes1 = meses.valueOf(sc.next().toUpperCase());
                if (comparar_temperaturas(mes1, mes2, temperaturas) == true){
                    System.out.println("Los meses comparados tienen la misma temperatura");
                }else{
                    System.out.println("Los meses comparados tienen distinta temperatura");
                }
                menu();
                break;

            default: System.out.println("El dato introducido es erroneo, vuelvalo a intentar");
            menu();
            break;
        }
    }

        // METODO 0 --> SALIR
    public static void salir(){
        System.out.println("Saliendo del programa...");
    }

        // METODO 1 --> INICIALIZAR EL ARRAY
    public static float[] inicializar_array(float[] temperaturas){
        temperaturas=new float[12];

        for(int i=0; i<12; i++){
            System.out.println("Introduce la temperatura media de "+sacar_mes(i));
            temperaturas[i]=sc.nextFloat();
        }
        return temperaturas;
    }

        // METODO 2 --> SACAR LA MAYOR TEMPERATURA
    public static meses mayor_temperatura(float[] temperaturas){
        float mayorTemp = temperaturas[0];
        int mes=0;
        for(int i=0; i<12; i++){
            if(mayorTemp < temperaturas[i]){
                mayorTemp = temperaturas[i];
                mes=i;
            }
        }
        return sacar_mes(mes);
    }

        // METODO 3 --> SACAR LA MENOR TEMPERATURA
    public static meses menor_temperatura(float[] temperaturas){
        float menorTemp=temperaturas[0];
        int mes=0;
        for(int i=0; i<12; i++){
            if(menorTemp>temperaturas[i]){
                menorTemp = temperaturas[i];
                mes=i;
            }
        }
        return sacar_mes(mes);
    }

        // METODO 4 --> SACAR LA TEMPERATURA DEL MES ELEGIDO
    public static float sacar_temperatura(int mes, float[] temperaturas){
        return temperaturas[mes];

    }

        // METODO 5 --> SACAR LA TEMPERATURA MEDIA DE VERANO
    public static float sacar_temperatura_media_verano(float[] temperaturas){
        return (temperaturas[6]+temperaturas[7]+temperaturas[8]/3);
    }

        // METODO 6 --> SACAR LA TEMPERATURA MEDIA DE INVIERNO
    public static float sacar_temperatura_media_invierno(float[] temperaturas){
        return (temperaturas[0]+temperaturas[1]+temperaturas[2]/3);
    }

        // METODO 7 --> COMPARACION DE TEMPERATURAS DE DOS MESES
    public static boolean comparar_temperaturas(meses mes1, meses mes2, float[] temperaturas){
        if(temperaturas[sacar_indice(mes1)] == temperaturas[sacar_indice(mes2)]){
            return true;
        }else{
            return false;
        }
    }




    // METODOS AUXILIARES
    public static int sacar_indice (meses mes){
        int indice = -1;
        for(int i=0; i<meses.values().length; i++){
            if(mes.equals(meses.values()[i])){
                indice = i;
            }
        }
        return indice;
    }

    public static meses sacar_mes (int i){
        return meses.values()[i];
    }

}
