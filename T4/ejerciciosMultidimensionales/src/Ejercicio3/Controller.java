package Ejercicio3;

/*Escribe un programa que defina una matriz de 4x4 con números. Usa bucles for anidados para recorrer la matriz y
calcular la suma de todos sus elementos. Muestra el resultado.*/


public class Controller {

    int[][] matriz = new int[4][4];

    public void iniciarMatriz(){
        rellenarNumeros();
        System.out.println("Matriz: ");

        mostrarNumeros();
        System.out.println("La suma de todos los elementos es: " +sumarNumeros());

    }

    public void rellenarNumeros(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int aleatorio = (int) (Math.random()*20)+1;
                matriz[i][j] = aleatorio;
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



    public int sumarNumeros(){

        int suma=0;
        for (int[] fila : matriz) {
            for (int item : fila) {
                suma += item;
            }

        }
        return suma;
    }





}
