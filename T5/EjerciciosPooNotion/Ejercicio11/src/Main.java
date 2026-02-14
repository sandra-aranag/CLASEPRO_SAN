import controller.Prestamo;
import model.Libro;
import model.Usuario;

public class Main {

    public static void main(String[] args) {

        Libro libro1 = new Libro("1984", "George Orwell", "123456");
        Libro libro2 = new Libro("El Quijote", "Cervantes", "789101");

        Usuario usuario1 = new Usuario("Ana Pérez", 1);
        Usuario usuario2 = new Usuario("Luis García", 2);

        Prestamo prestamo1 = new Prestamo(libro1, usuario1, "08/02/2026");
        Prestamo prestamo2 = new Prestamo(libro2, usuario2, "01/02/2026");

        System.out.println(prestamo1.estaPrestado());
        System.out.println(prestamo2.estaPrestado());

        prestamo1.devolverLibro();
        System.out.println("¿Está disponible el primer libro?" + libro1.isDisponible());

    }

}
