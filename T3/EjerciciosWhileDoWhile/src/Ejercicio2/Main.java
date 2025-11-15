package Ejercicio2;
import java.util.Scanner;

public class Main {

    /*Desarrolla un programa que pida al usuario una contraseña. La contraseña correcta es "1234". Usa un bucle
    do-while para seguir pidiendo la contraseña hasta que el usuario la introduzca correctamente.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       String password = "1234";
        do{
            System.out.println("Introduce la contraseña: ");
            String passUsuario = scanner.nextLine();

            if (!passUsuario.equals(password)){
                System.out.println("Contraseña incorrecta. Intenta de nuevo");
            } else {
                System.out.println("¡Contraseña correcta! Acceso permitido");
                break;
            }
        }while(true);



    }

}
