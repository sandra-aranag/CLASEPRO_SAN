package Ejercicio10;

import java.util.Scanner;

public class Main {

    /*Desarrolla un programa que simule un cajero automático. El saldo inicial es 1000€. Usa un bucle do-while para
    mostrar un menú con opciones: 1=Consultar saldo, 2=Retirar dinero, 3=Depositar dinero, 4=Salir. Usa switch para
    cada opción. Para retirar dinero, usa un bucle while para validar que no se retire más del saldo disponible (si
    intenta retirar más, debe volver a pedir la cantidad). Para depositar, valida que sea una cantidad positiva.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int saldo = 1000, opcion;

        do {

            System.out.println("–––– MENÚ ––––");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Depositar dinero");
            System.out.println("4. Salir");
            System.out.println("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1 ->{
                    System.out.println("Tu saldo actual es de " +saldo);
                }
                case 2 ->{
                    System.out.println("¿Cuánto dinero deseas retirar?");
                    int retirar = scanner.nextInt();
                    while (retirar > saldo || retirar <=0){
                        System.out.println("Cantidad inválida. Introduce otra cantidad: ");
                        retirar=scanner.nextInt();
                    }
                    System.out.printf("Retiro exitoso. Has retirado %d%n", retirar);
                    saldo -= retirar;
                    System.out.printf("Nuevo saldo %d%n",saldo);
                }
                case 3 ->{
                    System.out.println("¿Cuánto dinero deseas depositar?");
                    int depositar = scanner.nextInt();
                    while (depositar <=0){
                        System.out.println("Cantidad inválida. Introduce otra cantidad: ");
                        depositar=scanner.nextInt();
                    }
                    System.out.printf("Depósito exitoso. Has depositado %d%n", depositar);
                    saldo += depositar;
                    System.out.printf("Nuevo saldo %d%n",saldo);
                }
                case 4 ->{
                    System.out.println("Gracias por usar el cajero. ¡Hasta luego!");
                }
                default -> {
                    System.out.println("Opción no contemplada. Inténtalo de nuevo.");
                }
            }

        }while (opcion !=4);
        scanner.close();
    }

}
