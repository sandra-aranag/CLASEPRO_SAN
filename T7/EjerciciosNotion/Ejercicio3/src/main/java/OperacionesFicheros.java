import java.io.*;

public class OperacionesFicheros {

    public void leerFicheros(String path){
        File file = new File(path);
        BufferedReader bufferedReader = null;

            try {
                bufferedReader = new BufferedReader(new FileReader(file));
                String linea;
                while ((linea = bufferedReader.readLine()) != null){
                    System.out.println(linea);
                }
            } catch (FileNotFoundException e) {
                System.out.println("Error al escribir en el fichero");
            } catch (IOException e) {
                System.out.println("Fallo en la lectura");
            } finally {
                try {
                    bufferedReader.close();
                } catch (IOException | NullPointerException e) {
                    System.out.println("Error en el cerrado");
                }
            }
        }

        public void escribirFichero(String path, String contenido){
            File file = new File(path);
            BufferedWriter bufferedWriter = null;

            try {
                bufferedWriter = new BufferedWriter(new FileWriter(file));
                bufferedWriter.write(contenido);
                bufferedWriter.newLine();


            } catch (IOException e) {
                System.out.println("Fichero no encontrado");
            } finally {
                if (bufferedWriter != null) {
                    try {
                        bufferedWriter.close();
                    } catch (IOException e) {
                        System.out.println("Error al cerrar el fichero");
                    }
                }
            }
        }

        public void copiarFichero(String rutaOrigen, String rutaDestino){
            BufferedReader bufferedReader = null;
            BufferedWriter bufferedWriter = null;

            try {
                bufferedReader = new BufferedReader(new FileReader(rutaOrigen));
                bufferedWriter = new BufferedWriter(new FileWriter(rutaDestino));

                String linea;
                while((linea= bufferedReader.readLine()) !=null){
                    bufferedWriter.write(linea);
                    bufferedWriter.newLine();
                }
                System.out.println("Archivo copiado correctamente");
            } catch (FileNotFoundException e) {
                System.out.println("Archivo no encontrado");
            } catch (IOException e) {
                System.out.println("Fallo en la lectura");
            } finally {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e) {
                        System.out.println("Error al cerrar el fichero origen");
                    }
                }
                if (bufferedWriter != null) {
                    try {
                        bufferedWriter.close();
                    } catch (IOException e) {
                        System.out.println("Error al cerrar el fichero destino");
                    }
                }
            }

        }





    }


