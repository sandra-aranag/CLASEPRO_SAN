import java.util.Scanner;

public class Ejercicios {
    Scanner scanner = new Scanner(System.in);
    /*EJERCICIO 1
    Crea un programa que pida la edad del usuario y determine si es mayor de edad (18 años o más).
    Muestra un mensaje indicando si puede votar o no.*/
    public void ejercicio1(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        int edad = scanner.nextInt();

        String votar;
        if (edad>=18){
            votar="Eres mayor de edad. Puedes votar.";
        } else{
            votar="No eres mayor de edad. No puedes votar";
        }

        System.out.println(votar);

    }

    /*EJERCICIO 2
    Desarrolla un programa que pida un número al usuario y determine si es positivo, negativo o cero.
    Muestra el resultado por consola.*/
    public void ejercicio2(){
        System.out.println("Introduce un número: ");
        int numero = scanner.nextInt();


        if (numero > 0){
            System.out.println("El número es positivo.");
        } else if (numero == 0){
            System.out.println("El número es cero.");
        } else {
            System.out.println("El número es negativo.");
        }
    }

    /*EJERCICIO 3
    Escribe un programa que pida la nota de un examen (entre 0 y 10) y determine si el alumno ha aprobado
    (nota mayor o igual a 5) o ha suspendido..*/

    public void ejercicio3(){
        System.out.println("Introduce tu nota del examen: ");
        double nota = scanner.nextDouble();

        if (nota >=5){
            System.out.println("¡Enhorabuena! Has aprobado.");
        } else{
            System.out.println("Has suspendido :(");
        }

    }

    /*EJERCICIO 4
    Crea un programa que pida el importe de una compra. Si el importe es mayor o igual a 100€,
    aplica un descuento del 10%. Muestra el importe original y el importe final a pagar.*/

    public void ejercicio4(){
        System.out.println("Introduce el importe de la compra: ");
        double precio = scanner.nextDouble();
        double descuento = precio*0.10;
        double precioFinal=precio-descuento;

        if (precio >=100){
            System.out.println("Importe original: "+precio);
            System.out.println("Descuento aplicado: "+descuento);
            System.out.println("Importe final "+precioFinal);
        } else{
            System.out.println("El importe de tu compra es de: "+precio);
        }

    }

    /*EJERCICIO 5
    Desarrolla un programa que pida un número entero y determine si es par o impar usando el operador módulo.
    Muestra un mensaje personalizado para cada caso.*/

    public void ejercicio5(){

        System.out.println("Introduce un número: ");
        int numero = scanner.nextInt();
        int resto = numero%2;

        if (resto==0){
            System.out.println("El número " +numero+ " es par");
        } else {
            System.out.println("El número " +numero+ " es impar");
        }


    }

    /*EJERCICIO 6
    Escribe un programa que pida la edad del usuario y determine si puede acceder a contenido para mayores de 16 años.
    Si tiene 16 o más años, muestra "Acceso permitido", si no, muestra "Acceso denegado".*/

    public void ejercicio6(){
        System.out.println("Introduce tu edad: ");
        int edad = scanner.nextInt();

        if (edad >= 16){
            System.out.println("Acceso permitido");
        } else{
            System.out.println("Acceso denegado. Debes tener al menos 16 años");
        }
    }

     /*EJERCICIO 7
   Crea un programa que pida una nota numérica (0-10) y determine la calificación: Suspenso (0-4), Aprobado (5-6),
   Notable (7-8) o Sobresaliente (9-10)..*/

    public void ejercicio7(){

        System.out.println("Introduce tu nota: ");
        int nota = scanner.nextInt();

        String resultadoExamen;
        if (nota>0 && nota<=10) {
            if (nota<5) {

                resultadoExamen="suspenso";
            } else if (nota < 8) {

                resultadoExamen="aprobado";
            } else if (nota < 9) {

                resultadoExamen="notable";
            } else if (nota < 10) {

                resultadoExamen="sobresaliente";
            } else {

                resultadoExamen="MH";
            }
        } else {
            resultadoExamen = "Fuera de rango";
        }

        System.out.println(resultadoExamen);

    }


