import java.util.Scanner;

public class EjerciciosSwitch {

  Scanner scanner = new Scanner(System.in);

  /*EJERCICIO 1
    CCrea un programa que pida un número del 1 al 7 y use un switch para mostrar el día de la semana
    correspondiente (1=Lunes, 2=Martes, etc.).*/

    public void ejercicio1(){

        System.out.println("Introduce un número: ");
        int numero = scanner.nextInt();

        switch (numero){

            case 1-> {
                System.out.println("El día 1 es lunes");
            }
            case 2->{
                System.out.println("El día 2 es martes");
            }
            case 3->{
                System.out.println("El día 3 es miércoles");
            }
            case 4->{
                System.out.println("El día 4 es jueves");
            }
            case 5->{
                System.out.println("El día 5 es viernes");
            }
            case 6->{
                System.out.println("El día 6 es sábado");
            }

            case 7->{
                System.out.println("El día 7 es domingo");
            }
            default -> {
                System.out.println("Día de la semana no contemplado");
            }

        }



    }

    /*EJERCICIO 2
    Desarrolla un programa que pida una letra de calificación (A, B, C, D, F) y use un switch para mostrar el
    mensaje correspondiente: A="Excelente", B="Muy bien", C="Bien", D="Suficiente", F="Insuficiente".*/

    public void ejercicio2(){

        System.out.println("Introduce tu calificación (A-F): ");
        char calificacion = scanner.next().charAt(0);

        switch (calificacion){

            case 'A'->{
                System.out.println("Calificación A: sobresaliente");

            }
            case 'B'->{
                System.out.println("Calificación B: muy bien");
            }
            case 'C'->{
                System.out.println("Calificación C: Bien");
            }
            case 'D'->{
                System.out.println("Calificación D: Suficiente");
            }
            case 'F'->{
                System.out.println("Calificación F: Insuficiente");
            }
            default -> {
                System.out.println("Calificación no contemplada");
            }



        }



    }


    /*EJERCICIO 3
    Escribe un programa que pida dos números y una operación (+, -, *, /). Usa un switch para realizar la
    operación correspondiente y mostrar el resultado.*/

    public void ejercicio3(){

        System.out.println("Introduce el primer número: ");
        int num1 = scanner.nextInt();;
        System.out.println("Introduce el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println("Introduce la operación (+, -, *, /): ");
        char operacion = scanner.next().charAt(0);

        double calculo;
        switch (operacion){
            case '+'->{
                calculo = num1+num2;
                System.out.println("Resultado: " +num1+operacion+num2+ "=" +(int)calculo);
            }
            case '-'->{
                calculo = num1-num2;
                System.out.println("Resultado: " +num1+operacion+num2+ "=" +(int)calculo);
            }
            case '*'->{
                calculo = num1*num2;
                System.out.println("Resultado: " +num1+operacion+num2+ "=" +(int)calculo);
            }
            case '/'->{
                calculo = (double)num1/num2;
                System.out.printf("Resultado: %d%c%d = %.2f%n", num1, operacion, num2, calculo);
            }




        }

    }

    /*EJERCICIO 4
    Crea un programa que muestre un menú con 4 opciones: 1=Ver perfil, 2=Configuración, 3=Ayuda, 4=Salir.
    Pide al usuario que elija una opción y usa un switch para mostrar el mensaje correspondiente a cada opción.*/

    public void ejercicio4(){

        System.out.println("--- MENÚ ---\n 1. Ver perfil\n 2. Configuración\n 3. Ayuda\n 4. Salir\n Elije una opción: ");
        int opcion = scanner.nextInt();

        switch(opcion){
            case 1->{
                System.out.println("Has seleccionado: ver perfil");
            }

            case 2->{
                System.out.println("Has seleccionado: configuración");
            }

            case 3->{
                System.out.println("Has seleccionado: ayuda");
            }
            case 4->{
                System.out.println("Has seleccionado: salir");
            }
            default -> {
                System.out.println("Opción incorrecta");
            }







        }




    }

    /*EJERCICIO 5
    Desarrolla un programa que pida un mes (número del 1 al 12) y use un switch para determinar la estación del año:
    Invierno (12, 1, 2), Primavera (3, 4, 5), Verano (6, 7, 8), Otoño (9, 10, 11).*/

    public void ejercicio5(){

        System.out.println("Introduce el número del mes (1-12):");
        int mes = scanner.nextInt();

        String estacion;
        switch (mes){

            case 12,1,2 ->{
                estacion="Invierno";
            }

            case 3,4,5->{
                estacion="Primavera";
            }

            case 6,7,8->{
                estacion="Verano";
            }

            case 9,10,11->{
                estacion="Otoño";
            }
            default -> {
                estacion="Debe ser entre 1 y 12";
            }



        }

        if(mes >= 1 && mes <=12){
            System.out.println("El mes " +mes+ " se corresponde a: " +estacion);
        } else {
            System.out.println("Mes no válido: "+estacion);
        }

    }

    /*EJERCICIO 6
    Escribe un programa que pida un número y use un bucle for para mostrar su tabla de multiplicar del 1 al 10.*/

    public void ejercicio6(){

        System.out.println("Introduce un número del 1 al 10: ");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <=10){
            System.out.println("Tabla de multiplicar del " +numero);

            for (int j = 0; j < 11; j++) {
                    System.out.printf("\t%d * %d = %d%n",numero, j, numero*j);
            }


        } else {
            System.out.println("Número no contemplado. Debe ser entre el 1 y el 10.");
        }



    }

