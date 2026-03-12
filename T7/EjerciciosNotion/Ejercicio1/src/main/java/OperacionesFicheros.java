import java.io.*;

public class OperacionesFicheros {

    public void leerFichero(String path) {

        File file = new File(path);

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

            String linea;

            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        } catch (IOException e) {
            System.out.println("Fallo en la lectura");
        }
    }


}
