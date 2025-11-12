package Ejercicio4;

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


    public static void main(String[] args) {

        //Lo primero que debe tener son dos puntuaciones: PuntuacionJ1=301; puntuacionJ2=302;

        /* DO-WHILE

        // For -> para las tres tiradas (dardo). Meto un aleatirio entre 0 y 60 (¿Math random?) -> restando a cada jugador
        //Si en una tirada, un jugador va a quedarse en negativo: no se resta
        // Si el j1 lleva como puntos 23 y se le restan 60, el jugador no se queda con -38, sino en 23

        Mientras uno de los dos jugadores no haya llegado a 0, continua.
        Esto sería un do-while porque, como mínimo, debo hacer una tirada
         */

        //NO HAY QUE HACER SWITCH.

    }


}
