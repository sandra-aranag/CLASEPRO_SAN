import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        OperacionesFicheros operaciones = new OperacionesFicheros();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime la ruta de origen: ");
        String rutaOrigen = scanner.nextLine();
        System.out.println("Dime la ruta de destino: ");
        String rutaDestino = scanner.nextLine();

        operaciones.leerFicheros(rutaOrigen);
        operaciones.copiarFichero(rutaOrigen, rutaDestino);
    }

}
