package util;

public class ResultadoException extends Exception{

    //atributos
    //metodos
    //se produce cuando el resultado es inferior a 0


    public ResultadoException(String message) {
        super(message);
        System.out.println("Lanzando excepción");
    }
}
