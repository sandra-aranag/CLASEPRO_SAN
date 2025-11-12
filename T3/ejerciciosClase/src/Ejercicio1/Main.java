package Ejercicio1;

import java.util.Scanner;



public class Main {


    /*
    * Crea un programa de adivinación de números. El programa genera de manera
aleatoria un número entre 1 y 50. El usuario debe adivinar el número en un
máximo de 7 intentos. Después de cada intento, indica si el número es mayor
o menor que el elegido. Si el usuario acierta, mostrar un aviso con el número
de intentos utilizado; si no, mostrar un aviso de que debe introducir
nuevamente un número.
    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int intentos = 7;
        // creará un num aleatorio entre el 0 y el 49, por so añadimos un +1 al final
        int numeroSistema = (int) (Math.random()*50)+1;
        int numeroUsuario;
        boolean acertado=false;
        System.out.println("El número del sistema es: " +numeroSistema);

        do {
            System.out.println("Introduce el número para ver si aciertas:");
            numeroUsuario = scanner.nextInt();
            intentos --; //cuando el usuario lo intenta, queda un intento menos
            if (numeroUsuario==numeroSistema){
                System.out.println("¡Número acertado!");
                acertado = true;
                break;
            }
            System.out.println("Vas por el intento número " +(7-intentos));
            if (numeroSistema > numeroUsuario){
                System.out.println("El número es más grande");
            } else {
                System.out.println("El número es más pequeño");
            }

        }while (intentos>0);

        if (!acertado){
            System.out.println("Lo siento, has perdido :(");
        }
        System.out.printf("Terminado el juego con %d intentos",7-intentos);

    }


}
