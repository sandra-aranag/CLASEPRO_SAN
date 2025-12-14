package Ejercicio1;
/*Crea un programa que defina una matriz de 3x3 con números del 1 al 9. Usa bucles for anidados para mostrar la
 matriz en formato de tabla.*/
public class Controller {

    private int[][] matriz = new int[3][3];

    public void iniciarMatriz(){
        System.out.println("Matrix 3x3: ");
        rellenarMatriz();
        mostrarNumeros();
    }

    public void rellenarMatriz(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int aleatorio;
                do {
                    aleatorio = (int) (Math.random()*9)+1;
                }while(estaNumero(aleatorio));
                matriz[i][j] = aleatorio;
            }

        }
    }

    private boolean estaNumero(int numero){

        for (int[] fila : matriz) {
            for (int item : fila) {
                if (item==numero){
                    return true;
                }
            }
        }
        return false;
    }


    public void mostrarNumeros(){
        for (int [] fila : matriz) {
            for (int item : fila) {
                System.out.printf("%d\t", item);
            }
            System.out.println();
        }
    }







}
