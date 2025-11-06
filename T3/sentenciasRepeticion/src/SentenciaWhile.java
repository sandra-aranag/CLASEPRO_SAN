import java.util.Scanner;

public class SentenciaWhile {

    //While tradicional
    public void evaluacionNumero(){

        Scanner scanner = new Scanner(System.in);

        //Math.random() - genera un nº random entre 0 y 0.99
        int aleatorio = (int)(Math.random()*11);
        System.out.println("El aleatorio generado es: "+aleatorio);
        int intentos =0;
        System.out.println("Introduce un número a ver si es el correcto: ");
        int numero = scanner.nextInt();
        intentos++;

        while(aleatorio!=numero){
            System.out.println("Intento fallido, vuelve a introducir el númeor: ");
            numero = scanner.nextInt();
            intentos++;
        }

        System.out.printf("Numero acertado el numero en %d",intentos);

    }

    //DO-WHILE
    public void imprimirMenu(){
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do{

            System.out.println("1-Suma");
            System.out.println("2-Resta");
            System.out.println("3-Multiplicacion");
            System.out.println("4-División");
            System.out.println("5-Salir");
            System.out.println("Indica qué operación quieres realizar: ");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1 ->{
                    System.out.println("Suma");
                }
                case 2 ->{
                    System.out.println("Resta");
                }
                case 3 ->{
                    System.out.println("Multipicacion");
                }
                case 4 ->{
                    System.out.println("División");
                }
                case 5->{
                    System.out.println("Saliendo......");
                }
                default -> {
                    System.out.println("Opción no contemplada");
                }
            }
        } while(opcion!=5);

        System.out.println("Finalizando la repetición");

    }



}
