public class Main {

    public static void main(String[] args) {
        /*Crea tres objetos usando cada
    constructor y muestra sus datos.*/

        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez");
        Libro libro2 = new Libro("Hot Wax", "M.L Rio", 340);
        Libro libro3 = new Libro();

        System.out.println("Libro 1: ");
        libro1.mostrarDatos();
        System.out.println("\nLibro 2: ");
        libro2.mostrarDatos();
        System.out.println("\nLibro 3: ");
        libro3.mostrarDatos();

    }

}
