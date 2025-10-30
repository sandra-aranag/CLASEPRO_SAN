import java.util.Scanner;

public class SentenciaSwitch {

    public void usoSwitch(){

        int valor = 3;
        //quiero saber si el valor vale 1, 2, 7 o resto
        switch (valor){ //en el parentesis pones la variable que quieres evaluar

            case 1:
                //cuerpo cuando la variable toma valor 1.
                System.out.println("Toma valor de 1");
                break;

            case 5:
                //cuerpo cuando la variable toma valor 5.
                System.out.println("Toma valor de 5");
                break;

            case 7:
                //cuerpo cuando la variable toma valor 7.
                System.out.println("Toma valor de 7");
                break;

            default: //es como el else
                System.out.println("Valor no contemplado");
        }
        System.out.println("Terminado el bloque de switch");
    }

    public void usoSwitchString(){

        String nombre="Sandra";
        switch (nombre.toLowerCase()){
            case "sandra":
                System.out.println("El nombre es Sandra");
                break;

            case "maria":
                System.out.println("El nombre es Maria");
                break;

            case "juan":
                System.out.println("El nombre es juan");
                break;

            default:
                System.out.println("Nombre no contemplado");
        }

        System.out.println("Fin de la sentencia");
    }

    public void usoSwitchChar(){

        char letra = 'A';
        switch (letra){

            case 'A':
                //logica
                break;
            case 'B':
                //logica
                break;

            case 'C':
                //logica
                break;

            case 'D':
                //logica
                break;


            default:
                System.out.println("Letra no contemplada");


        }

    }

    //FORMATO FLECHA
    public void usoSwitchLambda(){

        int nota = 7;
        switch (nota){
            case 1->{
                System.out.println("Seleccionado el caso 1");
            }
            case 2->{
                System.out.println("Seleccionado el caso 2");
            }
            case 3->{
                System.out.println("Seleccionado el caso 3");
            }
            case 4|5|6|7|8|9->{
                System.out.println("Seleccionado el caso 4");
            }
            default->{
                System.out.println("Sin contemplar");
            }
        }


    }

    public void menuOpciones(){
        Scanner scanner = new Scanner();
        System.out.println("Menu operaciones");
        System.out.println("1 Sumar");
        System.out.println("2 restar");
        System.out.println("3 dividir");
        System.out.println("4 multi");
        System.out.println("Modulo");

        int opcion = scanner.nextInt();
        switch (opcion){
            case 1->{
                System.out.println("Vas a sumar");
            }
            case 2->{
                System.out.println("Vas a restar");
            }
            case 3->{
                System.out.println("Vas a dividir");
            }
            case 4->{
                System.out.println("Vas a multiplicar");
            }
            case 5->{
                System.out.println("Vas a modulo");
            }
            default -> {
                System.out.println("Datos incorrectos");
            }
        }
    }
}
