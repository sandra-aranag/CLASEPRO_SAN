package Ejercicio8;

import java.util.Scanner;

public class Main {

    /*Desarrolla un programa que pida la edad del usuario. Usa un bucle do-while para validar que la edad
    introducida esté entre 0 y 120. Si no es válida, debe volver a pedirla. Una vez válida, muestra un mensaje
    de confirmación.*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int edad = 0;

        do{
            System.out.println("Introduce tu edad");
            edad = scanner.nextInt();

            if (edad >= 0 && edad <=120){
                System.out.println("Edad válida: " +edad+ ". ¡Gracias!");
            } else{
                System.out.println("Edad no válida. Debe ser entre 0 y 120.");
            }

        }while (edad < 0 || edad > 120);

        scanner.close();

    }

}
