package Ejercicio5;

import java.util.Scanner;

public class Main {

    /*Desarrolla un programa con un menú que se repita usando do-while. El menú debe tener 4 opciones: 1=Saludar,
    2=Despedirse, 3=Ver hora actual (puedes mostrar un mensaje fijo), 4=Salir. Usa switch para procesar cada opción.
    El programa solo debe terminar cuando el usuario elija la opción 4.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;


        do{

            System.out.println("––– MENÚ –––");
            System.out.println("1. Saludar");
            System.out.println("2. Despedirse");
            System.out.println("3. Ver hora actual");
            System.out.println("4. Salir");

            System.out.println("Elige una opción: ");
            opcion = scanner.nextInt();


           switch (opcion){
               case 1-> System.out.println("¡Hola! ¿Cómo estás?");
               case 2-> System.out.println("¡Adiós!");
               case 3-> System.out.println("Son las 14:30");
               case 4-> System.out.println("Saliendo del menú...");
               default-> System.out.println("Opción no contemplada");

           }


        }while(opcion!=4);

    }


}
