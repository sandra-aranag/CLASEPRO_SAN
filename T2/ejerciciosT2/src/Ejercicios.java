import javax.xml.transform.Source;
import java.util.Scanner;

public class Ejercicios {

     private Scanner lecturaTeclado;

    //EJERCICIO 1
    /* Crea un programa que pida al usuario dos números enteros por consola y muestre el
    *   el resultado de las cinco operaciones aritméticas básicas: suma, resta, multiplicación,
    * división y módulo (resto). */

    public void ejercicio1(){

        lecturaTeclado = new Scanner(System.in);
        System.out.println("Dime un número");
        int numeroUno = lecturaTeclado.nextInt();
        System.out.println("Dime otro número");
        int numeroDos = lecturaTeclado.nextInt();

        int suma = numeroUno+numeroDos;
        System.out.println("La suma de ambos números es "+suma);

        int resta = numeroUno-numeroDos;
        System.out.println("El resultado de la resta es "+resta);

        int multi = numeroUno*numeroDos;
        System.out.println("El resultado de la multiplicación es "+multi);

        double div = (double) numeroUno/numeroDos;
        System.out.println("El resultado de la división es "+div);

        int modulo = numeroUno%numeroDos;
        System.out.println("El resto de la división es "+modulo);
    }

    //EJERCICIO 2
    /* Escribe un programa que pida dos números al usuario y muestre el resultado de todas las
     * comparaciones relacionales entre ellos (mayor que, menor que, igual, diferente, mayor o
     * igual, menor o igual). */

    public void ejercicio2(){

        lecturaTeclado = new Scanner(System.in);
        System.out.println("Dime un número");
        int numeroUno = lecturaTeclado.nextInt();
        System.out.println("Dime otro número");
        int numeroDos = lecturaTeclado.nextInt();

        boolean resultado = numeroUno>numeroDos;
        System.out.println("¿" +numeroUno+ " es mayor que " +numeroDos+ "?" + " " + (numeroUno>numeroDos));

        resultado = numeroUno<numeroDos;
        System.out.println("¿" +numeroUno+ " es menor que " +numeroDos+ "?" + " " + (numeroUno<numeroDos));

        resultado = numeroUno==numeroDos;
        System.out.println("¿" +numeroUno+ " es igual que " +numeroDos+ "?" + " " + (numeroUno==numeroDos));

        resultado = numeroUno!=numeroDos;
        System.out.println("¿" +numeroUno+ " es diferente que " +numeroDos+ "?" + " " + (numeroUno!=numeroDos));

        resultado = numeroUno>=numeroDos;
        System.out.println("¿" +numeroUno+ " es mayor o igual que " +numeroDos+ "?" + " " + (numeroUno>=numeroDos));

        resultado = numeroUno<=numeroDos;
        System.out.println("¿" +numeroUno+ " es menor o igual que " +numeroDos+ "?" + " " + (numeroUno<=numeroDos));



    }

    //EJERCICIO 3
    /* Crea un programa que declare una variable con valor inicial 100 y aplique diferentes
     * operadores de asignación compuesta (+=, -=, *=, /=). Muestra el valor de la variable
     * después de cada operación */

    public void ejercicio3(){

        int valorInicial = 100;
        System.out.println("El valor inicial es: " +valorInicial);

        valorInicial +=50;
        System.out.println("Después de sumar 50 (+=): " +valorInicial);

        valorInicial -=30;
        System.out.println("Después de restar 30 (-=): " +valorInicial);

        valorInicial *=2;
        System.out.println("Después de multiplicar por 2 (*=): " +valorInicial);

        valorInicial /= (double) 4;
        System.out.println("Después de dividir entre 4 (/=): " +valorInicial);

    }

    //EJERCICIO 4
    /* Desarrolla un programa que pida un número al usuario y determine si es par o impar usando
     * el operador módulo. Muestra el resultado por consola.
    * */

    public void ejercicio4(){
        lecturaTeclado = new Scanner(System.in);
        System.out.println("Dime un número");
        int numero = lecturaTeclado.nextInt();

        int resto = numero %2;
        if (resto==0){
            System.out.println("El número " +numero+ " es par (resto al dividir entre 2: " +resto+ ")");
        } else{
            System.out.println("El número " +numero+ " es impar (resto al dividir entre 2: " +resto+ ")");
        }
        lecturaTeclado.close();
        lecturaTeclado=null;

    }

    //EJERCICIO 5
    /* Crea un programa que pida la edad del usuario y si tiene carnet de conducir (true/false). Usa
    * operadores lógicos para determinar si puede alquilar un coche (debe tener 21 años o más Y
     * tener carnet). */

    public void ejercicio5(){

        int edad=21;
        boolean conducir=true;
        lecturaTeclado=new Scanner(System.in);

        System.out.println("¿Cuántos años tienes?");
        edad =lecturaTeclado.nextInt();

        boolean mayor = edad>21;
        System.out.println("¿Eres mayor de 21 años?: "+mayor);

        System.out.println("¿Tienes carnet de conducir?");
        conducir=lecturaTeclado.nextBoolean();

        boolean alquilarCoche = edad>=21 && conducir;
        System.out.println("¿Puedes alquilar un coche? " +alquilarCoche);

    }


    //EJERCICIO 6
    /* Escribe un programa que pida el precio de un producto y el porcentaje de descuento.
     * Calcula el precio final después del descuento usando operadores aritméticos y muestra
     * todos los pasos del cálculo. */

