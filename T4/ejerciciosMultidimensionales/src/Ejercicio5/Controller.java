package Ejercicio5;

public class Controller {

    double [][] matriz = new double[4][3];

    public void iniciarMatriz(){
        rellenarMatriz();
        mostrarMatriz();
        calcularPromedio();
    }

    public void rellenarMatriz(){

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                double aleatorio = (Math.random()*9)+1;
                matriz[i][j] = aleatorio;
            }
        }

    }

    public void mostrarMatriz(){

        for (double [] fila : matriz) {
            for (double item : fila) {
                System.out.printf("%7.2f\t", item);
            }
            System.out.println();
        }
    }

    public void calcularPromedio(){
        int numFila=0;

        for (double [] fila : matriz) {
            double suma=0;
            for (double item : fila ) {
                suma+=item;
            }
           double promedio = suma/fila.length;
            System.out.printf("Promedio de la fila %d: %.2f\n", numFila, promedio);
            numFila++;
        }


    }


}
