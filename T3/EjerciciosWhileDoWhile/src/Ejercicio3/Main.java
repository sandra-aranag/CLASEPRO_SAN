package Ejercicio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int suma = 0;

        System.out.println("Introduce un número (0 o negativo para terminar): ");
        int numero = scanner.nextInt();
        suma+=numero;

        while(numero > 0){
            System.out.println("Introduce un número (o o negativo para terminar): ");
            numero = scanner.nextInt();
            suma+=numero;
        }
        System.out.printf("Programa terminado. Suma total: %d%n",suma);

    }

}
