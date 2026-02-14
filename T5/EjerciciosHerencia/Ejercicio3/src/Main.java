public class Main {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Sandra", 30, "1º DAM");
        Estudiante estudiante2 = new Estudiante("Kurtis", 1, "Universidad de la calle.");
        estudiante1.presentarse();
        estudiante1.estudiar();
        estudiante2.presentarse();
        estudiante2.estudiar();

    }

}
