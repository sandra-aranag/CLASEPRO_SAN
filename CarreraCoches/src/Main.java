import controller.CarreraController;
import model.Coche;
import model.Campeonato;
import controller.CampeonatoController;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Coche> participantes = new ArrayList<>();

        System.out.println("\n=== ¡¡¡BIENVENIDO A LAS CARRERAS DE COCHES MÁS EMOCIONANTES!! ===");

        System.out.print("\n¿Cuántos coches quieres que participen? ");
        int numCoches = scanner.nextInt();
        scanner.nextLine();
        if (numCoches < 3) {
            System.out.println("¡Oh, no! Se necesitan al menos 3 coches para que haya competición :c");
        } else {
            for (int i = 0; i < numCoches; i++) {
                System.out.println("\n––– Datos del Coche " + (i + 1) + " –––");
                System.out.print("Marca: ");
                String marca = scanner.nextLine();
                System.out.print("Modelo: ");
                String modelo = scanner.nextLine();
                System.out.print("Dorsal: ");
                int dorsal = scanner.nextInt();
                scanner.nextLine();
                participantes.add(new Coche(marca, modelo, dorsal));
            }

            System.out.print("\n¿Cuántas carreras quieres que tenga el campeonato?: ");
            int numCarreras = scanner.nextInt();

            System.out.print("¿Cuántos km tendrá cada carrera?: ");
            int kmCarrera = scanner.nextInt();
            Campeonato campeonato = new Campeonato(participantes);
            CampeonatoController gestor = new CampeonatoController();
            gestor.empezarCampeonato(campeonato, numCarreras, kmCarrera);
            CarreraController visualizador = new CarreraController();
            visualizador.mostrarCampeon(participantes.get(0));
        }

        System.out.println("\n¡¡Gracias por participar en las carreras de coches!!");
    }
}