package sesion1411;

public class UsoDeArrayFill {
    public static void main(String[] args) {

        int[] numeros = new int[6];

        java.util.Arrays.fill(numeros, 5);
        System.out.println(java.util.Arrays.toString(numeros));

        java.util.Arrays.fill(numeros, 2, 4, 8);
        System.out.println(java.util.Arrays.toString(numeros));
    }
}
