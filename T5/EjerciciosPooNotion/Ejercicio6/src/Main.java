public class Main {

    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Laura Fernández", 20, 8.5);
        estudiante1.mostrarDatos();

        estudiante1.setNota(1);
        System.out.println("Nota actual: " + estudiante1.getNota());
        System.out.println();

    }

}
