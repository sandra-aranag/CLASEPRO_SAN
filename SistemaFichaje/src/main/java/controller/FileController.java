package controller;

import model.Usuario;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileController {

    private final String fichero = "src/main/java/resources/horas.txt";

    public void fichar(Usuario usuario){
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
        String fechaHora = ahora.format(formato);
        String linea = usuario.getCorreo() + " – " + fechaHora + "\n";

        try(FileWriter fileWriter = new FileWriter(fichero, true)) {

            fileWriter.write(linea);
            System.out.println("Fichaje registrado correctamente en el fichero.");

        } catch (IOException e) {
            System.out.println("Ha habido un error con la escritura del fichero");
        }
    }

    public void leerFicheroFichajes(){
        try {
            Files.lines(Paths.get(fichero)).forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("No se pudo leer el fichero");
        }
    }

}

