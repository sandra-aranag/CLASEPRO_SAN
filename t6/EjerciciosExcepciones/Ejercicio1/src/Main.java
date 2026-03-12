import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*Crea un programa que pida al usuario dos números y realice la división del primero entre el segundo.
        Usa try-catch para capturar la excepción ArithmeticException que ocurre cuando se intenta dividir por cero.
         Muestra un mensaje apropiado si ocurre el error.*/

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Introduce el número 1: ");
            int op1 = scanner.nextInt();
            System.out.println("Introduce el número 2: ");
            int op2 = scanner.nextInt();

            System.out.println("Calculamos...");
            int div = op1 / op2;
            System.out.println("El resultado es: " +div);

        } catch (ArithmeticException e) {

            System.out.println(e.getMessage());
            System.out.println("No se puede dividir entre 0");
        }

    }


}
