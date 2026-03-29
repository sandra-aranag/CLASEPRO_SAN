package controller;

import model.Trabajador;
import model.Usuario;

import java.util.List;
import java.util.Scanner;

public class AdminController {

    private Scanner scanner = new Scanner(System.in);
    public List<Usuario> usuarios;
    private FileController fileController = new FileController();


    public AdminController(List<Usuario> usuarios, FileController fileController) {
        this.usuarios = usuarios;
        this.fileController = fileController;
    }

    public void menuAdmin(){

        int opcion;

        do {

            System.out.println("\n————— MENÚ DE ADMINISTRADOR —————");
            System.out.println("1. Dar de alta a un trabajador");
            System.out.println("2. Dar de baja a un trabajador");
            System.out.println("3. Ver datos de un trabajador");
            System.out.println("4. Ver lista de todos los trabajadores");
            System.out.println("5. Cambiar la contraseña de un trabajador");
            System.out.println("6. Ver los registros de fichaje de trabajadores");
            System.out.println("0. Salir del menú de administrador");
            System.out.println("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1 -> altaTrabajador();
                case 2 -> bajaTrabajador();
                case 3 -> mostrarDatosTrabajador();
                case 4-> mostrarTodosTrabajadores();
                case 5->cambiarPasswordTrabajador();
                case 6 -> fileController.leerFicheroFichajes();
                case 0 -> System.out.println("Saliendo del menú");
                default -> System.out.println("Opción no válida");
            }

        }while(opcion != 0);

        scanner.close();
    }

    private void altaTrabajador(){
        System.out.println("Introduce los siguientes datos del trabajador al que quieres dar de alta...");
        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Apellido: ");
        String apellido = scanner.nextLine();
        System.out.println("DNI: ");
        String dni = scanner.nextLine();
        System.out.println("Correo electrónico: ");
        String correo = scanner.nextLine();
        System.out.println("Contraseña: ");
        String password = scanner.nextLine();

        usuarios.add(new Trabajador(nombre, apellido, dni, correo, password));
        System.out.println("Nuevo trabajador añadido correctamente.");
    }

    private void bajaTrabajador(){
        System.out.println("Introduce el DNI del trabajador al que deseas dar de baja: ");
        String dni = scanner.nextLine();
        usuarios.removeIf(usuario -> usuario.getDni().equals(dni) && !usuario.esAdmin());
        System.out.println("Trabajador eliminado.");
    }

    private void mostrarDatosTrabajador(){
        System.out.println("Introduce el DNI del trabajador: ");
        String dni = scanner.nextLine();

        usuarios.stream()
                .filter(usuario -> usuario.getDni().equals(dni) && !usuario.esAdmin())
                .forEach(System.out::println);
    }

    private void mostrarTodosTrabajadores(){
        usuarios.stream()
                .filter(usuario -> !usuario.esAdmin())
                .forEach(System.out::println);
    }

    private void cambiarPasswordTrabajador(){
        System.out.println("Introduce el DNI del trabajador del que quieres cambiar la contraseña: ");
        String dni = scanner.nextLine();
        System.out.println("Introduce la nueva contraseña: ");
        String nuevaPassword = scanner.nextLine();

        usuarios.stream()
                .filter(usuario -> usuario.getDni().equals(dni) && !usuario.esAdmin())
                .forEach(usuario -> usuario.setPassword(nuevaPassword));
        System.out.println("Contraseña actualizada correctamente.");
    }

}
