public class Main {

    public static void main(String[] args) {
        Operaciones operaciones = new Operaciones();
        String ruta = "src/main/java/ficheros/estudiantes.csv";
        operaciones.crearCSV(ruta);
        System.out.println("Contenido: ");
        operaciones.leerCSV(ruta);
    }

}
