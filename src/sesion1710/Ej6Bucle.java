package sesion1710;

public class Ej6Bucle {
    public static void main(String[] args) {

        System.out.println("\033[36m A continuacion mostraremos los numeros del 320 al 160");
        System.out.println(" contando de 20 en 20 hacia atras con el bucle WHILE.");
        System.out.println("********************************************************");

        int i = 320;

        do
        {
            System.out.println(i);
            i-=20;
        }while (i>=160);
    }
}
