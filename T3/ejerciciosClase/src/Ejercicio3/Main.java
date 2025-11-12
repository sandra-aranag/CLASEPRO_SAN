package Ejercicio3;

import java.util.Scanner;

public class Main {

            /*. Crea un programa que permita al usuario crear una pizza personalizada
eligiendo ingredientes desde un menú.
Reglas:
• El programa muestra al usuario un menú con al menos cinco ingredientes
posibles y su precio individual. Ejemplo: queso (10), jamón (15), piña
(8), tomate (6), pepperoni (12).
• El usuario puede agregar hasta 5 ingredientes diferentes a su pizza,
eligiendo uno por uno. El programa debe evitar la cantidad máxima no
se supere.
• Por cada ingrediente elegido, el programa suma el precio
correspondiente.
• Después de cada selección, muestra al usuario la lista actual de
ingredientes y el subtotal acumulado.
• Cuando el usuario termina, muestra la pizza final detallada (con todos
los ingredientes seleccionados) y el total a pagar.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Creador de pizzas");
        int precioPizza=0;
        String ingredientesString = " ";
        System.out.println("El menú de pizza es: ");
        System.out.println("1. Queso");
        System.out.println("2. Jamón");
        System.out.println("3. Piña");
        System.out.println("4. Tomate");
        System.out.println("5. Pepperoni");
        System.out.println("0. Salir");


        for (int i = 0; i < 5; i++) {
            System.out.println("Indica el ingrediente a agregar:");
            int ingrediente = scanner.nextInt();
            if (ingrediente==0){
                break;
            }
            switch (ingrediente){
                case 1 ->{
                    precioPizza+=10;
                    ingredientesString += "Queso ";
                }
                case 2 ->{
                    precioPizza+=15;
                    ingredientesString += "Jamón ";
                }
                case 3 ->{
                    precioPizza+=8;
                    ingredientesString += "Piña ";
                }
                case 4 ->{
                    precioPizza+=6;
                    ingredientesString += "Tomate ";
                }
                case 5 ->{
                    precioPizza+=12;
                    ingredientesString += "Pepperoni ";
                }

            }

        }


        System.out.println("El precio de la pizza es "+precioPizza);
        System.out.println("Los ingredientes de la pizza son: " +ingredientesString);



    }

}
