package Ejercicio6;

public class Controller {

    int[][] matriz = new int[3][4];

    public void inicioMatriz(){
        rellenarMatriz();
        System.out.println("Matriz: ");
        mostrarMatriz();
        mayorColumna();
    }

    public void rellenarMatriz(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int aleatorio = (int) (Math.random()*40)+1;
                matriz[i][j] = aleatorio;
            }
        }
    }


    public void mostrarMatriz(){
        for (int [] fila : matriz) {
            for (int item : fila) {

                System.out.printf("%d\t",item);

            }
            System.out.println();
        }
    }

    public void mayorColumna(){
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < columnas; i++) {
            int mayor = matriz[0][i];

            for (int j = 0; j < filas; j++) {
                if (matriz[j][i] > mayor){
                    mayor = matriz[j][i];
                }
            }
            System.out.println("Mayor de la columna " + i + ": " + mayor);
        }


    }




}
