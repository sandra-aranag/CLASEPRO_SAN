import util.ResultadoException;

import java.util.NoSuchElementException;

public class Operaciones {

    public int operarSuma(int op1, int op2) throws ClassNotFoundException{
        return op1+op2;
    }

    public int operarResta(int op1, int op2) throws ResultadoException{

        if (op2>op1){
            throw new ResultadoException("El resultado de la resta es negativo");
        }

        return op1-op2;
    }

    public int operarMulti(int op1, int op2) throws NoSuchElementException {
        return op1*op2;
    }

    public int operarDiv(int op1, int op2) throws ArithmeticException{
        return op1/op2;
    }

}
