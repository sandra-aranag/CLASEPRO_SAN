import java.io.*;

public class OperacionesFichero {

    //obener datos de un fichero
    public void leerDatosFichero(){
        File file = new File("src/main/java/resources/ficheros/texto.txt");
        System.out.println("Existe "+file.exists());
        System.out.println("Tamaño "+file.length());
        System.out.println("Es fichero "+file.isFile());
        System.out.println("Ruta absoluta "+file.getAbsolutePath());
    }

    public void leerHijos(String path){
        File file = new File(path);
        //listado recursivo
        for (File s : file.listFiles()) {
            System.out.println(s);
            if (s.isDirectory()){
                leerHijos(s.getAbsolutePath());
            }
        }
    }

    public void crearFicheros(String path)  {
        File file = new File(path+"/propio.txt");

            try{
                file.createNewFile();
            }catch (IOException e){
                System.out.println("Fallo");
                System.out.println(e.getMessage());
            }

    }

    public void crearDirectorio(String path){
        File file = new File(path+"/ejemplo/cosa");
        if (!file.exists()){
            file.mkdirs();
        }
    }

    public void lecturaASCII(String path){
        File file = new File(path);
        FileReader reader = null;
        try {
            reader = new FileReader(file);
            int codigo = -1;
            while ((codigo = reader.read())!= -1){
                System.out.println((char)codigo);
            }
            System.out.println(codigo);
        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra la ruta a leer");
        } catch (IOException e){
            System.out.println("Erroro al leer");
        } finally{
            try {
                reader.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error ene l cerrado");
            }
        }
    }

    public void lecturaLinea(String path){
        File file = new File(path);
        FileReader fileReader=null;
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String linea = null;
            while((linea = bufferedReader.readLine())!=null){
                System.out.println(linea);
            }


        } catch (FileNotFoundException e) {
            System.out.println("Error en la lectura de la ruta");
        } catch (IOException e){
            System.out.println("Error. Estás en modo lectura");
        }
        finally {
            try {
                bufferedReader.close();
            } catch (IOException | NullPointerException e) {
                throw new RuntimeException(e);
            }
        }




    }

    public void lectorCodigos(String path){
        File file = new File(path);
        BufferedReader bufferedReader = null;

        try{
            bufferedReader = new BufferedReader(new FileReader(file));
            String linea = bufferedReader.readLine();
            String[] codigos = linea.split("");
            for (String codigo : codigos) {
                int numero = Integer.parseInt(codigo);
                System.out.print((char) numero);
            }
        }catch (FileNotFoundException E){
            System.out.println("Fihero no encontrado");
        }catch (IOException e){
            System.out.println("Fallo en la lectura");
        } finally {
            try{
                bufferedReader.close();
            }catch (IOException | NullPointerException e){
                System.out.println("Error de cifrado");
            }
        }
    }

}
