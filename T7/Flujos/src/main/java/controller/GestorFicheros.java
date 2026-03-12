package controller;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GestorFicheros {

    public void crearFichero(String path){
        //src/main/java/resources/escritura.txt
        File file = new File(path);
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Error en la creación del fichero");
            e.getMessage();
        }
    }

    public void crearCarpeta(String path) {
        //src/main/java/resources/ejemplo
        File file = new File(path);
        file.mkdirs();

    }

    public void informacionFicheros(String path) {
        //src/main/java/resources/ejemplo
        File file = new File(path);
        file.list();

    }

    public void lectorFichero(String path){
        //src/main/java/resources/lectura.txt
        File file = new File(path);
        FileReader reader=null; //IMPORTANTE EN NULO PARA PODER CERRARLO.
        try {
            reader = new FileReader(file);
            //leer de forma normal
            int codigo;
            while((codigo= reader.read())!=-1){
                System.out.print((char) codigo);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error, el fichero no existe.");
            //Indícame la ruta del fichero  nuevamente
            lectorFichero("Nueva ruta");
        } catch (IOException e) {
            System.out.println("Error en la lectura del fichero");
        }
        finally{
            try {
                reader.close();
            } catch (Exception e) {
                System.out.println("Error en el cerrado");
            }
        }


    }

    public void lectorLineas(String path){
        //src/main/java/resources/lectura.txt
        File file = new File(path);
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String linea = null;
            while ((linea = bufferedReader.readLine())!=null){
                System.out.println(linea);
            }

        } catch (FileNotFoundException e) {
            System.out.println("El fichero no existe");

        } catch (Exception e) {
            System.out.println("ERROR EN LA LECTURA");
        } finally {
            try {
                bufferedReader.close();
            } catch (Exception e) {
                System.out.println("Error en el cerrado");
            }
        }

    }

    public void escribirCaracteres(String path){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime qué mensaje quieres guardar");
        String mensaje = scanner.nextLine();
        File file = new File(path);
        FileWriter writer = null;

        try {
            writer = new FileWriter(file, true);
            for (int i = 0; i < mensaje.length(); i++) {
                char letra = mensaje.charAt(i);
                writer.write(String.valueOf((int)letra));
                writer.write(" ");
            }
        } catch (IOException e) {
            System.out.println("Error en la escritura");
        } finally {
            try {
                writer.close();
            } catch (Exception e) {
                System.out.println("Error en el cerrado");
            }
        }

    }

    public void escribirLineas(String path){
        File file = new File(path);
       // BufferedWriter bufferedWriter;

        //ESTA NO REQUIERE DE DE EXCEPCION, AUNQUE ES RECOMENDABLE TRATARLA
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(new FileWriter(file, true));
            printWriter.println("Esta linea es un ejemplo de la nueva forma de escribir");
            printWriter.println("Ahora sé cómo hacer la escritura de forma conjunta");
        } catch (IOException e) {
            System.out.println("ERROR EN LA ESCRITURA");
        } finally{
            try{
                printWriter.close();
            } catch (Exception e) {
                System.out.println("Error en el cerrado");
            }
        }

    }

    public void codificarMensaje(String path){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime qué mensaje quieres codificar");
        String mensaje = scanner.nextLine();
        scanner = new Scanner(System.in);
        System.out.println("Dime la fase de cifrado");
        int fase = scanner.nextInt();
        File file = new File(path);
        FileWriter writer = null;

        try {
            writer = new FileWriter(file, false);
            for (int i = 0; i < mensaje.length(); i++) {
                char letra = mensaje.charAt(i);
                writer.write(String.valueOf(((int)letra)*fase));
                writer.write(" ");
            }
        } catch (IOException e) {
            System.out.println("Error en la escritura");
        } finally {
            try {
                writer.close();
            } catch (Exception e) {
                System.out.println("Error en el cerrado");
            }
        }

    }

    public void descifrarMensaje(String path){
        File file = new File(path);
        BufferedReader bufferedReader = null;
        Scanner scanner = new Scanner(System.in);
        try {
        System.out.println("Dime cuál es la fase de codificación");
        int fase = scanner.nextInt();


            bufferedReader = new BufferedReader(new FileReader(file));
            String linea = bufferedReader.readLine();
            String[] codigos = linea.split(" ");
            for (String code : codigos) {
                int numero = Integer.parseInt(code)/fase;
                System.out.print((char) numero);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        } catch (IOException e) {
            System.out.println("No hay permisos de lectura");
        } catch (InputMismatchException e){
            System.out.println("La fase es incorrecta. Por favor empieza el proceso nuevamente");
            descifrarMensaje(path);
        }
        finally {
            try {
                bufferedReader.close();
            } catch (Exception e) {

                System.out.println("Error en el cerrado");
                System.out.println(e.getMessage());

            }
        }


    }
}
