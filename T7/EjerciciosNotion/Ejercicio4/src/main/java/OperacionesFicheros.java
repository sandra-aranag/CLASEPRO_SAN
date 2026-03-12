import java.io.File;
import java.text.SimpleDateFormat;

public class OperacionesFicheros {

    public void leerDatosFichero(String path){
        File file = new File(path);

        long tamanio = file.length();

        // Última modificación
        long ultimaMod = file.lastModified();
        // Convertir a fecha legible
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println("– Tamaño: "+tamanio+ " bytes");
        System.out.println("– Última modificación: " +sdf.format(ultimaMod));
        System.out.println("– Permisos: Lectura" +"("+(file.canRead() ? "sí" : "no")+")" +
                "Escritura" +"("+(file.canWrite() ? "sí" : "no")+")" + "Ejecución" +"("+(file.canExecute() ? "sí" : "no")+")" );
        System.out.println("– Archivo oculto: " + (file.isHidden() ? "sí" : "no"));
        System.out.println("– Ruta absoluta: " +file.getAbsolutePath());

    }

}
