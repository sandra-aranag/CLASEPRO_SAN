import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Crea un programa que defina un array de 5 elementos con números enteros. Pide al usuario una posición del
        array y muestra el elemento en esa posición. Usa try-catch para capturar la excepción
        ArrayIndexOutOfBoundsException si el usuario introduce un índice inválido.*/

        Scanner scanner = new Scanner(System.in);

        int[] num = {1,2,3,4,5};

        try{
            System.out.println("Dime una posición del array");
            int posicion = scanner.nextInt();
            System.out.println("El valor en la posición " + posicion + " es: " + num[posicion]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: índice fuera de rango. El array tiene posiciones de 0 a " + (num.length - 1));        }
    }

}
