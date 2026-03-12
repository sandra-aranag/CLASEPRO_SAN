import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*Crea un programa que pida al usuario que introduzca un número como texto y lo convierta a entero usando
        Integer.parseInt(). Usa try-catch para capturar la excepción NumberFormatException si el usuario introduce
        algo que no es un número válido. El programa debe seguir pidiendo un número hasta que el usuario
        introduzca uno válido.*/

        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        boolean valido = false;

        while(!valido){
            System.out.println("Introduce el número: ");
            String entrada = scanner.nextLine();

            try{
                numero=Integer.parseInt(entrada);
                valido = true;
            } catch (NumberFormatException e){
                System.out.println("El NÚMERO no es válido.");
            }
        }

        System.out.println("¡Bien! Has introducido el número " +numero);


    }

}