     /*EJERCICIO 7
   Crea un programa que pida un número N y use un bucle for para calcular la suma de todos los números desde 1 hasta N. 
   Muestra el resultado final.*/

    public void ejercicio7(){

        System.out.println("Introduce un número: ");
        int numero = scanner.nextInt();
        StringBuilder texto = new StringBuilder("Sumando: ");
        int suma = 0;
        for (int i = 1; i <= numero; i++) {
            suma += i;
            texto.append(i);
            if (i<numero){
                texto.append(" + ");
            }

        }
        System.out.println(texto);
        System.out.println("La suma de los mumeros del 1 al " +numero+ " es " +suma);
        
    }


    /*EJERCICIO 8
   Desarrolla un programa que pida un número N y use un bucle for para contar cuántos números pares e impares hay
   desde 1 hasta N. Muestra ambos contadores.*/

    public void ejercicio8(){

        System.out.println("Introduce un número del 1 al 10: ");
        int numero = scanner.nextInt();

        int par = 0;
        int impar = 0;

        System.out.println("Recorriendo números del 1 al " +numero+ "...");

        for (int i = 1; i <= numero; i++) {

            if (i % 2==0){
                par++;
            } else{
                impar++;
            }

        }
        System.out.println("Número de pares encontrados: "+par);
        System.out.println("Número de impares encontrados: "+impar);

    }

    /*EJERCICIO 9
   Escribe un programa que pida un número entero positivo y calcule su factorial usando un bucle for. El factorial
   de N es: N! = N × (N-1) × (N-2) × ... × 1*/

    public void ejercicio9(){

        System.out.println("Introduce un número: ");
        int n = scanner.nextInt();


        if (n<0){
            System.out.println("El número debe ser positivo.");
        } else{
            System.out.println("Calculando " +n+ "!");
            long factorial = 1; //usamos long porque el resultado puede ser grande.
            StringBuilder proceso = new StringBuilder();


            for (int i = n; i >= 1; i--) {

                factorial = factorial*i;
                proceso.append (i);

                if (i>1){
                    proceso.append("x"); //si no es el ultimo numero añadimos la x
                }



            }
            System.out.println(proceso);
            System.out.println("El factorial de " +n+ " es: " +factorial);
        }




    }


    /*EJERCICIO 10
   Crea un programa que muestre un menú con 3 tipos de ejercicios: 1=Flexiones, 2=Abdominales, 3=Sentadillas. Pide al
   usuario que elija un ejercicio y cuántas repeticiones quiere hacer. Usa un switch para determinar el ejercicio y un
   for para contar las repeticiones una a una.*/

    public void ejercicio10(){

        System.out.println("--- EJERCICIOS ---\n 1. Flexiones\n 2. Abdominales\n 3. Sentadillas");
        System.out.println("Elige un ejercicio (1-3): ");
        int ejercicio = scanner.nextInt();
        System.out.println("¿Cuántas repeticiones?");
        int repeticion = scanner.nextInt();

        String tipoEjercicio;
        switch (ejercicio){

            case 1->{
                tipoEjercicio="flexiones";
            }
            case 2->{
                tipoEjercicio="abdominales";
            }
            case 3->{
                tipoEjercicio="sentadillas";
            }
            default ->{
                tipoEjercicio="Ejercicio no contemplado";
            }

        }
        System.out.println("Has elegido: " +tipoEjercicio);
        for (int i = 1; i <= repeticion; i++) {
            System.out.println("Repetición " +i+ " completada");
        }
        System.out.println("¡Enhorabuena! Has hecho " +repeticion+" "+tipoEjercicio);
        }



    }


