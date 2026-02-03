import java.util.InputMismatchException;
import java.util.Scanner;

public class MainRecursivo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op1=0, op2=0;
        boolean fallo = false;

        do{
            try{
                System.out.println("Introduce el número 1");
                op1 = scanner.nextInt();
                System.out.println("Introduce el número 2");
                op2 = scanner.nextInt();
                System.out.println("Pasamos a calcular los resultados.");
                int suma = op2+op1;
                int resta = op2-op1;
                int multi=op2*op1;
                int div = op1/op2;
                System.out.println("Lo resultados son:");
                System.out.println("la suma es: " +suma);
                System.out.println("la resta es: " +resta);
                System.out.println("la nulti es: " +multi);
                System.out.println("la div es: " +div);
                fallo=false;
            } catch (Exception e){
                scanner = new Scanner(System.in);
                System.out.println("Fallo en la introducción de los datos.");
                System.out.println(e.getMessage());
            }
        }while(fallo);

        System.out.println("Terminando la calculadora.");
    }




}