    public void ejercicio6(){

        lecturaTeclado=new Scanner(System.in);

        System.out.println("Introduce el precio del producto: ");
        int precio = lecturaTeclado.nextInt();

        System.out.println("Introduce el porcentaje de descuento: ");
        double porcentajeDescuento = lecturaTeclado.nextDouble();

        System.out.println("El precio original es: "+precio+"€");

        double descuento = (precio*porcentajeDescuento)/100;
        System.out.println("Descuento " + "(" +porcentajeDescuento+ "%): "+descuento+"€");

        double precioFinal = precio-porcentajeDescuento;
        System.out.println("El precio final es "+precioFinal+"€");

    }

    //EJERCICIO 7
    /* Crea un programa que pida al usuario su edad y si es estudiante (true/false). Usa
     *operadores lógicos (AND, OR, NOT) para determinar si puede acceder a diferentes
     *descuentos: descuento joven (menor de 26 años), descuento estudiante, o descuento
     * especial (menor de 26 Y estudiante). */

    public void ejercicio7(){
        lecturaTeclado=new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        int edad = lecturaTeclado.nextInt();

        System.out.println("¿Eres estudiante? ");
        boolean estudiante = lecturaTeclado.nextBoolean();

        boolean menorEdad= edad<26;
        System.out.println("¿Eres menor de 26 años? "+menorEdad);

        boolean noEstudiante = !estudiante;
        System.out.println("¿NO eres estudiante? "+noEstudiante);

        boolean descuentoJoven = edad<26;
        System.out.println("¿Tienes descuento joven? (menor de 26): "+descuentoJoven);

        boolean descuentoEstudiante = estudiante;
        System.out.println("¿Tienes descuento de estudiante?: "+descuentoEstudiante);

        boolean descuentoEspecial = edad<26 && estudiante;
        System.out.println("¿Tienes descuento especial?: "+descuentoEspecial);


    }

    //EJERCICIO 8
    /* Desarrolla un programa que pida tres números al usuario y calcule: la suma
     * de los tres, el promedio, el resultado de multiplicar el primero por el
     *segundo y dividirlo entre el tercero. Usa paréntesis para controlar la
     * precedencia de operadores.
     * */

    public void ejercicio8(){

        lecturaTeclado = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        int num1=lecturaTeclado.nextInt();
        System.out.println("Introduce el segundo número: ");
        int num2=lecturaTeclado.nextInt();
        System.out.println("Introduce el tercer número: ");
        int num3=lecturaTeclado.nextInt();

        int suma=num1+num2+num3;
        System.out.println("La suma de los tres números es: "+suma);

        double promedio=suma/3;
        System.out.println("El promedio es: "+promedio);

        double multi = (num1*num2)/num3;
        System.out.println("El resultado de multiplicar los dos primeros números y dividirlo por el tercero es "+multi);

    }

    //EJERCICIO 9
    /* Escribe un programa que pida al usuario la puntuación de tres
     * exámenes. Calcula la nota media y usa operadores relacionales
     * para determinar si ha aprobado (>=5), si tiene notable (>=7), y si
     * tiene sobresaliente (>=9). Muestra todos los resultados.
     * */

    public void ejercicio9(){

        lecturaTeclado = new Scanner(System.in);

        System.out.println("Introduce la nota del primer examen: ");
        int examen1 = lecturaTeclado.nextInt();
        System.out.println("Introduce la nota del segundo examen: ");
        int examen2=lecturaTeclado.nextInt();
        System.out.println("Introduce la nota del tercer examen: ");
        int examen3=lecturaTeclado.nextInt();

        double notaMedia = (examen1+examen2+examen3)/3;
        System.out.println("La nota media es: "+notaMedia);

        boolean aprobado= notaMedia>=5;
        System.out.println("¿Has aprobado?: "+aprobado);

        boolean notable= notaMedia>=7;
        System.out.println("¿Has sacado notable?: "+notable);

        boolean sobresaliente=notaMedia>=9;
        System.out.println("¿Has sacado sobresaliente?: "+sobresaliente);



    }

    //EJERCICIO 10
    /* Crea un programa que pida el salario base por hora, las horas
     * trabajadas y si ha hecho horas extra (true/false). Si ha hecho
     * horas extra y trabajó más de 40 horas, las horas que excedan de
     * 40 se pagan al doble. Usa operadores lógicos, relacionales y
     * aritméticos para calcular el salario total.
     */

    public void ejercicio10(){

        lecturaTeclado = new Scanner(System.in);
        int horasNormales=40;

        System.out.println("Introduce el salario por hora: ");
        int salarioHora = lecturaTeclado.nextInt();
        System.out.println("Introduce las horas trabajadas: ");
        int horasTrabajadas= lecturaTeclado.nextInt();
        boolean horasExtra=horasTrabajadas>=horasNormales;
        System.out.println("¿Has hecho horas extra? "+horasExtra);
        System.out.println("Horas normales: "+horasNormales);
        int extra=horasTrabajadas-horasNormales;
        System.out.println("Horas extra: "+extra);
        System.out.println("¿Trabajaste más de 40 horas? "+horasExtra);
        boolean permitido=horasExtra;
        System.out.println("¿Tienes derecho a horas extra? "+permitido);

       boolean horasExtraAplicadas=horasTrabajadas>40 && permitido;
       System.out.println("¿Se aplican horas extra? "+horasExtraAplicadas);

       double salarioNormal = salarioHora*horasNormales;
        System.out.println("Salario por horas normales: "+salarioNormal+ "€");

        double salarioExtra = (extra*salarioHora)*2;
        System.out.println("Salario por horas extra: (el doble): "+salarioExtra+ "€");

        double salarioTotal=salarioNormal+salarioExtra;
        System.out.println("Salario total: "+salarioTotal+ "€");











    }


}




