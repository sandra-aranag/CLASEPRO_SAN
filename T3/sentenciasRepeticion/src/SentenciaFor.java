public class SentenciaFor {

 public void sentenciaFor(){
     //inicial;final;incrementa. EN FINAL SIEMPRE MENOR O MENOR O IGUAL, NUNCA IGUAL
    /* for(int i=0; i<5; i++){
         System.out.println("Ejecutando línea");
     }*/

     //DECREMENTO
     for (int i = 100; i >= 0 ; i--) {

         if (i % 5 == 0){
             System.out.println("Ejecuciones "+i);
         }
         
     }
     
 }

 public void tablaMultiplicarNumero (int numero){
     //tabla del 6
     System.out.println("Procedemos a escribir la tabla de multiplicar del "+numero);

     for (int i = 0; i < 11; i++) {
         System.out.printf("%d * %d = %d%n",i, numero,i*numero); //la D es un número
     }


 }

public void todasTablas(){
     //1-10
    for (int i = 1; i < 11; i++) {

        System.out.println("Sacando la tabla del "+i);
        //1
        for (int j = 0; j < 11; j++) {
            System.out.printf("\t%d * %d = %d%n",j, i, i*j);
        }

    }
}

public void dibujarCuadrado(){

    for (int i = 0; i < 5; i++) { //fila
        for (int j = 0; j < 5; j++) { //columna
            if (i == 0 || i==4) {
                System.out.print("*");
            } else if (j==0 || j==4){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }


}


//Sacar cada letra de una palabra

    public void palabraPalindromo(){

     //Palabra palíndromo cuando se lee igual de principio a fin que de fin a principio (oso, ana)
        //¿Qué lógica aplicar para decirle que la lea igual?
        //Tiene que haber un boolean en algún sitio

     String frase = "alli ves sevilla";
     frase=frase.replaceAll(" ", ""); //para quitar los espacios
     boolean esPalindromo = true;

        for (int i = 0; i < frase.length()/2; i++) {
            //Comprara cada letra 0->ultimo
            //comprar cada letra 1->penultimo
            //comprara cada letra 2->antepnultimo

            char letraUno=frase.charAt(i);
            char letraDos=frase.charAt(frase.length()-1-i);

            if (letraUno!=letraDos){
                esPalindromo = false;
                break;
            }

        }

        if (esPalindromo){
            System.out.println("La palabra es palindromo");
        } else{
            System.out.println("La palabra no es palindromo");
        }



    }

    //Calcular el factorial de un número

    public void calcularFactorial(){

     //5! = 5*4*3*2*1

        int  numeroCalcular = 3;
        int factorial = 1; //porque el 1 es el mínimo
        for (int i = 1; i <= numeroCalcular; i++) {
            factorial *= i;
        }
        System.out.printf("El factorial de %d es %d", numeroCalcular, factorial);

    }

    public void recorrerColeccion(){
        int[] numero = {1,10,90,40};
        //un armario de n posiciones

        //FORMA TRADICIONAL DE ESCRIBIR UN FOR
        /*for (int i = 0; i < numero.length; i++) {
            System.out.println(numero[i]);
        }*/

        //FOR-EACH
        for( int item : numero){

            System.out.println(item);

        }

    }

}
