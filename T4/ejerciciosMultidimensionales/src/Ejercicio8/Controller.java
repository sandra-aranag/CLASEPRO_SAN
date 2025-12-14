package Ejercicio8;

public class Controller {

    int[][] matriz = new int[4][5];
    
    public void iniciarMatriz(){
        rellenarMatriz();
        System.out.println("Matriz: ");
        mostrarMatriz();
        parImpar();
    }
    
    public void rellenarMatriz(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int aleatorio = (int) (Math.random()*39)+1;
                matriz[i][j]=aleatorio;
            }
        }
    }

    public void mostrarMatriz(){

        for (int[] fila : matriz) {
            for (int item : fila) {
                System.out.printf("%d\t", item);
            }
            System.out.println();
        }

    }


    public void parImpar(){
        int par = 0;
        int impar = 0;

        for (int[] fila : matriz) {

            for (int item : fila) {
                int resto = item %2;
                if (resto == 0){
                    par ++;
                } else {
                    impar ++;
                }
            }

        }
        System.out.println("\nNúmero de pares: " +par);
        System.out.println("Número de impares: " +impar);
    }



}
