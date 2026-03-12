import java.io.*;

public class OperacionesFicheros {

    public void contadorLineas(String path){
        File file = new File(path);
        BufferedReader bufferedReader = null;
        int contador=0;

        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            String linea = null;
            while ((linea = bufferedReader.readLine())!=null){
                contador++;
            }

            System.out.println("El archivo tiene un total de " +contador+ " líneas.");

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error en la lectura");
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.out.println("Error al cerrar el fichero origen");
                }
            }
        }


    }

}
