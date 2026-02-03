import util.ResultadoException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainThrow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operaciones operaciones = new Operaciones();
        int op1=0, op2=0;
        boolean fallo = false;

        do{
            try {

                System.out.println("Introduce el número 1");
                op1 = scanner.nextInt();
                System.out.println("Introduce el número 2");
                op2 = scanner.nextInt();
                System.out.println("Pasamos a calcular los resultados.");
                int suma = operaciones.operarSuma(op1, op2);
                int resta = operaciones.operarResta(op1,op2);
                int multi= operaciones.operarMulti(op1,op2);
                int div = operaciones.operarDiv(op1, op2);
                System.out.println("Lo resultados son:");
                System.out.println("la suma es: " +suma);
                System.out.println("la resta es: " +resta);
                System.out.println("la nulti es: " +multi);
                System.out.println("la div es: " +div);
                System.out.println("Terminando la calculadora.");

            } catch (ArithmeticException | InputMismatchException e){
                scanner = new Scanner(System.in);
                System.out.println("Error en operación,");
                fallo = true;
            }   catch (ResultadoException e){
                System.out.println(e.getMessage());
            }

            catch (Exception e){
                System.out.println("Genérico");
                fallo = false;
            }


        } while (fallo);







    }




}
