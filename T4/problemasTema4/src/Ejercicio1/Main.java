package Ejercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el tamaño de las filas: ");
        int filas = scanner.nextInt();
        System.out.println("Dime el tamaño de las columnas:" );
        int columnas = scanner.nextInt();


        int[][] matriz1 = new int[filas][columnas];
        int[][] matriz2 = new int[filas][columnas];
        int[][] sumaMatrices = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                matriz1[i][j] = (int) (Math.random()*51);
                matriz2[i][j] = (int) (Math.random()*51);
                sumaMatrices[i][j] = matriz1[i][j] + matriz2[i][j];

            }
        }

        System.out.println("\nMOSTRANDO LA PRIMERA MATRIZ: ");
        for (int[] fila : matriz1) {
            for (int item : fila) {
                System.out.printf("%d\t", item);

            }
            System.out.println();
        }

        System.out.println("\nMOSTRANDO LA SEGUNDA MATRIZ: ");
        for (int[] fila : matriz2) {
            for (int item : fila) {
                System.out.printf("%d\t", item);

            }
            System.out.println();
        }

        System.out.println("\nLa SUMA DE LA MATRIZ ES: ");
        for (int[] fila : sumaMatrices) {
            for (int item : fila) {
                System.out.printf("%d\t", item);
            }
            System.out.println();
        }


    }

}
