package ejerciciosPalabras;

import java.util.Scanner;

public class Main {

    /*
    * Pedir por consola una frase. Una vez introducida, indicar:
    * 1. Cuantas oraciones tiene
    * 2. Cuantas letras tiene
    * 3. Cuantas palabras tiene
    * 4. Cuantas letras tiene cada oración (sin contar espacios ni simbolos de puntuación)
    * */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica la frase que quieres analizar");
        String frase = scanner.nextLine();
        //Esto es solo una oración. Esta es la segunda oración
        //System.out.println("La frase es: "+frase);
        String[] frases = frase.split("\\."); //el punto. es un caracter especial y por eso hay que poner doble barra invertida.
        //si no lo trata como un carácter espcial y no lo lee
        //Cuantas letras tiene
        String frasePalabras = frase.replaceAll(" ", "").
                replaceAll(",", "").replaceAll("\\.", "");

        // 3. Cuantas palabras tiene
        String palabraFrase = frase.replaceAll("\\s", " ").
                replaceAll(",", " ");
        String[] palabras = palabraFrase.split(" ");

        System.out.println("El número de oraciones es: "+frases.length);
        System.out.println("El número de letras es: " +frasePalabras.length());
        System.out.println("El número de palabras es: "+palabras.length);

        //4. Cuantas letras tiene cada oración


        for (String item : frases){
            int contador = item.split(" ").length;
            System.out.println("El número de palabras de la oración es: " +contador);


        }







    }

}
