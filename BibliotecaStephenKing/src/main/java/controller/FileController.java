package controller;

import model.Libro;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileController {

    File file;
    PrintWriter printWriter;

    public void exportarFavoritos(Libro libro){

        File file = new File("src/main/resources/favoritos.obj");

        try {
            printWriter = new PrintWriter(new FileWriter(file, true));
            printWriter.println(libro);

        } catch (IOException e) {
            System.out.println("La ruta no es válida");
        } finally {
            try {
                printWriter.close();
            } catch (NullPointerException e) {
                System.out.println("Error en el cerrado del fichero");
            }
        }

    }

    public List<Libro> importarFavoritos(){
        List<Libro> favoritos = new ArrayList<>();

        File file = new File("src/main/resources/favoritos.obj");

        if (!file.exists()){
            System.out.println("No hay favoritos guardados todavía.");
            return favoritos;
        }

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            String linea;

            while((linea = bufferedReader.readLine()) != null){
                String[] camposLibro = linea.split(",");
                if(camposLibro.length == 7){
                    Libro libro = new Libro(
                            Integer.parseInt(camposLibro[0]),
                            Integer.parseInt(camposLibro[1]),
                            camposLibro[2],
                            camposLibro[3],
                            camposLibro[4],
                            camposLibro[5],
                            Integer.parseInt(camposLibro[6])
                    );
                    favoritos.add(libro);
                }
            }

        } catch (IOException e) {
            System.out.println("Error en la lectura del fichero");
        } catch (NumberFormatException e){
            System.out.println("Error en el formato de algún número en favoritos.obj");
        }
        return favoritos;
    }


}
