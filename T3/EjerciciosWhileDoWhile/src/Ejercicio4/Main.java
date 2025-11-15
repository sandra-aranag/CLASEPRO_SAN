package Ejercicio4;

import java.util.Scanner;

public class Main {

    /*Crea un juego donde el programa elige un número secreto entre 1 y 10 (por ejemplo, 7). Usa un bucle
    do-while para pedir al usuario que adivine el número. El programa debe indicar si el número es mayor o menor,
    y continuar hasta que el usuario acierte.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Adivina el número entre 1 y 10!");
        System.out.println("------------------------");
        int numeroUsuario, intentos=0;
        int numeroSistema = (int) (Math.random()*11);
        System.out.println("El número de sistema es " +numeroSistema);

        do{
            System.out.println("Introduce tu intento: ");
            numeroUsuario= scanner.nextInt();
            intentos++;

            if (numeroUsuario == numeroSistema){
                System.out.println("¡Correcto! Has adivinado el número en " +intentos+ " intentos.");
                break;
            }

            if(numeroUsuario < numeroSistema){
                System.out.println("El número es mayor. Intenta de nuevo");
            } else{
                System.out.println("El número es menor. Intenta de nuevo");
            }
        }while(intentos>0);



    }

}
