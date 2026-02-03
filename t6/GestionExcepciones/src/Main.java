import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
        System.out.println("Introduce el número 1");
        int op1 = scanner.nextInt();
        System.out.println("Introduce el número 2");
        int op2 = scanner.nextInt();
        System.out.println("Pasamos a calcular los resultados.");
        int suma = op2+op1;
        int resta = op2-op1;
        int multi=op2*op1;
        int div = op1/op2;
        System.out.println("Lo resultados son:");
        String resultados=null;
        System.out.println("la suma es: " +suma);
        System.out.println("la resta es: " +resta);
        System.out.println("la nulti es: " +multi);
        System.out.println("la div es: " +div);
        } catch (InputMismatchException e){
            System.out.println("Error en la introducción de datos por teclado");
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println("Cálculo erróneo");
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("Fallo en la introducción de los datos.");
            System.out.println(e.getMessage());
        }

        System.out.println("Terminando la calculadora.");
    }




}
