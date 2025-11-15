package Ejercicio6;
import java.util.Scanner;

public class Main {

/*Escribe un programa que pida un número N y use un bucle while para hacer una cuenta atrás desde N hasta 1,
mostrando cada número. Al llegar a 1, debe mostrar "¡Despegue!".*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número para la cuenta atrás: ");
        int numero = scanner.nextInt();
        int cuentaAtras = numero;

        while(cuentaAtras >=1){
            System.out.println(cuentaAtras);
            cuentaAtras--;
        }
        System.out.println("¡Despegue!");
        scanner.close();


    }

}
