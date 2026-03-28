import controller.APIController;
import controller.BibliotecaController;
import controller.FileController;
import model.Libro;


import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        APIController apiController = new APIController();
        BibliotecaController bibliotecaController = new BibliotecaController();
        FileController fileController = new FileController();
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {

            System.out.println("\n–––– BIENVENIDOS A LA BIBLIOTECA DE STEPHEN KING ––––");
            System.out.println("– Menú –");
            System.out.println("1. Importar libros desde API");
            System.out.println("2. Mostrar todos los libros de la biblioteca");
            System.out.println("3. Buscar un libro por ID");
            System.out.println("4. Agregar un libro a favoritos");
            System.out.println("5. Mostrar la lista de favoritos");
            System.out.println("6. Exportar la lista de favoritos a un fichero");
            System.out.println("7. Importar lista de favoritos desde el fichero");
            System.out.println("0. Salir");
            System.out.println("–––––––––––––––––––––––––––––––––––––––––––––––––");
            System.out.println("Selecciona la opción (nº) que deseas realizar: ");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1 -> {
                    List<Libro> librosAPI = apiController.mostrarLibros();
                    for (Libro libro : librosAPI ) {
                        bibliotecaController.agregarLibro(libro);
                    }
                    System.out.println("Se han importado un total de " +librosAPI.size()+ " libros.");
                }

                case 2 -> {
                    List<Libro> todosLibros = bibliotecaController.obtenerLibros();
                    if (todosLibros.isEmpty()){
                        System.out.println("La biblioteca todavía está vacía.");
                    } else {
                        for (Libro libro : todosLibros) {
                            System.out.println(libro);
                            
                        }
                    }
                }

                case 3 -> {
                    System.out.println("Introduce el ID del libro que quieres buscar: ");
                    int id = scanner.nextInt();
                    Libro libroEncontrado = bibliotecaController.obtenerLibros()
                            .stream()
                            .filter(libro -> libro.getId()==id)
                            .findFirst()
                            .orElse(null);
                    if (libroEncontrado != null){
                        System.out.println("Libro encontrado: " +libroEncontrado);
                    }else {
                        System.out.println("ID erróneo, no se ha podido encontrar el libro");
                    }

                }

                case 4 -> {
                    System.out.println("Introduce el ID del libro que quieres guardar en favoritos: ");
                    int id = scanner.nextInt();
                    bibliotecaController.agregarFavorito(id);
                }

                case 5 -> {
                    List<Libro> favoritos = bibliotecaController.obtenerFavoritos();
                    if (favoritos.isEmpty()){
                        System.out.println("Todavía no has guardado ningún libro en favoritos");
                    } else {
                        for (Libro libro : favoritos ) {
                            System.out.println(libro);
                        }
                    }
                }

                case 6 -> {
                    List<Libro> exportarFavoritos = bibliotecaController.obtenerFavoritos();
                    for (Libro libro : exportarFavoritos) {
                        fileController.exportarFavoritos(libro);
                    }
                    System.out.println("Favoritos exportados a fichero con nombre 'favoritos.obj'");
                }

                case 7 ->{
                    List<Libro> importarFavoritos = fileController.importarFavoritos();
                    System.out.println("Favoritos importados del fichero 'favoritos.obj': ");
                    for (Libro libro : importarFavoritos ) {
                        System.out.println(libro);
                    }

                }

                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no valida");


            }


        }while (opcion != 0);

        scanner.close();


    }

}
