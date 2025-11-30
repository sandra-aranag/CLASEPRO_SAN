package Ejercicio2;
import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    private int[] array = new int[10];

    public void iniciarArray(){
        rellenarArray();
        menu();
    }

    public void rellenarArray(){

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*21);
        }
    }

    public void menu(){

        char opcion;
        do{
            System.out.println("\na. Imprimir el array");
            System.out.println("b. Mover a la izquierda");
            System.out.println("c. Mover a la derecha");
            System.out.println("d. Invertir");
            System.out.println("e. Salir del menú");
            System.out.println("¿Qué acción deseas realizar?");
            opcion = scanner.next().charAt(0);

            switch (opcion){
                case 'a'->{
                    mostrarArray();
                }
                case 'b'->{
                    System.out.println("Moviendo el array a la izquierda: ");
                    moverIzquierda(array);
                    mostrarArray();

                }
                case 'c'->{
                    System.out.println("Moviendo el array a la derecha: ");
                    moverDerecha(array);
                    mostrarArray();
                }
                case 'd'->{
                    System.out.println("Inviertiendo el array...");
                    invertirArray(array);
                    mostrarArray();
                }
                case 'e'->{
                    System.out.println("Saliendo del menú...");

                }
                default -> System.out.println("Opción incorrecta, inténtelo de nuevo.");
            }

        }while(opcion!='e');


    }

    private void mostrarArray(){
        System.out.println("Imprimiendo el array: ");
        for (int item : array ) {
            System.out.printf("%d\t", item);
        }
        System.out.println();
    }

    private void moverIzquierda(int[] array){
        int primero = array[0];

        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        array[array.length - 1] = primero;
    }

    private void moverDerecha(int[] array){
        int ultimo = array[array.length - 1];

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }

        array[0] = ultimo;
    }

    private void invertirArray(int[] array){

        for (int i = 0; i < array.length / 2; i++) {
            int invertir = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = invertir;
        }


    }


}
