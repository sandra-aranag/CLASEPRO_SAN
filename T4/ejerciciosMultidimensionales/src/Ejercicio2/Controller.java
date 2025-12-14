package Ejercicio2;

/*Desarrolla un programa que cree una matriz de 2x4. Usa bucles for anidados para pedir al usuario que introduzca
8 números y los almacene en la matriz. Al final, muestra la matriz completa.*/

import java.util.Scanner;

public class Controller {
Scanner scanner = new Scanner(System.in);

    int[][] matriz = new int[2][4];

    public void iniciarMatriz(){


        rellenarMatriz();
        System.out.println("Matriz resultante: ");
        mostrarNumeros();

    }

    public void rellenarMatriz(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int numero;
                    System.out.println("Introduce el número para la posición [" +i+ "] [" +j+ "]" );
                    numero = scanner.nextInt();
                matriz[i][j] = numero;
            }
        }
    }

    public void mostrarNumeros(){
        for (int[] fila : matriz) {
            for (int item : fila) {
                System.out.printf("%d\t", item);
            }
            System.out.println();
        }
    }







}
