package Ejercicio7;

import java.util.Scanner;

public class Main {

  /*Crea un programa que pida al usuario cuántas calificaciones va a introducir. Luego, usa un bucle while para
  pedir cada calificación una por una, sumarlas y al final calcular y mostrar el promedio.*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuántas calificaciones vas a introducir?");
        int calificaciones = scanner.nextInt();

        int conteo = 0;
        double sumaTotal=0;

        while (conteo < calificaciones){
            System.out.println("Introduce la nota " + (conteo + 1) + ":");
            double nota = scanner.nextDouble();
            sumaTotal += nota;
            conteo++;

        }
            System.out.println("La suma total es de: " +sumaTotal);
        System.out.printf("Promedio de calificaciones: %.2f%n", sumaTotal/calificaciones);

        scanner.close();

        }


    }

