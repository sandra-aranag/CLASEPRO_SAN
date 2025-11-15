package Ejercicio4;

import java.util.Scanner;

public class Main {

    /*4. Crea un programa para jugar una partida virtual de dardos entre dos
jugadores. El objetivo es que uno de los jugadores llegue exactamente a 0 puntos
partiendo desde 301.
Reglas:
• Nada más empezar pide el nombre de cada jugador
• Cada jugador comienza con 301 puntos.
• En cada turno, un jugador lanza 3 dardos. Cada dardo genera un número
aleatorio entre 0 y 60 (simulando puntuación en dardos).
• La puntuación del turno es la suma de los 3 dardos.
• Resta la puntuación del turno al total de puntos del jugador.
• Si la puntuación restante es menor que 0, se considera que el jugador "se
pasa" y su total no cambia ese turno.
• El primer jugador que llegue exactamente a 0 gana la partida.
• Después de cada turno, muestra las puntuaciones actuales y quién va
ganando (el que tiene menos puntos).
• Al finalizar, muestra el ganador y cuántos turnos tomó la partida.*/

    //Lo primero que debe tener son dos puntuaciones: PuntuacionJ1=301; puntuacionJ2=302;

        /* DO-WHILE

        // For -> para las tres tiradas (dardo). Meto un aleatirio entre 0 y 60 (¿Math random?) -> restando a cada jugador
        //Si en una tirada, un jugador va a quedarse en negativo: no se resta
        // Si el j1 lleva como puntos 23 y se le restan 60, el jugador no se queda con -38, sino en 23

        Mientras uno de los dos jugadores no haya llegado a 0, continua.
        Esto sería un do-while porque, como mínimo, debo hacer una tirada

        Se crea un FOR por cada jugador.
         */

    //NO HAY QUE HACER SWITCH.


    public static void main(String[] args) {

        //pido nombres por consola
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jugador 1, escribe tu nombre: ");
        String nombreJ1 = scanner.nextLine();
        System.out.println("Jugador 2, escribe tu nombre: ");
        String nombreJ2 = scanner.nextLine();

        //declaro variables
        int totalJ1 = 301, totalJ2=301, lanzamiento = 0, turnos=0;

        //muestro en consola el total inicial de cada jugador y explico la dinámica
        System.out.println("\n-----------------------");
        System.out.printf("Puntuación inicial del jugador 1: %d%n", totalJ1);
        System.out.printf("Puntuación inicial del jugador 2: %d%n", totalJ2);
        System.out.println("\n-----------------------");
        System.out.println("¡Que empiece el juego! ¡Gana el que primero llegue a 0!");


        do{
            turnos++;

            //empieza el turno del jugador 1
            System.out.println("\n-----------------------");
            System.out.println("¡Tira tres veces el dado, " +nombreJ1+ "!");
            int puntosRondaJ1=0;

            for (int i = 1; i <= 3; i++) {
                lanzamiento= (int) (Math.random()*61);
                puntosRondaJ1 += lanzamiento;
                System.out.println("Dardo " + i + ": " + lanzamiento);
            }
            System.out.println("-----------------------");
            System.out.printf("Total del turno: %d%n",puntosRondaJ1);

            //¿Se pasa?
            if (totalJ1 - puntosRondaJ1 < 0) {
                System.out.println("¡Te has pasado, " +nombreJ1+ "! Por lo tanto, la puntuación no cambia.");

            } else {
                totalJ1-=puntosRondaJ1;
            }
            System.out.println("La puntuación actual de " +nombreJ1+ " es de " +totalJ1);

            //Y si ha ganado
            if (totalJ1 == 0){
                break;
            }



            //empieza el turno del jugador 2
            System.out.println("\n-----------------------");
            System.out.println("¡Tira tres veces el dado, " +nombreJ2+ "!");
            int puntosRondaJ2=0;

            for (int i = 1; i <= 3; i++) {
                lanzamiento= (int) (Math.random()*61);
                puntosRondaJ2 += lanzamiento;
                System.out.println("Dardo " + i + ": " + lanzamiento);

            }
            System.out.println("-----------------------");
            System.out.printf("Total del turno: %d%n",puntosRondaJ2);

            //¿Se pasa?
            if (totalJ2 - puntosRondaJ2 < 0){
                System.out.println("¡Te has pasado, " +nombreJ2+ "! Por lo tanto, la puntuación no cambia.");
            } else {
                totalJ2-=puntosRondaJ2;
            }
            System.out.println("La puntuación actual de " +nombreJ2+ " es de " +totalJ2);

            //Y si ha ganado
            if (totalJ2 == 0){
                break;
            }

            //¿Y quién gana?
            if(totalJ1 > totalJ2){
                System.out.println("¡Va ganando " +nombreJ1+ "!");
            } else if (totalJ2 > totalJ1){
                System.out.println("¡Va ganando " +nombreJ2+ "!");
            } else {
                System.out.println("¡" +nombreJ1+ " y " +nombreJ2+ " van empatados!");
            }

        }while (totalJ1 > 0 && totalJ2 > 0);

        System.out.println("-----------------------");
        System.out.println("¡LA PARTIDA HA TERMINADO!");
        System.out.println("-----------------------");

        if (totalJ1 == 0){
            System.out.println("¡Ha ganado " +nombreJ1+ "!");
        } else {
            System.out.println("¡Ha ganado " +nombreJ2+ "!");
        }

        System.out.println("El número de total de turnos jugados es de " +turnos);

    }


}
