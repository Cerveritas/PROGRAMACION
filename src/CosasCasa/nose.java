package CosasCasa;

public class nose {
    public static void main(String[] args) {

        int puntuacion=67;

        if(puntuacion<1000) {

            System.out.print("Debes aprender a jugar mejor, solo tienes " + puntuacion + " puntos.");

        }

        else if(puntuacion<35000) {

            System.out.print("No está mal, has sacado " + puntuacion + " puntos.");

        }

        else if(puntuacion<75000) {

            System.out.print("Eres un pro, has sacado " + puntuacion + " puntos.");

        }

        else {

            System.out.print("¡GENIO! ¿No serás un robot?");

        }

    }

}

















