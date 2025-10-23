import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        System.out.println("Iniciando programa de operadores");
        Operadores operacionesVariable = new Operadores (); //es una variable compleja y x eso ponemos new. ESTO ES UN OBJETO, instancias de una clase
        //operadores.operadoresAritmeticos();
        //operadores.operadoresAsignacion();
        //operadores.operadoresComparacion();
        //operadores.operadoresLogicos();
        //BufferedReader -> mejor que el Scanner, ya que este a veces se queda un poco corto
        /*Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Dime tu nombre y apellido");
        String nombre = lectorTeclado.nextLine(); //si quieres que lea espacio debes poner .nextLine
        System.out.println("¿Qué salario quieres ganar?");
        double salarioEntrada = lectorTeclado.nextDouble();
        System.out.println("¿Qué edad tienes?");
        int edad = lectorTeclado.nextInt();
        System.out.println("¿Tienes permiso de conducir?");
        boolean conducir = lectorTeclado.nextBoolean();
        operacionesVariable.evaluarCandidato(salarioEntrada,edad,conducir);*/
        operacionesVariable.cambioTipos();
    }

}
