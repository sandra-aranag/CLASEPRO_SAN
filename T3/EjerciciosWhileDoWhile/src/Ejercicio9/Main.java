package Ejercicio9;

import java.util.Scanner;

public class Main {

    /*Crea un programa que pida al usuario cuántos estudiantes hay en una clase. Para cada estudiante, usa un bucle
    while para pedir su calificación numérica (0-10). Luego, usa un bucle for para mostrar todas las calificaciones
    y usa un switch para convertir cada nota numérica en letra: 9-10=A, 7-8=B, 5-6=C, 3-4=D, 0-2=F.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuántos estudiantes hay?");
        int numEstudiantes = scanner.nextInt();
        int[] notas = new int[numEstudiantes];
        int estudiante = 0, nota=0;

        while (estudiante<numEstudiantes){
            System.out.println("Introduce la nota del estudiante " +(estudiante + 1)+ " (0-10):");
            nota = scanner.nextInt();

            if (nota >= 0 && nota <=10){
                notas[estudiante] = nota;
                estudiante++;
            }else{
                System.out.println("Nota inválida. Debe ser entre 0 y 10");
            }


        }
        System.out.println("–––– REPORTE DE CALIFICACIONES ––––");
        for (int i = 0; i < numEstudiantes; i++) {
            nota = notas[i];
            String letraNota;

            switch (nota){
                case 9,10-> letraNota="A";
                case 7,8-> letraNota="B";
                case 5,6-> letraNota="C";
                case 3,4-> letraNota="D";
                default -> letraNota="F";
            }


            System.out.println("Estudiante " +(i+1)+ ": " +nota+ " puntos = Calificación " +letraNota);

        }
        scanner.close();
    }

}