     /*EJERCICIO 8
   Desarrolla un programa que pida dos números al usuario y determine cuál es mayor, o si son iguales.
   Muestra el resultado por consola.*/

    public void ejercicio8(){

        System.out.println("Introduce el primer número: ");
        int primerNumero = scanner.nextInt();
        System.out.println("Introduce el segundo número: ");
        int segundoNumero = scanner.nextInt();

        if (primerNumero > segundoNumero){
            System.out.println("El número " +primerNumero+ " es mayor que " +segundoNumero);
        } else if (primerNumero < segundoNumero){
            System.out.println("El número " +primerNumero+ " es menor que " +segundoNumero);
        } else{
            System.out.println("Los números son iguales");
        }


    }

      /*EJERCICIO 9
   Escribe un programa que pida el peso (en kg) y la altura (en metros) del usuario. Calcula el IMC (peso / altura²)
   y determina si está en peso normal (IMC entre 18.5 y 24.9), por debajo del peso normal (IMC menor a 18.5) o por
   encima del peso normal (IMC mayor a 24.9).*/

    public void ejercicio9(){

        System.out.println("Introduce tu peso en kilos: ");
        double peso = scanner.nextDouble();
        System.out.println("Introduce tu altura en metros: ");
        double altura = scanner.nextDouble();

        double imc = peso/(altura*altura);
        System.out.printf("Tu IMC es de: %.2f\n",imc);

        if (imc >=18.5 && imc <= 24.9){
            System.out.println("Estás en tu peso normal");
        } else if (imc < 18.5){
            System.out.println("Estás por debajo de tu peso normal");
        } else {
            System.out.println("Estás por encima de tu peso normal");
        }

    }

  /*EJERCICIO 10
   Crea un programa que pida la altura del usuario (en cm) y determine si puede subir a una atracción. La altura
   mínima es 120 cm y la máxima es 200 cm. Si está dentro del rango, muestra "Puedes subir", si no, indica el motivo
   (demasiado bajo o demasiado alto).*/

    public void ejercicio10(){

        System.out.println("Introduce tu altura en centímetros: ");
        int altura = scanner.nextInt();

        if(altura >= 120 && altura <= 200){
            System.out.println("Puedes subir a la actracción");
        } else if (altura < 120){
            System.out.println("No puedes subir a la atracción. La altura mínima es de 120cm.");
        } else {
            System.out.println("No puedes subir a la atracción. La altura máxima son 200cm.");
        }

    }

/*EJERCICIO 11
   Desarrolla un programa que pida el importe de una compra y si el cliente es socio (true/false). Aplica descuentos
   según estas reglas: Si es socio Y la compra es mayor o igual a 200€, descuento del 20%. Si es socio Y la compra es
   menor de 200€, descuento del 10%. Si NO es socio pero la compra es mayor o igual a 300€, descuento del 5%. En
   cualquier otro caso, no hay descuento. Muestra el importe original, el descuento aplicado y el importe final.*/

    public void ejercicio11(){

        System.out.println("Introduce el importe de la compra: ");
        double importeCompra = scanner.nextDouble();
        System.out.println("¿Eres socio?: ");
        boolean socio = scanner.nextBoolean();
        System.out.println("El importe original de tu compra es: "+importeCompra);

        double descuento=0;

        if(socio && importeCompra >= 200){
            descuento=0.2;
        } else if (socio && importeCompra <=200){
            descuento=0.1;
        } else if (!socio && importeCompra >=300){
            descuento=0.03;
        } else{
            System.out.println("No hay descuento");
        }

        double descuentoAplicado = importeCompra*descuento;
        double importeFinal=importeCompra-descuentoAplicado;

        System.out.println("El descuento aplicado es: "+descuentoAplicado);
        System.out.println("El importe final "+importeFinal);

    }

