import model.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bienvenido al gestor escolar");

        Fijo fijo1 = new Fijo("Profesor1", "Apellido1", 10000, 30000, 300);
        Fijo fijo2 = new Fijo("Profesor2", "Apellido2", 20000);

        fijo1.mostrarDatos();

        Director director1 = new Director("Seymour", "Skinner");
        Persona director = new Director("Director", "Prieto"); //esto es polimorfismo
        director1.saludar();
        director1.mandarMensaje();
        director1.mostrarDatos();
        //director1.realizarInspeccion(2);

        //ESTO ES POLIMORFISMO
        ArrayList<Persona> lista = new ArrayList<>();
        lista.add(fijo2);
        lista.add(director);

        for (Persona persona : lista) {
            if (persona instanceof Inspector){
                ((Inspector) persona).realizarInspeccion(6);
            }

        }

      /*

      Persona borja = new Persona("Borja", "Martin");
        borja.saludar();
        borja.mostrarDatos();

        Alumno alumno = new Alumno();
        alumno.setNombre("Borja");
        alumno.setApellido("Martin");
        alumno.mostrarDatos();
        alumno.setCurso("DAM");
        alumno.setnMatricula(1234);
        alumno.mostrarDatos();
        alumno.realizarExamen();*/


    }

}
