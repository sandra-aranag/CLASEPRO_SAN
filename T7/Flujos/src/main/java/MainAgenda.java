import java.util.Scanner;

public class MainAgenda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        do{
            System.out.println("1- AGREGAR USUARIO");
            System.out.println("2- LISTAR USUARIO");
            System.out.println("3 - EXPORTAR USUARIO");
            System.out.println("¿Qué quieres hacer?");
            opcion=scanner.nextInt();

            switch (opcion){
                case 1->{}
                case 2->{}
                case 3->{}
                case 4->{}
                case 6->{}
            }
        }while(opcion != 5);
    }

}
