package Ejercicio2;

import java.util.Scanner;

public class Main {

    /*
    * Crea una aplicación que simule el funcionamiento del wordle. Para ello realiza
las siguientes acciones:

    * a. Crea una palabra de 5 letras. (funcionará como la palabra a adivinar)
    b. El programa debe seleccionar aleatoriamente una palabra del array y
almacenarla como la palabra secreta.
c. El usuario tiene 5 intentos como máximo para adivinar la palabra secreta.
d. En cada intento, el usuario introduce una palabra por teclado.
e. Tras cada intento, el programa debe indicar al usuario:
i. Aciertos: cuántas letras tiene en la misma posición que la palabra
secreta.
ii. Aproximaciones: cuántas letras están en la palabra secreta, pero en una
posición diferente.
iii. Fallos: cuántas letras no están presentes en la palabra secreta.
El juego termina cuando el usuario adivina la palabra o se acaban los 5 intentos.
    * */
   public static void main(String[] args) {
       String palabraSistema = "frase", palabraUsuario;
       Scanner scanner = new Scanner(System.in);

       int intentos = 5, numeroAcierto=0, numeroAprox=0, numeroFallos=0;
       do{
           System.out.println("Introduce la palabra");
           intentos--;
           palabraUsuario = scanner.next();
           numeroAprox=0;
           numeroAcierto=0;
           numeroFallos=0;
           //comparar letras una a una
           for (int i = 0; i < palabraSistema.length(); i++) {

               if (palabraSistema.equals(palabraUsuario)){
                   numeroAcierto=5;
                   break;
               } else if (palabraSistema.charAt(i) == palabraUsuario.charAt(i)){
                   numeroAcierto++;
               } else if (palabraSistema.contains(String.valueOf(palabraUsuario.charAt(i)))){
                   numeroAprox++;
               }else{
                   numeroFallos++;
               }

           }

           System.out.println("Los aciertos en este intento son: " +numeroAcierto);
           System.out.println("Los aciertos en este aproximaciones son: " +numeroAprox);
           System.out.println("Los aciertos en este fallos son: " +numeroFallos);
       }while(intentos>0 && numeroAcierto<5);

        if (numeroAcierto==5){
            System.out.println("¡Palabra acertada!");
        }


   }
}
