import controller.GestorFicheros;

public class Main {

    public static void main(String[] args) {

        GestorFicheros gestor = new GestorFicheros();
        //gestor.crearFichero("src/main/java/resources/escritura.txt");
        //gestor.crearCarpeta("src/main/java/resources/cosa/ejemplo");
        //gestor.lectorFichero("src/main/java/resources/lectura.txt");
        //gestor.lectorLineas("src/main/java/resources/lectura.txt");
        //gestor.escribirCaracteres("src/main/java/resources/escritura.txt");
        //gestor.escribirLineas("src/main/java/resources/escritura.txt");
        gestor.descifrarMensaje("src/main/java/resources/escritura.txt");


    }

}
