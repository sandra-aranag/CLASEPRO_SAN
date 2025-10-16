public class Operadores {

    public void operadoresAritmeticos(){

        //UNARIOS
        int operadorUno = 5;
        //incremento--> para hacer un contador.
            operadorUno++; //Esto le suma uno al valor que ya tenía. Muy util para hacer contadores.
            operadorUno++;
            operadorUno++;
            operadorUno++;

        System.out.println("El valor de operador uno después de los incrementos es "+operadorUno);

        //decremento--> para restar uno al valor que ya tenía -> para por ej logins, si hacen logins incorrectos restamos un intento

        operadorUno--;
        operadorUno--;
        operadorUno--;

        System.out.println("El valor de operador uno después de los decrementos es "+operadorUno);


        //BINARIOS --> 2 OPERADORES
        operadorUno = 8;
        int operadorDos = 3;
        int suma = operadorUno+operadorDos;
        System.out.println("El resultado de la suma es "+suma);
        System.out.println("El resultado de la suma es "+(operadorUno+operadorDos)); //si no quieres hacer variable operas así

        int resta = operadorUno-operadorDos;
        System.out.println("El resultado de la resta es "+resta);

        int multi = operadorUno*operadorDos;
        System.out.println("El resultado de la multiplicación es "+multi);

        double div = (double) operadorUno/operadorDos;
        System.out.println("El resultado de la división es "+div);

        int modulo = operadorUno%operadorDos;
        System.out.println("El módulo de la división es "+modulo);
        //me vale para saber si un número es par o impar.


    }

    public void operadoresAsignacion(){

        int operadorUno = 10;
        int operadorDos=6;
        operadorUno +=5; //en operadorUno guarda la suma de lo que valia operadorUno más el valor que le digas (5).
        operadorUno += operadorDos;
        System.out.println("El valor de operador uno es "+operadorUno);

        operadorUno-=5;
        System.out.println("El valor de operador tras la resta es "+operadorUno);

        operadorUno*=2;

        System.out.println("El valor de la multiplicación es "+operadorUno);

        operadorUno%=2;
        System.out.println("El valor del modulo es "+operadorUno);






    }

    //Serán utilizados como condiciones para ejecutar una parte del código u otra
    public void operadoresComparacion(){

        int operandoUno =10;
        int operandoDos =20;
        boolean resultado = operandoUno>operandoDos;
        System.out.println("El resultado de la comparación es "+resultado);

        resultado = operandoUno<operandoDos;
        System.out.println("El resultado de la comparación es "+resultado);

        resultado =operandoUno<=operandoDos;
        resultado =operandoUno>=operandoDos;
        resultado =operandoUno==operandoDos;
        resultado =operandoUno!=operandoDos;
        //cuanto quieres cobrar
        //cuantos años tienes
        //tienes carnet de conducir

    }

    public void operadoresLogicos(){

        int sueldo = 20000;
        int edad = 35;
        boolean conducir = true;
        System.out.println("El candidato puede conducir: "+!conducir);
        //mi candidato es valido cuando quiere cobrar menos de 30000, tiene menos de 40 años y puede conducir
        boolean candidatoValido = sueldo<30000 && edad<40 && conducir;
        candidatoValido = sueldo<20000 || edad<25 || conducir && sueldo>25000 && edad>60;
        System.out.println("El candidato es válido: " +candidatoValido);



    }

    public void evaluarCandidato(double sueldo, int edad, boolean conducir){

        boolean resultado = sueldo<=20000 && edad<40 && conducir;
        System.out.println("La evaluación del candidato es: "+resultado);


    }




}
