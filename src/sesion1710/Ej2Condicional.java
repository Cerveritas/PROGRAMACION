package sesion1710;

public class Ej2Condicional {

    public static void main(String[] args) {

        //no se llega a ejecutar por la readline(), no quiero hacerlo con numeros


            String dia;
            System.out.println("\033[36 Elige un dia de la semana");
            System.out.println("Y te dire que te toca a primera.");
            dia = System.console().readLine();
            dia = dia.toLowerCase();

            switch (dia)
            {
                case "lunes":
                    System.out.println("\033[35m Base De Datos");
                case "martes":
                    System.out.println("\033[35m Lenguaje De Marcas");
                case "miercoles":
                    System.out.println("\033[35m Programacion");
                case "jueves":
                    System.out.println("\033[35m Base De Datos");
                case "viernes":
                    System.out.println("\033[35m Fol");
                case "sabado":
                    System.out.println("\033[35m Aqui empieza el fin de semanaaa!!!!");
                case "domingo":
                    System.out.println("\033[35m A descansar y coger fuerzas para mañana");
                default: System.out.println("\033[31m ESE ES UN VALOR INCORRECTO!!!");
            }
        }
    }



