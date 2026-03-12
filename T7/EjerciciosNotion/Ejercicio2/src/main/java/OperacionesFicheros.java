import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class OperacionesFicheros {

    public void buscarPalabra(String path, String palabraBuscada){
        File file = new File(path);
        int contador = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

            String linea;

            while ((linea = bufferedReader.readLine()) != null) {

                // Dividimos la línea en palabras
                String[] palabras = linea.split("\\s+");

                // Recorremos el array
                for (String palabra : palabras) {

                    // Eliminamos signos de puntuación simples
                    palabra = palabra.replaceAll("[^a-zA-ZáéíóúÁÉÍÓÚñÑ]", "");

                    // Comparamos ignorando mayúsculas/minúsculas
                    if (palabra.equalsIgnoreCase(palabraBuscada)) {
                        contador++;
                    }
                }
            }

            System.out.println("La palabra \"" + palabraBuscada + "\" aparece " + contador + " veces.");

        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }


    }


}
