package Ejercicio4;

import java.util.Scanner;

public class Controller {

    Scanner scanner = new Scanner (System.in);
    int[][] matriz = new int[3][5];

    public void iniciarMatriz(){
        rellenarMatriz();
        System.out.println("Matriz: ");
        mostrarMatriz();
        pedirNumero();
    }


    public void rellenarMatriz(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int aleatorio;
                do {
                    aleatorio = (int) (Math.random()*80)+1;

                }while(estaNumero(aleatorio));
                matriz[i][j] = aleatorio;
            }
        }
    }

    private boolean estaNumero(int numero){

        for ( int[] fila : matriz) {
            for ( int item : fila) {
                if(item == numero){
                    return true;
                }
            }
        }
        return false;
    }


    public void mostrarMatriz(){
        for (int [] fila : matriz) {
            for (int item : fila) {
                System.out.printf("%d\t", item);
            }
            System.out.println();
        }
    }


    public void pedirNumero(){
        System.out.println("Introduce el número a buscar: ");
        int numero = scanner.nextInt();
        boolean encontrado=false;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (numero == matriz[i][j]){
                    System.out.printf("El número %d se encuentra en la posición [%d] [%d]\n", numero, i, j);
                    encontrado = true;
                }
            }

        }
        if (!encontrado){
            System.out.printf("El número %d no se encuentra en la matriz\n", numero);
        }
    }




}
