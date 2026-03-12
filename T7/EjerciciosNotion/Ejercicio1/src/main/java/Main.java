import java.util.Scanner;

public class Main {


    /*Escribe un programa que lea el contenido de un archivo de texto existente y lo muestre por consola.
    El programa debe solicitar al usuario la ruta del archivo a leer.*/

    public static void main(String[] args) {
        OperacionesFicheros operaciones = new OperacionesFicheros();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la ruta del archivo:");
        String ruta = scanner.nextLine();
        operaciones.leerFichero(ruta);
    }


}
