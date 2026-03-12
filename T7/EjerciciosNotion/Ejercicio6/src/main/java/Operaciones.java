import java.io.*;

public class Operaciones {

    public void crearCSV(String path){
        File file = new File(path);
        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter(path));
            writer.write("Nombre,Edad,Calificación");
            writer.newLine();
            writer.write("Ana García,20,8.5");
            writer.newLine();
            writer.write("Carlos Martín,19,7.2");
            writer.newLine();
            writer.write("Laura Pérez,21,9.3");

        } catch (IOException e) {
            System.out.println("Fichero no encontrado");
        } finally {
            try {
                writer.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("ERROR EN EL CERRADO");
            }
        }
        System.out.println("Archivo creado correctamente");
    }

    public void leerCSV(String path){
        File file = new File(path);
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(path));
            String linea;
            while ((linea = reader.readLine()) != null){
                System.out.println(linea);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error");
        } finally {
            try {
                reader.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error en el cerrado");
            }
        }
    }

}
