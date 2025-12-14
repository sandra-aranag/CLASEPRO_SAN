import model.Persona;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el nombre: ");
        String nombre = scanner.next();
        System.out.println("Dime el apellido: ");
        String apellido = scanner.next();
        System.out.println("Dime el DNI: ");
        String dni = scanner.next();
        System.out.println("Dime la edad: ");
        int edad = scanner.nextInt();
        System.out.println("Dime el peso: ");
        double peso = scanner.nextDouble();
        System.out.println("Dime la altura: ");
        int altura = scanner.nextInt();

        Persona p1 = new Persona(nombre, apellido, dni, edad, altura, peso);
        Persona p2 = new Persona("Marta", "Hernandez");
        Persona p3 = new Persona();


        //cambiar edad a 20
        p1.setEdad(20);
        p2.setEdad(20);
        p3.setEdad(20);

        System.out.println("----- PERSONA 1 -----");
        p1.mostrarDatos();

        System.out.println("----- PERSONA 2 -----");
        p2.mostrarDatos();

        System.out.println("----- PERSONA 3 -----");
        p3.mostrarDatos();

        scanner.close();
    }

}
