public class Calculadora {

    /*Crea una clase Calculadora con métodos estáticos para sumar, restar, multiplicar y dividir dos números.
    Añade también un metodo estático potencia(base, exponente). Usa estos métodos sin crear objetos de la clase.*/


    public static int sumar(int op1, int op2){
        return op1+op2;
    }


    public static int restar(int op1, int op2){
        return op1-op2;
    }


    public static int multi(int op1, int op2){
        return op1*op2;
    }


    public static double dividir(int op1, int op2){
        return (double)op1/op2;
    }

    public static double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }


}
