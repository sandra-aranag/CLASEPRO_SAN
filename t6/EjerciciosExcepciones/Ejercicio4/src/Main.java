import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Crea una clase EdadInvalidaException que herede de Exception. Crea un metodo validarEdad(int edad)
        que lance esta excepción si la edad es menor que 0 o mayor que 120. En el metodo main,
        pide al usuario su edad y usa try-catch para capturar y manejar la excepción personalizada
        */

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Dime un edad");
            int edad = scanner.nextInt();

            EdadInvalidaException.validarEdad(edad);
            System.out.println("Edad válida: " + edad);

        } catch (EdadInvalidaException e){
            System.out.println(e.getMessage());
        }
    }

}
