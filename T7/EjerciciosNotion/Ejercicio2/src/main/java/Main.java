import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        OperacionesFicheros operaciones = new OperacionesFicheros();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la ruta del archivo: ");
        String ruta = scanner.nextLine();
        System.out.println("Introduce la palabra a buscar: ");
        String palabraBuscada = scanner.nextLine();
        operaciones.buscarPalabra(ruta, palabraBuscada);

    }

}
