package sesion1710;

public class Ej1Bucles {
    public static void main(String[] args) {

        System.out.println("\033[36m A continuacion vamos a mostrar los numeros multiplos de 5 del 1 al 100 usando el bucle FOR.");
        System.out.println("******************************************************************************************************");

        for (int i=0; i<=100; i=i+5)
        {
            System.out.println("\033[35m"+i);
        }
    }
}
