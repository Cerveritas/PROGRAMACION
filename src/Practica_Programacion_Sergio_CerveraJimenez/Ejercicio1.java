package Practica_Programacion_Sergio_CerveraJimenez;

import java.util.Scanner;
public class Ejercicio1 {

    private static float[] tempMes = new float[11];
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

                                                                                                                        System.out.println(" ");

        System.out.println("Recuerda (SIN HACER PRIMERO LA OPCION 1 NO PODRAS REALIZAR LAS DEMAS)");
        System.out.println("INDICA QUE ES LO QUE QUIERES HACER:");


        numero = st.nextInt();
        float [] array_madrid = new float[12];



        switch (numero)
        {
            case 0:System.out.println("El programa ha finalizado");break;
            case 1: array_madrid=inicializar_array(array_madrid);break;
            case 2: //array_madrid=mayor_temperatura(array_madrid);break;
            case 3: //menor_temperatura()
            case 4: //sacar_temperatura()
            case 5: //temp_media_verano()
            case 6: //temp_media_invierno()
            case 7: //array_madrid=comparar
            default:System.out.println("Ha introducido un valor incorrecto");break;
        }
    }

    //metodo1
    public static float[] inicializar_array(float[] temperaturas) {

        System.out.println("Lo primero que haremos sera meter los datos de la temperatura de cada mes");
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la temperatura del mes de "+meses.ENERO);
        temperaturas[0]=sc.nextFloat();

        System.out.println("Introduce la temperatura del mes de ;"+meses.FEBRERO);
        temperaturas[1]=sc.nextFloat();

        System.out.println("Introduce la temperatura del mes de ;"+meses.MARZO);
        temperaturas[2]=sc.nextFloat();

        System.out.println("Introduce la temperatura del mes de ;"+meses.ABRIL);
        temperaturas[3]=sc.nextFloat();

        System.out.println("Introduce la temperatura del mes de ;"+meses.MAYO);
        temperaturas[4]=sc.nextFloat();

        System.out.println("Introduce la temperatura del mes de ;"+meses.JUNIO);
        temperaturas[5]=sc.nextFloat();

        System.out.println("Introduce la temperatura del mes de ;"+meses.JULIO);
        temperaturas[6]=sc.nextFloat();

        System.out.println("Introduce la temperatura del mes de ;"+meses.AGOSTO);
        temperaturas[7]=sc.nextFloat();

        System.out.println("Introduce la temperatura del mes de ;"+meses.SEPTIEMBRE);
        temperaturas[8]=sc.nextFloat();

        System.out.println("Introduce la temperatura del mes de ;"+meses.OCTUBRE);
        temperaturas[9]=sc.nextFloat();

        System.out.println("Introduce la temperatura del mes de ;"+meses.NOVIEMBRE);
        temperaturas[10]=sc.nextFloat();

        System.out.println("Introduce la temperatura del mes de ;"+meses.DICIEMBRE);
        temperaturas[11]=sc.nextFloat();

                                                                                                                        System.out.println(" ");
                                                                                                                        System.out.println(" ");

        System.out.println("EL ARRAY CON SUS DEBIDAS TEMPERATURAS ES:");
                                                                                                                        System.out.println(" ");

        for (int i=0; i<temperaturas.length; i++) {
            System.out.println(temperaturas[i]);
        }
        System.out.println(" ");
        menu();
        return null;
    }




    // metodo2
   // public static float[] mayor_temperatura(float[] temperaturas){

     //   float maxNum = tempMes[0];

      //  for (float j : tempMes) {
      //      if (j > maxNum)
             //   maxNum = j;
      //  }

      //  System.out.println("Maximum number = " + maxNum);

       // return null;
    //}










    ////metodo3
    //public static meses menor_temperatura(float[] temperaturas){

    //}

    //metodo4   SACAR TEMPERATURA DEL MES INTRODUCIDO POR TECLADO
   // public static float sacar_temperatura(int mes, float[] temperaturas){

        //int mes=0;
     //   Scanner sc = new Scanner(System.in);
       // System.out.println("Indica el mes del que quieres sacar la temperatura");
        //mes=sc.nextInt();


       // System.out.println(meses.ABRIL);
       // menu();

       // return 0;
   // }

    /*//metodo5
    public static float temp_media_verano(float[] temperaturas){

    }

    //metodo6
    public static float temp_media_invierno(float[] temperaturas){

    }
*/
    //metodo7
    private static boolean comparar(meses valor1, meses valor2, float[] temperaturas_madrid){

        Scanner sc = new Scanner(System.in);


        if (tempMes.equals(meses.ABRIL))
        System.out.println("IGUALES");
        else
        System.out.println("NO IGUALES");


        return false;
    }

 /*   //metodo auxiliar 1
    //metodo auxiliar 2

*/






}

