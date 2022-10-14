package sesion1310;

import java.util.Scanner;

public class EjercicioGeneraciones {

    public static void main(String[] args) {

        int año=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica de que año eres y te dire a que generacion pertences");
        año=sc.nextInt();

        if (año>=1994 && año<=2010 )
        {
            System.out.println("Generacion Z");
        }

         while (año>=1981 && año<=1993)
        {
            System.out.println("Generacion Y");
            {break;}
        }
         while (año>=1969 && año<=1980)
        {
            System.out.println("Generacion X");
            {break;}
        }




    }

}
