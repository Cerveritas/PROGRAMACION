package CosasCasa;

import java.util.Scanner;

public class nose {
    public static void main(String[] args) {

        int numero = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Que numero quieres pasar a binario");
        numero = sc.nextInt();

        String base2 = "";
        while (numero > 0) {
            base2 = (numero % 2) + base2;
            numero /= 2;
        }
        System.out.println(base2);
    }
}