    /*EJERCICIO 12
   Crea un programa que pida al usuario crear una contraseña. La contraseña debe cumplir estos requisitos: tener
   al menos 8 caracteres de longitud, contener al menos un número, y NO puede ser "12345678" o "password". El programa
   debe verificar cada condición por separado usando operadores lógicos y mostrar si la contraseña es válida o no,
   indicando qué requisitos no cumple.
    Nota: Para este ejercicio, asume que tienes funciones auxiliares como longitudCadena(texto), contienNumero(texto).*/

    public void ejercicio12(){

        System.out.println("Introduce tu contraseña: ");
        String password = scanner.nextLine();
        System.out.println("Longitud de la contraseña: " +password.length());

        boolean longitudMin = password.length() > 7;
        boolean containNum = password.matches(".*[0-9].*");
        boolean noValido = password.equals("12345678") || password.equals("password");
        boolean valida = longitudMin && !noValido && containNum;

        System.out.println("¿Tiene al menos 8 caracteres? " +longitudMin);
        System.out.println("¿Contiene al menos un número? " +containNum);
        System.out.println("¿Es una contraseña prohibida? " +noValido);
        System.out.println("¿Es válida? " +valida);

        if (valida){
            System.out.println("Contraseña válida");
        } else if (!longitudMin) {
            System.out.println("Contraseña no válida. Debe tener al menos 8 caracteres.");
        } else if (!containNum) {
            System.out.println("Contraseña no válida. Debe contener al menos un número");
        } else {
            System.out.println("Contraseña no válida. Debe contener letras y números.");
        }

        scanner.close();
        scanner=null;
    }

    /*EJERCICIO 13
   Escribe un programa para calcular el precio de entrada a un museo. Pide la edad del usuario y el día de la semana
   (1=Lunes, 2=Martes... 7=Domingo). Las reglas son: Menores de 12 años: entrada gratis. Entre 12 y 17 años: 5€
   (pero gratis los martes). Entre 18 y 64 años: 10€ (pero 7€ los jueves). 65 años o más: 6€. Usa operadores lógicos
   para determinar el precio correcto y muestra el cálculo..*/

    public void ejercicio13(){

        System.out.println("Introduce tu edad: ");
        int edad = scanner.nextInt();
        System.out.println("Introduce el día de la semana (1-7): ");
        int dia = scanner.nextInt();

        System.out.println("Edad: "+edad);

        String diaSemana;
        if (dia == 1){
            diaSemana = "1 (Lunes)";
        } else if (dia == 2){
            diaSemana = "2 (Martes)";
        } else if (dia == 3){
            diaSemana = "3 (Miércoles)";
        } else if (dia == 4) {
            diaSemana = "4 (Jueves)";
        } else if (dia == 5){
            diaSemana = "5 (Viernes)";
        } else if (dia == 6){
            diaSemana = "6 (Sábado)";
        } else if (dia == 7){
            diaSemana = "7 (Domingo)";
        } else {
            diaSemana = "Día incorrecto";
        }
        System.out.println("Día de la semana: " +diaSemana);

       boolean menorEdad = edad<12;
       boolean adolescentes = edad >= 12 && edad <= 17;
       boolean adultos = edad >= 18 && edad <=  64;
       boolean imserso = edad >= 65;
       boolean martes = dia == 2;
       boolean jueves = dia == 4;

        System.out.println("¿Eres menor de edad?: " +menorEdad);
        System.out.println("¿Tienes entre 12 y 17?: " +adolescentes);
        System.out.println("¿Tienes entre 18 y 64?: " +adultos);
        System.out.println("¿Tienes más de 65 años?: " +imserso);
        System.out.println("¿Es martes?: " +martes);
        System.out.println("¿Es jueves?: " +jueves);

       int precio;
        if (menorEdad) {
            precio=0;
            System.out.println("Entrada gratuita.");
        } else if (adolescentes){
            if(martes){
                precio=0;
                System.out.println("Entrada gratis por ser martes");
            } else {
                precio=5;
                System.out.println("Entrada 5€");
            }
        } else if (adultos){
            if(jueves){
                precio=7;
                System.out.println("Precio de entrada 7€ por ser jueves");
            } else {
                precio=10;
                System.out.println("Entrada 10€");
            }
        } else {
            precio=6;
            System.out.println("Entrada 6€ por ser mayor de 65 años.");
        }
        scanner.close();
        scanner=null;
        }


