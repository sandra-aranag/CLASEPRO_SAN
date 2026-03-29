package controller;

import model.Usuario;

import java.util.Scanner;

public class TrabajadorController {

    private Scanner scanner = new Scanner(System.in);
    private FileController fileController = new FileController();

    public TrabajadorController(FileController fileController) {
        this.fileController = fileController;
    }


    public void menuTrabajador(Usuario trabajador){
        int opcion;

        do {
            System.out.println("\n————— MENÚ DE TRABAJADOR —————");
            System.out.println("1. Fichar");
            System.out.println("0. Salir");
            System.out.println("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1 -> fileController.fichar(trabajador);
                case 0 -> System.out.println("Saiendo del menú");
                default -> System.out.println("La opción seleccionada no es correcta");
            }

        }while (opcion != 0);

    }

}