        /*EJERCICIO 14
   Desarrolla un programa que determine si una persona es elegible para un préstamo bancario. Pide: edad, ingresos
   mensuales (€), y si tiene deudas pendientes (true/false). Los requisitos son: Edad entre 21 y 65 años, ingresos
   mensuales de al menos 1000€, y NO tener deudas pendientes. El programa debe evaluar cada condición y mostrar si
   es elegible o no, explicando qué requisitos no cumple.*/

    public void ejercicio14(){

        System.out.println("Introduce tu edad: ");
        int edad = scanner.nextInt();
        System.out.println("Introduce tus ingresos mensuales: ");
        int ingresosMensuales = scanner.nextInt();
        System.out.println("¿Tienes deudas pendientes? (true/false): ");
        boolean deudasPendientes = scanner.nextBoolean();

        boolean edadPermitida = edad >= 21 && edad <=65;
        boolean ingresosMinimos = ingresosMensuales >= 1000;
        boolean elegible = edadPermitida && ingresosMinimos && !deudasPendientes;

        System.out.println("¿Edad entre 21 y 65? " +edadPermitida);
        System.out.println("¿Ingresos de al menos 1000€? " +ingresosMinimos);
        System.out.println("¿Sin deudas pendientes? " +deudasPendientes);
        System.out.println("¿Eres elegible para el préstamo? " +elegible);

        if (elegible){
            System.out.println("¡Felicidades! Eres elegible para el préstamo.");
        } else if (deudasPendientes){
            System.out.println("Lo sentimos. No eres elegible para el préstamo al tener deuda pendientes");
        } else if (!ingresosMinimos){
            System.out.println("Lo sentimos. No eres elegible para el préstamo al no cumplir con el mínimo de ingresos.");
        } else if (edad < 21){
            System.out.println("Lo sentimos, pero no cumples con el mínimo de edad");
        } else {
            System.out.println("Lo sentimos, pero tienes más de 65 años.");
        }


        scanner.close();
        scanner=null;



    }


    /*EJERCICIO 15
   Crea un programa que calcule el coste de envío de un paquete. Pide: peso del paquete (kg), distancia de envío (km),
   y si es envío urgente (true/false). Las reglas son: Precio base: 5€. Si el peso es mayor de 5kg, añadir 2€ por cada
   kg adicional. Si la distancia es mayor de 100km, añadir 10€. Si es envío urgente, multiplicar el precio total por 1.5.
   Muestra todos los cálculos paso a paso.*/

    public void ejercicio15(){

        System.out.println("Introduce el peso del paquete (kg): ");
        double peso = scanner.nextDouble();
        System.out.println("Introduce la distancia del envío (km): ");
        double distancia = scanner.nextDouble();
        System.out.println("¿Es envío urgente?: ");
        boolean envioUrgente = scanner.nextBoolean();





        double precioBase = 5.0;
        double pesoExceso = 0.0;
        if (peso > 5){
            pesoExceso = peso - 5;
        }
        double costePeso = pesoExceso * 2;

        double costeDistancia;
        if (distancia > 100){
            costeDistancia = 10.0;

        } else {
            costeDistancia = 0.0;
        }

        double subtotal = precioBase + costePeso + costeDistancia;

        double total;
        if (envioUrgente){
            total = subtotal * 1.5;
        } else{
            total = subtotal;
        }

        double recargo = total - subtotal;

        System.out.println("Precio base: " +precioBase+ "€");
        System.out.println("Peso: " +peso+ "kg");
        System.out.println("Distancia: " +distancia+ "km");
        System.out.println("Coste adicional por distancia: " +costeDistancia);
        System.out.println("Subtotal: " +subtotal);
        System.out.println("¿Es envío urgente?:" +envioUrgente);
        System.out.println("Recargo por urgencia: " +recargo);
        System.out.println("Coste total de envío: " +total);



        scanner.close();
        scanner=null;



    }
















}



